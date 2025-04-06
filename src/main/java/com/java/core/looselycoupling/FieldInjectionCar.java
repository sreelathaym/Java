package com.java.core.looselycoupling;

import java.lang.reflect.Field;

public class FieldInjectionCar {
    private IEngine eng ;
    public void drive(){
        int start =eng.start();
        if(start>=1){
            System.out.println("Journey started");
        }
    }
}
class Main2{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        //using reflection ApI
        Class<?> clz= Class.forName("com.java.core.looselycoupling.FieldInjectionCar");
        Field engField=clz.getDeclaredField("eng");
        engField.setAccessible(true);


        Object object= clz.newInstance();

        FieldInjectionCar carObj=(FieldInjectionCar) object;

        engField.set(carObj,new DesielEngine());
        carObj.drive();


//        FieldInjectionCar car= new FieldInjectionCar();
//        car.drive();
    }
}
