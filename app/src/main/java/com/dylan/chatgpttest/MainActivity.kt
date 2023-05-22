package com.dylan.chatgpttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dylan.chatgpttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var logValue: Int = 0
    private val kotlinTest = KotlinTest()
    private val javaTest = JavaTest()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.printMb.setOnClickListener {
            when (LogType.pause(logValue)) {
                LogType.KOTLIN_LOG -> binding.content += kotlinTest.kotlinTest(logValue)
                LogType.JAVA_LOG -> binding.content += javaTest.javaTest(logValue)
            }
            logValue++
            binding.textViewTv.let { binding.scrollViewSv.smoothScrollTo(it.x.toInt(), it.y.toInt() + it.height) }
        }
    }
}