import java.util.Scanner;

//public class Throw {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age<18){
//            throw new RuntimeException("Sorry you can't vote");
//        }
//        else{
//            System.out.println("You are eligible to vote");
//        }
//    }
//}


/*
class Throw {
    static void help()
    {
        try {
            throw new NullPointerException("error_unknown");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside help().");
            throw e;
        }
    }

    public static void main(String args[])
    {
        try {
            help();
        }
        catch (NullPointerException e) {
            System.out.println("Caught in main error name given below:");
            System.out.println(e);
        }
    }
}
 */






class Throw {
    static void fun()
    {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e;
        }
    }

    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (NullPointerException e) {
            System.out.println("Caught in main.");
        }
    }
}