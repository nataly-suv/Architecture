package SOLID_Tasks;

// Переписать код в соответствии с Liskov Substitution Principle

public class Rectangle implements Square {
    private int width;
    private int height;

    @Override
    public int area() {
        return this.width * this.height;
    }
}

interface Square {
   int area();
}