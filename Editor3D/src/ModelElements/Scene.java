package ModelElements;

import java.util.List;

public class Scene {
    
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    // добавила объек класса Camera, т.к. кратность 1..*, и должен ыть передат хотябы один объект 
    public List<Camera> cameras;

    // id в конструктор тоже добавила, т.к мне кажется что это важно при создании экземпляра класса
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }


    public  <Type> Type method1(Type obj) {
        return (Type) obj;
    }

    public  <Type> Type method2(Type obj1, Type obj2) {
        
        return (Type) obj1;
    }

    
    
}
