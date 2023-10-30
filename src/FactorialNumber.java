import java.beans.ConstructorProperties;

public class FactorialNumber {
    public static void main(String[] args) {

        System.out.println(fact(5));

    }

    static int fact(int n){

        //base case
        if(n<=1){
            return 1;
        }
        System.out.println(n + " * ") ;
        return n*fact(n-1);
    }
}
