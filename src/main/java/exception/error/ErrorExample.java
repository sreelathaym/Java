package exception.error;

public class ErrorExample {
    public static void main(String[] args){
        recursiveMethod(10);
    }
    public static void recursiveMethod(int i){
        if(i==0){

        }else{
            recursiveMethod(i);
        }
    }
}
