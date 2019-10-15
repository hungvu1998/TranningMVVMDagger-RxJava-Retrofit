package com.example.testrxandretro.ui.main2.dog

import android.annotation.SuppressLint
import android.graphics.*
import android.os.AsyncTask
import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrxandretro.R
import com.example.testrxandretro.data.model.BreedModel
import com.example.testrxandretro.util.Utils
import com.squareup.picasso.Picasso
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.io.ByteArrayOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.nio.ByteBuffer










class DogRecyclerAdapter(var recyclerClickItem: RecyclerClickItem,var utils: Utils) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var arrayBreedModel: ArrayList<BreedModel> = ArrayList()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemdog, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PostViewHolder).bind(arrayBreedModel!![position],recyclerClickItem,utils)

    }

    override fun getItemCount(): Int {
        return arrayBreedModel.size
    }


    fun setBreedList(arrayBreedModel: ArrayList<BreedModel>){
        this.arrayBreedModel = arrayBreedModel
        notifyDataSetChanged()
    }

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var textItemBreedName: TextView = itemView.findViewById(R.id.textItemBreedName)
        private var imageItemBreed : ImageView =itemView.findViewById(R.id.imageItemBreed)
        private var cardview: CardView =itemView.findViewById(R.id.cardview)

        @SuppressLint("CheckResult")
        fun bind(breedModel: BreedModel, recyclerClickItem : RecyclerClickItem, utils: Utils) {
            textItemBreedName.text = breedModel.breedName
            val hasConnection = utils.isConnectedToInternet()

                if(hasConnection){
                    Observable.fromCallable<Any>{
                        download_img(breedModel.img)
                    }
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe{bitmap->
                            if(bitmap!=null) {
                                val bitmap_=bitmap as Bitmap
                                val size = bitmap_.getRowBytes() * bitmap_.getHeight()
                                val byteBuffer = ByteBuffer.allocate(size)
                                bitmap_.copyPixelsToBuffer(byteBuffer)
                                breedModel.imgbyte=byteBuffer.array()
                                imageItemBreed.setImageBitmap(bitmap)
                            }
                        }
                }



            cardview.setOnClickListener {
                recyclerClickItem.doThis(breedModel.img)
            }

        }
        fun convertByteToBitmap(imgbyte: ByteArray):Bitmap?{
            val yuvimage = YuvImage(imgbyte, ImageFormat.NV21, 100, 100, null)
            val baos  = ByteArrayOutputStream()
            yuvimage.compressToJpeg( Rect(0, 0, 100, 100), 80, baos)
            val jdata = baos.toByteArray()
             return BitmapFactory.decodeByteArray(jdata, 0,jdata.size)
        }
        fun download_img(url:String):Bitmap?{
            var bmp:Bitmap?=null
            try {
                var urln=URL(url)
                val con =urln.openConnection() as HttpURLConnection
                val iss=con.inputStream
                bmp =BitmapFactory.decodeStream(iss)
            }
            catch (e : Exception){

            }
            return bmp
        }


    }


}