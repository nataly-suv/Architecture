package Fabric;

import Interfaces.IGameItem;
import Product.Food;

public class FoodGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Food();
    }
    
}
