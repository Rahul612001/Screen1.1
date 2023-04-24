package com.example.screen1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                 supportActionBar?.hide()

        val animationView=findViewById<LottieAnimationView>(R.id.animation_view)

        animationView.setAnimation("screen_animation.json")
        animationView.loop(true)
        animationView.playAnimation()



    }

}