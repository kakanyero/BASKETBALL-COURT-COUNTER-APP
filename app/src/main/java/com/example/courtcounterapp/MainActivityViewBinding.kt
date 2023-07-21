package com.example.courtcounterapp

import androidx.lifecycle.ViewModel

class MainActivityViewBinding:ViewModel() {
    var a_scores=0
    var b_scores=0
    fun addScoreA(){
        a_scores++
    }
    fun addScoreB(){
        b_scores++
    }
}