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

    fun loadMen() : List<Product_list>{

        return listOf<Product_list>(

            Product_list(R.drawable.men1,"Striped slim fit shirt",610) ,
            Product_list(R.drawable.men2,"Black slim fit shirt",671),
            Product_list(R.drawable.men3,"Full sleeves slim fit shirt",500),
            Product_list(R.drawable.men4,"slim fit Jeans",700)
        )
    }

    fun loadKurti() : List<Product_list>{

        return listOf<Product_list>(

            Product_list(R.drawable.kurti2,"Printed Shirt dress",800) ,
            Product_list(R.drawable.kurti1,"Black Designer kurti",500),
            Product_list(R.drawable.kurti3,"Floral Print Kurti",600),
            Product_list(R.drawable.kurti4,"Floral Print Striaght dress",800),
            Product_list(R.drawable.kurti5,"Floral Print A-line dress",800)
        )
    }

    fun loadSaree() : List<Product_list>{

        return listOf<Product_list>(

            Product_list(R.drawable.saree1,"Printed Shirt dress",800) ,
            Product_list(R.drawable.saree2,"Printed Shirt dress",800) ,
            Product_list(R.drawable.saree3,"Printed Shirt dress",800) ,
            Product_list(R.drawable.saree5,"Printed Shirt dress",800) ,
            Product_list(R.drawable.recent3,"Printed Shirt dress",800)
        )
    }
}