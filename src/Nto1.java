public class Nto1 {
    public static void main(String[] args) {
           fun(5);
           System.out.print("--Reverse---");
           funReverse(6);
           System.out.print("---Both--");

        funBoth(6);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        System.out.print("--");
        fun(n-1);
    }
    static void funReverse(int n){
        if(n==0){
            return;
        }
        funReverse(n-1);
        System.out.print(n);
        System.out.print("--");

    }
    static void funBoth(int n){

        if(n==0){
            return;
        }
        System.out.print(n);
        System.out.print("--");
        funBoth(n-1);
        System.out.print("--");
        System.out.print(n);
    }
}
