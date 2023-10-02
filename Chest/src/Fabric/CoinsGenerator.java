package Fabric;

import Interfaces.IGameItem;
import Product.Coins;

public class CoinsGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Coins();
    }
    
}
