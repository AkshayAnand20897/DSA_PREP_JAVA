public class Sum_and_product_Of_Digits
{
    public static void main(String[] args) {
        System.out.println(sumofdig(1342));
        System.out.println(product(43));
    }

    static int sumofdig(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumofdig(n/10);
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * product(n/10);
    }
}
