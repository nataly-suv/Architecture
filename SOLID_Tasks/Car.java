package SOLID_Tasks;

// Переписать код в соответствии с Dependency Inversion Principle

public class Car implements Engine {

    private TypeFuel type;

    public Car(TypeFuel type) {
        this.type = type;
    }

    @Override
    public void start() {
    }
}

interface Engine {
    public void start();
}

enum TypeFuel {
    DIZEL,
    OIL
}