import java.util.ArrayList;
public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */

    public static double sqrt(double n, double tolerance){
        return sr(n, tolerance, 1);
    }

    public static double sr(double n, double tolerance, double g){
        g = 0.5 * (g + n / g);
        if(Math.abs((g * g - n) / n) <= Math.abs(tolerance)) return g;
        return sr(n, tolerance, g);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1 
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return f(n, 0, 1);

    }

    public static int f(int n, int a, int b){
        if(n == 0) return a;
        return f(n-1, b, a + b);
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
        return new ArrayList<Integer>();
    }
