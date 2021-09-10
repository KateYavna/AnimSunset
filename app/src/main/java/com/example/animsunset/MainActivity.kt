package com.example.animsunset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val animationSky =
                AnimationUtils.loadAnimation(this, R.anim.fade)
            clMain.startAnimation(animationSky)
          ivSun.animate().translationY(1500f).duration = 20000
          ivCloud.animate().translationX(700f).duration = 20000
          ivSecondCloud.animate().translationX(700f).duration = 20000
          ivThirdCloud.animate().translationX(700f).duration = 20000
    }
}