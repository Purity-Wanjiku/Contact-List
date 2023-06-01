package com.collections.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.collections.contacts.databinding.ActivityMainBinding
import com.collections.contacts.databinding.ContactListBinding

class ContactRvAdapter(var contactList:List<Contacts>):RecyclerView.Adapter<ContactViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var binding=ContactListBinding.inflate(LayoutInflater.from(parent.context))
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var item=contactList.get(position)
        holder.binding.ivAvatar.toString()
        holder.binding.tvName.text=item.fullnames
        holder.binding.tvPhoneNumber.text=item.phoneNumber
        holder.binding.tvEmail.text=item.emailaddress
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class  ContactViewHolder(var binding: ContactListBinding):RecyclerView.ViewHolder(binding.root){

}