import java.util.Scanner;

public class Main {
    private Scanner readLine = new Scanner(System.in);
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


    }
}


//add subtract multiply
//divide sqrt power
