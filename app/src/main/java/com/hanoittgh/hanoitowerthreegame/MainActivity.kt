package com.hanoittgh.hanoitowerthreegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hanoittgh.hanoitowerthreegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    var stateOfDiscs1 = 7
    var stateOfDiscs2 = 0
    var stateOfDiscs3 = 0
    var discUp = 0
    val listOfImgDiscs = listOf<Int>(R.drawable.hanoi_tower_0,R.drawable.hanoi_tower_3,R.drawable.hanoi_tower_2,
        R.drawable.hanoi_tower_23,R.drawable.hanoi_tower_1,R.drawable.hanoi_tower_13,R.drawable.hanoi_tower_12,
        R.drawable.hanoi_tower_123)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageViewFirst.setOnClickListener { funOnFirstClick() }
        binding.imageViewSecond.setOnClickListener { funOnSecondClick() }
        binding.imageViewThird.setOnClickListener { funOnThirdClick() }
    }
    fun funOnFirstClick() {
        if (discUp == 0) {
            discUp = when (stateOfDiscs1) {
                7 -> 1
                6 -> 2
                5 -> 1
                4 -> 4
                3 -> 1
                2 -> 2
                1 -> 1
                else -> 0
            }
            stateOfDiscs1 = when (stateOfDiscs1) {
                7 -> 6
                6 -> 4
                4 -> 0
                5 -> 4
                3 -> 2
                else -> 0
            }
        } else {

            stateOfDiscs1+= discUp
            discUp = 0
        }
        binding.imageViewFirst.setImageResource(listOfImgDiscs[stateOfDiscs1])
    }
    fun funOnSecondClick(){
        if (discUp == 0) {
            discUp = when (stateOfDiscs2) {
                7 -> 1
                6 -> 2
                5 -> 1
                4 -> 4
                3 -> 1
                2 -> 2
                1 -> 1
                else -> 0
            }
            stateOfDiscs2 = when (stateOfDiscs2) {
                7 -> 6
                6 -> 4
                4 -> 0
                5 -> 4
                3 -> 2
                else -> 0
            }
        } else {

            stateOfDiscs2+= discUp
            discUp = 0
        }
        binding.imageViewSecond.setImageResource(listOfImgDiscs[stateOfDiscs2])

    }
    fun funOnThirdClick(){
        if (discUp == 0) {
            discUp = when (stateOfDiscs3) {
                7 -> 1
                6 -> 2
                5 -> 1
                4 -> 4
                3 -> 1
                2 -> 2
                1 -> 1
                else -> 0
            }
            stateOfDiscs3 = when (stateOfDiscs3) {
                7 -> 6
                6 -> 4
                4 -> 0
                5 -> 4
                3 -> 2
                else -> 0
            }
        } else {

            stateOfDiscs3+= discUp
            discUp = 0
        }
        binding.imageViewThird.setImageResource(listOfImgDiscs[stateOfDiscs3])

    }
}