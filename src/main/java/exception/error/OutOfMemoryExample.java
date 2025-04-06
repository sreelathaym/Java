package exception.error;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        List<int[]> memoryEater= new ArrayList<>();

        while(true){
            memoryEater.add(new int[10000000]);
        }
    }
}
