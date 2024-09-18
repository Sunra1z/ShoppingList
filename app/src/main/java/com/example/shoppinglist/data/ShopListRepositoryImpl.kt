package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository

object ShopListRepositoryImpl: ShopListRepository {

    // for now we store it locally, maybe will add DB later
    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.undefined_id){
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun EditShopItem(shopItem: ShopItem) {
        val oldElement = getShopItemById(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItemById(Itemid: Int): ShopItem {
        return shopList.find{
            it.id == Itemid } ?: throw RuntimeException("Element with id $Itemid not found")
    }

    override fun getShopList(): List<ShopItem> {
        // toList method returns a copy of original list object, for safety reasons
        return shopList.toList()
    }
}