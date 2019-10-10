package com.example.testrxandretro.ui.main2.dog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrxandretro.R
import com.example.testrxandretro.data.model.DogModel
import com.squareup.picasso.Picasso


class DogRecyclerAdapter(var recyclerClickItem: RecyclerClickItem) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var dogs: DogModel?=null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemdog, parent, false)

        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(dogs!!.message!!.isNotEmpty())
        (holder as PostViewHolder).bind(dogs!!.breedName!!,dogs!!.message!![position],recyclerClickItem)

    }

    override fun getItemCount(): Int {
        return if(dogs==null) return 0 else return dogs!!.message!!.size
    }

    fun setPosts(dog: DogModel) {

        this.dogs = dog
        notifyDataSetChanged()
    }

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var textItemBreedName: TextView = itemView.findViewById(R.id.textItemBreedName)
        private var imageItemBreed : ImageView =itemView.findViewById(R.id.imageItemBreed)
        private var cardview: CardView =itemView.findViewById(R.id.cardview)

        fun bind(dogs: String,img:String,recyclerClickItem : RecyclerClickItem) {
            textItemBreedName.text = dogs
            if(img!=null){
                Picasso.get().load(img).into(imageItemBreed)
            }
            cardview.setOnClickListener {
                recyclerClickItem.doThis(img)
            }

        }



    }
}