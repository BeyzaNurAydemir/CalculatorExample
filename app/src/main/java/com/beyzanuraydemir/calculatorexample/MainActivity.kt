package com.beyzanuraydemir.calculatorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beyzanuraydemir.calculatorexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var textView = binding.textView
        textView.text = ""

        binding.addButton.setOnClickListener {
            var firstNumber = textView.text.toString()
            addition(firstNumber)
            textView.text = null
        }


        binding.buttonAC.setOnClickListener {
            textView.text = null
        }

        binding.zeroButton.setOnClickListener {
            textView.text = textView.text.toString() + "0"

        }

        binding.oneButton.setOnClickListener {
            textView.text = textView.text.toString() + "1"
        }

        binding.twoButton.setOnClickListener {
            textView.text = textView.text.toString() + "2"
        }

        binding.threeButton.setOnClickListener {
            textView.text = textView.text.toString() + "3"
        }

        binding.fourButton.setOnClickListener {
            textView.text = textView.text.toString() + "4"
        }

        binding.fiveButton.setOnClickListener {
            textView.text = textView.text.toString() + "5"
        }

        binding.sixButton.setOnClickListener {
            textView.text = textView.text.toString() + "6"
        }

        binding.sevenButton.setOnClickListener {
            textView.text = textView.text.toString() + "7"
        }

        binding.eightButton.setOnClickListener {
            textView.text = textView.text.toString() + "8"
        }

        binding.nineButton.setOnClickListener {
            textView.text = textView.text.toString() + "9"
        }

        binding.dotButton.setOnClickListener {
            textView.text = textView.text.toString() + "."
        }
    }

    fun addition(firstNumber: String){
        binding.equalButton.setOnClickListener {
            var secondNumber = binding.textView.text.toString()
            var result = firstNumber.toDouble()  + secondNumber.toDouble()
            binding.textView.text = result.toString()
        }
    }
}