package com.mahmoud.alc4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MyProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
