package com.promedia.whatsapp.adapter

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.promedia.whatsapp.R
import com.promedia.whatsapp.Contact
import com.promedia.whatsapp.databinding.ItemContactBinding


class ContactViewHolder (view:View):RecyclerView.ViewHolder(view) {
    val b = ItemContactBinding.bind(view)
    fun render(ContactModel: Contact){
        b.tvName.text = ContactModel.name
        b.tvLastCall.text = ContactModel.lastCall
        b.tvLastMsg.text = ContactModel.lastMsg
        Glide.with(b.ivContact.context)
            .load(ContactModel.photo)
            .error(R.drawable.cam_icon)
            .into(b.ivContact)
        b.ivContact.setOnClickListener {
            Toast.makeText(b.ivContact.context, ContactModel.name,Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(b.ivContact.context, ContactModel.lastMsg,Toast.LENGTH_SHORT).show()
        }
    }
}