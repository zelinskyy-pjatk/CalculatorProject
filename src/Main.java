import java.util.Scanner;

public class Main {
    private Scanner readLine = new Scanner(System.in);
    public int menu(){
        System.out.println(" -- Calculator -- ");
        System.out.println("Choose: "
                + "\n0 - Exit\n1 - Add\n2 - Subtract\n3 - Multiply" +
                "\n4 - Divide\n5 - Sqrt\n6 - Power");
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
