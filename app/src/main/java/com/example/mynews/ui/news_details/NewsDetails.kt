package com.example.mynews.ui.news_details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mynews.R
import com.example.mynews.databinding.NewsDetailsBinding

class NewsDetails: Fragment(R.layout.news_details) {
    lateinit var binding: NewsDetailsBinding
    private val viewModel by viewModels<NewsDetailsVM>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = NewsDetailsBinding.bind(view)
        binding.vm = viewModel


    }
}