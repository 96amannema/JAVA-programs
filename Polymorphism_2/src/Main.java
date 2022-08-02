class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> Engine Start";
    }

    public String accelerate() {
        return "Car -> Car Accelerate";
    }

    public String brake() {
        return "Car -> Brake";
    }
}

class Audi extends Car {
    public Audi(int cylinders, String name) {
        super(cylinders, name);
        }

        public String startEngine() {
            return "Audi -> Engine Start";
        }

        public String accelerate() {
        return "Audi -> Car Accelerate";
        }

        public String brake() {
        return "Audi -> Brake";
        }
}

class Mercedes extends Car {
    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Mercedes -> Engine Start";
    }

    public String accelerate() {
        return "Mercedes -> Car Accelerate";
    }

    public String brake() {
        return "Mercedes -> Brake";
    }
}

class Ferrari extends Car {
    public Ferrari (int cylinders, String name){
        super(cylinders, name);
    }

    public String startEngine() {
        return "Ferrari -> Engine Start";
    }

    public String accelerate() {
        return "Ferrari -> Car accelerate";
    }

    public String brake() {
        return "Ferrari -> Brake";
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi(6, "320d");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Mercedes mercedes = new Mercedes(8, "A8");
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

        Ferrari ferrari = new Ferrari(6, "Enzo");
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

        }
    }





