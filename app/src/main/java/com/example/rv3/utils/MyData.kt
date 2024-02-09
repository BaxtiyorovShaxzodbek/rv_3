package com.example.rv3.utils

import com.example.rv3.R
import com.example.rv3.models.Flag

object MyData {
    var list = ArrayList<Flag>()
    fun addFlags(){
        for (i in 0..10){
            list.add(Flag(R.drawable.img,"Foto"))
            list.add(Flag(R.drawable.img_1,"Birds"))
            list.add(Flag(R.drawable.img_2,"Flowers"))
            list.add(Flag(R.drawable.img_3,"Great"))
            list.add(Flag(R.drawable.img_4,"Nature"))
        }
    }
}