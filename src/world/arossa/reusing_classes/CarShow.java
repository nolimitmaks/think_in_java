package world.arossa.reusing_classes;

public class CarShow {
    
    public CarShow() {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.right.window.rolldown();
        car.engine.service();
    }

}
