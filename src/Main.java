import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        //Account HermanAcc= new Account("HermanAcc", 1, 1000);
        //User Herman= new User("Herman", "password", 1, "male", 18, HermanAcc);

        try {
            Scanner in = new Scanner(new File("src/test.txt"));
            while (in.hasNextLine()) {
                String s = in.nextLine();
                String[] sArray = s.split(",");

                System.out.println(sArray[0]);
                System.out.println(sArray[1]);

                if (sArray[0].equals("1")) {
                    System.out.println("Detta är en användare");
                    User[] Users = new User[10];
                    Users[0]= new User(sArray[1],sArray[2],(Integer.valueOf(sArray[3])),sArray[4],(Integer.valueOf(sArray[5])));
                    System.out.println("Test: " + Users[0].getName());

                }
                else {
                    System.out.println("Detta är ett konto");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error");
        }






        Scanner scan = new Scanner(System.in);
        System.out.println("Logga in, Skriv användarnamn");
        String userNameInput = scan.nextLine();
        System.out.println("username: " + userNameInput);
        System.out.println("Skriv lösenord");
        String passwordInput = scan.nextLine();
        System.out.println("lösenord: " + passwordInput);

        try {
            Scanner in = new Scanner(new File("src/test.txt"));
            while (in.hasNextLine()) {
                String s = in.nextLine();
                String[] sArray = s.split(",");

                System.out.println(sArray[0]);
                System.out.println(sArray[1]);

                if (userNameInput.equals(sArray[0]) && passwordInput.equals(sArray[1])) {
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