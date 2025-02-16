package com.java.core.oops;

abstract class Car{
    private String model;
    public Car(String model) {
        this.model = model;
    }

     abstract void startEngine();
}
class ElectricCar extends Car{
    private String engineType;
    public ElectricCar(String model) {
        super(model);
        this.engineType = "Electric";
    }

    @Override
    void startEngine() {
          checkElectricCarEngine();
          engineElectricCar();
        System.out.println("Electric engine started successfully.");
    }
   private void checkElectricCarEngine(){
        System.out.println("Electric car engine performance checked by road test k/h");
    }
   private void  engineElectricCar(){
       System.out.println("Less pollution and engine sound less than Petrol car ");
   }
}
class PetrolCar extends Car{
    private String engineType;
    public PetrolCar(String model) {
        super(model);
        this.engineType= "Petrol";
    }

    @Override
    void startEngine() {
       checkPetrolCarEngine();
       warmUpEngine();
        System.out.println("Petrol engine started successfully.");
        }
        private void checkPetrolCarEngine(){
            System.out.println("produce more  pollution and make more noise than Electric car");
    }
    private void warmUpEngine() {
        System.out.println("Warming up engine components...");
    }
}
public class CarRunner {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar("Tesla");
        electricCar.startEngine();
        System.out.println();
        Car petrolCar = new PetrolCar("Toyota Rav4");
        petrolCar.startEngine();
    }
}
