package com.example.e_commerce

class Category() {

    fun loadAffirmations(): List<Category_attributes> {
        return listOf<Category_attributes>(

            Category_attributes("Men", R.drawable.mennnnn_category,"T-Shirts,Shirts,Jeans"),
            Category_attributes("Western Wear", R.drawable.women_fashion,"Tops,Tshirts,Jumpsuits"),
            Category_attributes("Kurti & Suit", R.drawable.kurti_suit,"Ethnic Dresses,Dress Materials"),
            Category_attributes("Saree", R.drawable.saree,"Sarees & Blouses"),
            Category_attributes("Kids", R.drawable.kids,"Frocks,Dresses,Capris"),
            Category_attributes("Beauty Products", R.drawable.beauty_products,"Makeup,Fragances,Haircare"),
            Category_attributes("Footwear", R.drawable.footwear,"Sports Shoes,Flats & Heels"),
            Category_attributes("Jewellery", R.drawable.jewellery,"Ethnic Jewellery,Western Jewellery")
        )
    }
}