package com.example.recycleapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class recyclerViewAdapter(private val messages: ArrayList<String>):

    RecyclerView.Adapter<recyclerViewAdapter.MessageViewHolder>() {
       class MessageViewHolder(itemsView: View) :RecyclerView.ViewHolder(itemsView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
      return MessageViewHolder(
          LayoutInflater.from(parent.context).inflate(R.layout.row_layout , parent , false)
      )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]
        holder.itemView.apply {

          //tv.text = message
        }
    }


    override fun getItemCount() = messages.size

    }






