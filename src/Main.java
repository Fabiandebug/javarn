import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        System.out.println("The answer is:"+answer);

        System.out.println("Please enter your name");

        String name = scanner.next();

        System.out.println("Your name is:"+name);


        System.out.println("End");

//Arrays

        String[] students= new String[5];
        students[1]="Evas";
        students[0]="Maish";
        System.out.println(students[1] +" "+students[0]);

    }
}