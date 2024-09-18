package com.example.shoppinglist.domain

data class ShopItem(
    var id: Int = undefined_id,
    val name: String,
    val count: Int,
    val enabled: Boolean
) {
    companion object {
        const val undefined_id = -1
    }
}
