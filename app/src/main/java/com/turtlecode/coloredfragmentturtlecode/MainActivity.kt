package com.turtlecode.coloredfragmentturtlecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun purple_onclick(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = purple()
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()

    }
    fun red_onclick(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = red()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()

    }
    fun green_onclick(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = green()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()

    }
    fun blue_onclick(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = blue()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()

    }
}