

class Car {

    String brand;
    int speed;

    void showCarInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Speed: "+ speed + " km/h");
    }
    
}






public class CarExample {
    

    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.brand = "Tesla";
        myCar.speed = 200;

        myCar.showCarInfo();

    }
}
