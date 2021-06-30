package com.example.testlivedata.Data

import java.io.Serializable

class TransitionData(counter:Int) : Serializable{
    val message = "counter : $counter"
}