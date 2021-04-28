package com.example.mynews.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mynews.R
import com.example.mynews.databinding.SplashBinding
import com.example.mynews.Navigation.navigateWithId

class Splash: Fragment(R.layout.splash) {
    private lateinit var splashBinding: SplashBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        splashBinding = SplashBinding.bind(view)
        splashHandler()
    }

    private fun splashHandler() {
        try{
            Handler(Looper.getMainLooper()).postDelayed({
                splashBinding.root.navigateWithId(R.id.action_splash_to_home2)
            },2000)
        }
        catch(e: Exception){
            Log.e("Error: ", e.toString())

        }
    }
}