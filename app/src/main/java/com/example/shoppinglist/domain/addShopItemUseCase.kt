package com.example.shoppinglist.domain

class addShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItem(ShopItem: ShopItem){
        shopListRepository.addShopItem(ShopItem)
    }
}