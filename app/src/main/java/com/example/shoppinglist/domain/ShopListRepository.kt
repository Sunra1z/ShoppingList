package com.example.shoppinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun EditShopItem(shopItem: ShopItem)
    fun getShopItemById(Itemid: Int): ShopItem
    fun getShopList(): List<ShopItem>
}