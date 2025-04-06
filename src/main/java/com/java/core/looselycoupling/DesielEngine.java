package com.java.core.looselycoupling;

public class DesielEngine implements  IEngine{
    @Override
    public int start() {
        System.out.println("Deisel Engine Started");
        return 1;
    }
}
