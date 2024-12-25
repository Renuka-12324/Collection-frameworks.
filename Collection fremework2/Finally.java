import java.util.Scanner;

/*
public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        try {
            arr[6] = 10/0 ;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Hello!!");
        }

    }
}
*/




/*
class Division {
    public static void main(String[] args)
    {
        int a = 10, b = 5, c = 5, result;
        try {
            result = a / (b - c);
            System.out.println("result" + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        finally {
            System.out.println("I am in final block");
        }
    }
}

 */





/*
class Finally {
    static void A()
    {
        try {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        }
        finally
        {
            System.out.println("A's finally");
        }
    }

    static void B()
    {
        try {
            System.out.println("inside B");
            return;
        }
        finally
        {
            System.out.println("B's finally");
        }
    }

    public static void main(String args[])
    {
        try {
            A();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }
        B();
    }
}

 */




//In this case finally doesn't get executed.

class Finally {
    public static void main(String[] args){
        try{
            System.out.println("In try block");
            System.exit(0);
        }
        catch(ArithmeticException e){
            System.out.println("In catch block");
        }
        finally{
            System.out.println("finally block");
        }
    }
}
