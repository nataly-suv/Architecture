package Fabric;

import Interfaces.IGameItem;
import Product.NewLife;

public class NewLifeGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new NewLife();
    }
    
}
