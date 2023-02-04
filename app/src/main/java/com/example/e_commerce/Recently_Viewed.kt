package com.example.e_commerce

class Recently_Viewed() {

    fun loadData() : List<Recently_viewed_attr>{

        return listOf<Recently_viewed_attr>(

            Recently_viewed_attr("$50", R.drawable.recent1),
            Recently_viewed_attr("$100", R.drawable.recent2),
            Recently_viewed_attr("$80", R.drawable.recent3),
            Recently_viewed_attr("$1000", R.drawable.recent4),
            Recently_viewed_attr("$500", R.drawable.recent5),

        )
    }
}