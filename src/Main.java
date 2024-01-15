import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        /*
        Account HermanAcc= new Account("HermanAcc", 1, 1000);
        User Herman= new User("Herman", "password", 1, "male", 18, HermanAcc);

        File file = new File("src/test.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
         */
        Scanner scan = new Scanner(System.in);
        File inputFile = new File("src/test.txt");
        System.out.println("Logga in, Skriv användarnamn");
        String userNameInput = scan.nextLine();
        System.out.println("Skriv lösenord");
        String passwordInput = scan.nextLine();

        try {
            Scanner in = new Scanner(new File("src/test.txt"));
            while (in.hasNextLine());
            {
                String s = in.nextLine();
                String[] sArray = s.split(",");

                System.out.println(sArray[0]);
                System.out.println(sArray[1]);

                if (userNameInput == sArray[0] && passwordInput == sArray[1]) {
                    System.out.println("Login gick");
                }
                else {
                    System.out.println("Login misslyckades");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error");
        }


        System.out.println("Hello world!");
    }
}