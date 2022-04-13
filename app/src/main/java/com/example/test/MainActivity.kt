package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var n = 0
        var S = intArrayOf(0,0,0,0)
        val files = Files()
        var result = ""

        binding.btnGo.setOnClickListener {
            n = binding.etN.text.toString().toInt()
            S = intArrayOf(
                binding.etS1.text.toString().toInt(),
                binding.etS2.text.toString().toInt(),
                binding.etS3.text.toString().toInt(),
                binding.etS4.text.toString().toInt(),
            )

            result = Testing.fromNb2Str(n, S)
            binding.result.text = result
            files.writeToFile(result, this)
        }
    }



}