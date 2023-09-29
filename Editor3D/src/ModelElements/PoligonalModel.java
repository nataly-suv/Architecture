package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {

    public List<Poligon> poligons;
    public ArrayList<Texture> textures;

    public PoligonalModel(ArrayList<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<>();
    }

    
    
}
