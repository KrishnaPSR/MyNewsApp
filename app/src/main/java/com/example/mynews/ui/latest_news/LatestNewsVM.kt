package com.example.mynews.ui.latest_news

import androidx.lifecycle.ViewModel
import com.example.mynews.Navigation.navigateWithId
import com.example.mynews.R
import com.example.mynews.adapter.GenericAdapter
import com.example.mynews.databinding.ItemNewsBinding

class LatestNewsVM: ViewModel() {
    val adapter = object : GenericAdapter<ItemNewsBinding, String>(){
        override fun getResourceLayoutId() = R.layout.item_news
        override fun onBindHolder(holder: ItemNewsBinding, dataClass: String) {
            holder.CvMain.setOnClickListener {
                holder.root.navigateWithId(R.id.action_home2_to_newsDetails)
            }
        }    }


    init {
        adapter.submitList(listOf("1","2","3"))
        adapter.notifyDataSetChanged()
    }
}