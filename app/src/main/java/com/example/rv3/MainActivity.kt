package com.example.rv3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rv3.adapter.FlagAdapter
import com.example.rv3.databinding.ActivityMainBinding
import com.example.rv3.utils.MyData

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        MyData.addFlags()

        val flagAdapter = FlagAdapter(this,MyData.list)
        binding.rv.adapter = flagAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        MyData.list.clear()
    }
}