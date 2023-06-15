package com.collections.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.collections.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addContactButton = findViewById<Button>(R.id.FABAddContact)
        addContactButton.setOnClickListener {
            val intent = Intent(this, inputcontact::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contacts1 = Contacts("https://images.unsplash.com/photo-1518020382113-a7e8fc38eac9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1434&q=80","Njoki Dee","254672","dee@yahoo.com")
        var contacts2 = Contacts("https://images.unsplash.com/photo-1517423568366-8b83523034fd?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80","Bill Gates","254789","dee@yahoo.com")
        var contacts3 = Contacts("https://images.unsplash.com/photo-1530041539828-114de669390e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1374&q=80","Njoki Dee","254656","dee@yahoo.com")
        var contacts4 = Contacts("https://images.unsplash.com/photo-1517519014922-8fc06b814a0e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=436&q=80","Njoki Dee","254672","dee@yahoo.com")
        var contacts5 = Contacts("https://images.unsplash.com/photo-1523626797181-8c5ae80d40c2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=435&q=80","Njoki Dee","254672","dee@yahoo.com")
        var lists = listOf<Contacts>(contacts1,contacts2,contacts3,contacts4,contacts5)

        binding.rvTweet.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val namesAdapter= ContactRvAdapter(lists)
        binding.rvTweet.adapter=namesAdapter


    }



}