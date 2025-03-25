package com.java.core.looselycoupling;

public class Car {
    private IEngine eng;

    /* setter injection
    public void setEng(IEngine eng){
    this.eng= eng;
     */

    //constructor injection
    Car(IEngine eng){
        this.eng=eng;
    }
    public void drive(){
        int start=eng.start();
        if(start>=1){
            System.out.println(" Journey started");
        }else {
            System.out.println("engine in trouble");
        }
    }
}
class Main {
    public static void main(String[] args) {

        //IEngine eng = new DesielEngine();
        // Car car = new Car(eng);
        Car car = new Car(new PetrolEngine());

        car.drive();
    }
}
