package com.example.foodknowledge

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var fruitArraylist: ArrayList<Fruits>, var context: Activity) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private lateinit var myListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }


    fun setItemClickListener(listener: onItemClickListener) {
        myListener = listener
    }

    override

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachrow, parent, false)
        return MyViewHolder(itemView, myListener)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentItem = fruitArraylist[position]
        holder.fName.text = currentItem.fruitName
        holder.fImage.setImageResource(currentItem.FruitImage)


    }

    override fun getItemCount(): Int {
        return fruitArraylist.size


    }

    class MyViewHolder(itemView: View, listener: onItemClickListener) :
        RecyclerView.ViewHolder(itemView) {
        val fName = itemView.findViewById<TextView>(R.id.FruitName)
        val fImage = itemView.findViewById<ImageView>(R.id.FruitImage)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }

        }


    }
}