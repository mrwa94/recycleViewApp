package com.example.recycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private var recycler: RecyclerView? = null
    private lateinit var clRoot: LinearLayout
    private lateinit var rvMain: RecyclerView
    private lateinit var messageField: EditText
    private lateinit var submitButton: Button
    private lateinit var messages: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.adapter = recyclerViewAdapter(messages)
        rvMain.layoutManager = LinearLayoutManager(this)

        messageField = findViewById(R.id.editText)
        submitButton = findViewById(R.id.sentButton)

        submitButton.setOnClickListener { addMessage() }


    }

    private fun addMessage(){
        val msg = messageField.text.toString()
        if(msg.isNotEmpty()){
            messages.add(msg)
            messageField.text.clear()
            messageField.clearFocus()
            rvMain.adapter!!.notifyDataSetChanged()
        }else{
            Snackbar.make(clRoot, "Please enter Message", Snackbar.LENGTH_LONG).show()
        }
    }

}



