package com.example.shoppinglist.domain

class getShopItemByIdUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItemById(Itemid: Int): ShopItem{
        return shopListRepository.getShopItemById(Itemid)
    }

}