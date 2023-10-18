public class NumberExampleRecursion {
    public static void main(String[] args) {
        // System.out.println("This is my first file on git");
        print(1);


    }
    static void print(int n){
        if(n==9)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
