package com.collections.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.collections.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contacts1 = Contacts("","Njoki Dee","254672","dee@yahoo.com")
        var contacts2 = Contacts("","Bill Gates","254789","dee@yahoo.com")
        var contacts3 = Contacts("","Njoki Dee","254656","dee@yahoo.com")
        var contacts4 = Contacts("","Njoki Dee","254672","dee@yahoo.com")
        var contacts5 = Contacts("","Njoki Dee","254672","dee@yahoo.com")
        var lists = listOf<Contacts>(contacts1,contacts2,contacts3,contacts4,contacts5)

        binding.rvTweet.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val namesAdapter= ContactRvAdapter(lists)
        binding.rvTweet.adapter=namesAdapter
    }

}