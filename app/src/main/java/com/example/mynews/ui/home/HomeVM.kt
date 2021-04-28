package com.example.mynews.ui.home

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import com.example.mynews.adapter.MyNewsPageAdapter

class HomeVM: ViewModel() {
    lateinit var childFragment : FragmentManager

    val myNewsAdapter by lazy { MyNewsPageAdapter(childFragment) }
}