package SOLID_Tasks;

// Переписать код в соответствии с Interface Segregation Principle

public class Shapes {
    public static void main(String[] args) throws Exception {

    }
}

// интерфейс для плоских фигур
interface ShapeArea {
    double area();
}

// интерфейс для объемных фигур
interface ShapeVolume {
    double volume();
}

class Circle implements ShapeArea {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

class Cube implements ShapeArea, ShapeVolume {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}