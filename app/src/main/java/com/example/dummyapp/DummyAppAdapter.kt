package com.example.dummyapp

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items.view.*

class DummyAppAdapter(
    var res:Resources, var value:Array<String>
) : RecyclerView.Adapter<DummyAppAdapter.DummyAppViewHolder>(){

   inner class DummyAppViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
       var textView:TextView

       init {
           textView = itemView.findViewById<View>(R.id.tv_item) as TextView
       }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DummyAppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return DummyAppViewHolder(view)
    }

    override fun onBindViewHolder(holder: DummyAppViewHolder, position: Int) {
        holder.itemView.apply {
            tv_item.text = value[position]

        }
    }

    override fun getItemCount(): Int {
        return value.size
    }

}