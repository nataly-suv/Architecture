package Fabric;

import Interfaces.IGameItem;
import Product.Gem;

public class GemGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gem();
    }

}
