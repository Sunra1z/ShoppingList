package com.example.shoppinglist.domain

interface ShopListRepository {
    fun addShopItem(ShopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun EditShopItem(shopItem: ShopItem)
    fun getShopItemById(Itemid: Int): ShopItem
    fun getShopList(): List<ShopItem>
}