import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");

        String a = sc.nextLine();
        System.out.println("ENter the second String: ");
        String b = sc.nextLine();
        System.out.println(a.substring(0,a.length()/2) + b.substring(b.length()/2));

        //_____________________________________________________________________________

        System.out.println(sum(32,4));
        System.out.println(substraction(50,4));
        System.out.println(multiplication(12,2));
        System.out.println(devision(15,3));
    }




    public static int sum(int a,int b){
        return a+b;
    }
    public static int substraction(int a, int b){
        return a-b;
    }
    public static int multiplication (int a, int b){
        return a*b;
    }

    public static int devision(int a, int b){
        return a/b;
    }
}

