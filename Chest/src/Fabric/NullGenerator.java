package Fabric;

import Interfaces.IGameItem;
import Product.Null;

public class NullGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Null();
    }

}
