package com.example.animationkotlintransformer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.animationkotlintransformer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager = binding.pager

        val adapterVP = ViewPagerAdapter(this)
        viewPager.adapter = adapterVP
        viewPager.setPageTransformer(ZoomOutPageTransformer())
    }
}
