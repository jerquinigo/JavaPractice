public class JavaRecursion {
    
    public static void main(String[] args) {
        sayHi(5);
    }

    public static void sayHi(int n) {
        //this is better than n == 0, because if negative vales are thrown at it, the base case can catch it
        if(n < 1) {
            System.out.println("done");
        }
        else {
            System.out.println("hi");
            n = n - 1;
            sayHi(n);
        }
    }
}