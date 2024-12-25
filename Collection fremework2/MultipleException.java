import java.util.Scanner;

public class MultipleException {
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



        //or

//        try {
//            arr[6] = 10/0 ;
//
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }


    }
}
