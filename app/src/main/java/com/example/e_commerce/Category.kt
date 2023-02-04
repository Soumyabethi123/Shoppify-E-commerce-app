package com.example.e_commerce

class Category() {

    fun loadAffirmations(): List<Category_attributes> {
        return listOf<Category_attributes>(

            Category_attributes("Men", R.drawable.mennnnn_category),
            Category_attributes("Western Wear", R.drawable.women_fashion),
            Category_attributes("Kurti & Suit", R.drawable.kurti_suit),
            Category_attributes("Saree", R.drawable.saree),
            Category_attributes("Kids", R.drawable.kids),
            Category_attributes("Beauty Products", R.drawable.beauty_products),
            Category_attributes("Footwear", R.drawable.footwear),
            Category_attributes("Jewellery", R.drawable.jewellery)
        )
    }
}