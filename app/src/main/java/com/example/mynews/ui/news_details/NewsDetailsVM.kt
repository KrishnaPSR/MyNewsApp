package com.example.mynews.ui.news_details

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mynews.Navigation.navigateBack
import com.example.mynews.R

class NewsDetailsVM: ViewModel() {
    fun onClick(view: View){
        when(view.id){
            R.id.ivBack ->{
                view.navigateBack()
            }
        }
    }
}