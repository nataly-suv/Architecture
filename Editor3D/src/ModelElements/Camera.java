package ModelElements;

import Staff.Angle3D;
import Staff.Point3D;

public class Camera {

    public Point3D location;
    public Angle3D angle;


    // не уверена, что здесь нужен конструктор
    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    // метод поворота для камеры
    public void Rotate(Angle3D angle) {        
        
    }

    // метод движения для камеры
    public void Move(Point3D location) {        
        
    }
    
}
