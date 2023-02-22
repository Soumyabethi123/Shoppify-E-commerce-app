package com.example.e_commerce

import androidx.annotation.DrawableRes

data class Product_list(

    @DrawableRes val Image_id : Int,
    val desc : String,
    val price : Int
)
