package com.example.testrxandretro.ui.main2.dog

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
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
import com.squareup.picasso.Picasso
import java.net.HttpURLConnection
import java.net.URL


class DogRecyclerAdapter(var recyclerClickItem: RecyclerClickItem) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var arrayBreedModel: ArrayList<BreedModel> = ArrayList()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemdog, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PostViewHolder).bind(arrayBreedModel!![position],recyclerClickItem)

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

        fun bind(breedModel: BreedModel,recyclerClickItem : RecyclerClickItem) {

            textItemBreedName.text = breedModel.breedName



//                    Observable.fromCallable<Any>{
//                        download_img(breedModel.img)
//                    }
//                        .subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe{
//                            if(it!=null)
//                            imageItemBreed.setImageBitmap(it as Bitmap)
//                        }
                Picasso.get().load(breedModel.img).into(imageItemBreed)


            cardview.setOnClickListener {
                recyclerClickItem.doThis(breedModel.img)
            }

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