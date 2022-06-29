package com.promedia.whatsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.promedia.whatsapp.adapter.ContactAdapter
import com.promedia.whatsapp.databinding.FragmentCallsBinding

class CallsFragment : Fragment() {
    private var _b : FragmentCallsBinding? = null
    private val b get() = _b!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentCallsBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this.context)
        //Coloca cada item en una rejilla
        //val manager = GridLayoutManager(this, 2)
        val decoration = DividerItemDecoration(this.context, manager.orientation)
        b.recycleViewCalls.layoutManager = manager
        b.recycleViewCalls.addItemDecoration(decoration)
        b.recycleViewCalls.layoutManager = LinearLayoutManager(this.context)
        b.recycleViewCalls.adapter = ContactAdapter(ContactProvider.ContactList)

    }

}