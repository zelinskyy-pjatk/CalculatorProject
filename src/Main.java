import java.util.Scanner;

public class Main {
    private static Scanner readLine = new Scanner(System.in);
    public int menu(){
        System.out.println(" -- Calculator -- ");
        System.out.println("""
                Choose:\s
                0 - Exit
                1 - Add
                2 - Subtract
                3 - Multiply
                4 - Divide  
                5 - Sqrt
                6 - Power""");
        System.out.println("Please, insert chosen option: ");
        int choice = -1;
        choice = readLine.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtract subtract = new Subtract();
        Divider divider = new Divider();
        Sqrter sqrter = new Sqrter();
        Powerer powerer = new Powerer();
        int a, b;
        double c, d;
        System.out.println("Enter 1 int number: ");
        a = readLine.nextInt();
        System.out.println("Enter 2 int number: ");
        b = readLine.nextInt();
        System.out.println("Enter operation you want to perform: ");
        String operation = readLine.next();
        switch(operation){
            case "add":{
                System.out.println("Result of adding " + a + " and " + b + " = " + adder.adder(a,b));
            }
            case "subtract":{
                System.out.println("Result of subtracting " + a + " and " + b + " = " + subtract.subtract(a,b));
            }
            case "divide":{
                System.out.println("Result of dividing " + a + " and " + b + " = " + divider.divide(a,b));
            }
            case "sqrt":{
                System.out.println("Result of sqrting " + a + " = " + sqrter.sqrt_s(a));
            }
            case "power":{
                System.out.println("Result of powering " + a + " and " + b + " = " + powerer.power_s(a,b));

            }
        }

    }
}
