package com.java.core.looselycoupling;

public class SetterCar {
    private IEngine eng;
    public void setEng(IEngine eng){
        this.eng=eng;
    }
    public void drive(){
        int start= eng.start();
        if(start>=1){
            System.out.println("Jouney Satrted");
        }
    }
}
class Main1{
    public static void main(String[] args) {
        SetterCar car = new SetterCar();
        car.setEng(new DesielEngine());
        car.drive();
    }
}
