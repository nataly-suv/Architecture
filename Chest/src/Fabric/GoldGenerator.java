package Fabric;

import Interfaces.IGameItem;
import Product.Gold;

public class GoldGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gold();
    }

}