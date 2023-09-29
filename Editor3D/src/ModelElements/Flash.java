package ModelElements;

import Staff.Angle3D;
import Staff.Point3D;

import java.awt.*;

public class Flash {

    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    // не уверена, что здесь нужен конструктор
    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    // метод поворота для света
    public void Rotate(Angle3D angle) {        
        
    }

    // метод движения для света
    public void Move(Point3D location) {        
        
    }

    

    
    
}
