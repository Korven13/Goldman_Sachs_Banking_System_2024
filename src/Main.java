import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        //Account HermanAcc= new Account("HermanAcc", 1, 1000);
        //User Herman= new User("Herman", "password", 1, "male", 18, HermanAcc);
            User[] Users = new User[10];
            Account[] Accounts = new Account[10];
            Scanner in = new Scanner(new File("src/test.txt"));
            Scanner in2 = new Scanner(new File("src/test.txt"));
            Scanner in3 = new Scanner(new File("src/test.txt"));
        while (in.hasNextLine()) {
                String s = in.nextLine();
                String[] sArray = s.split(",");

                System.out.println(sArray[0]);
                System.out.println(sArray[1]);

                if (sArray[0].equals("1")) {
                    System.out.println("Detta är en användare");
                    Users[(Integer.valueOf(sArray[3]))]= new User(sArray[1],sArray[2],(Integer.valueOf(sArray[3])),sArray[4],(Integer.valueOf(sArray[5])));
                    System.out.println("Test: " + Users[(Integer.valueOf(sArray[3]))].getName());

                }
                else {
                    System.out.println("Detta är ett konto");

                    Accounts[(Integer.valueOf(sArray[2]))]= new Account(sArray[1],(Integer.valueOf(sArray[2])),(Integer.valueOf(sArray[3])),(Integer.valueOf(sArray[4])));
                    System.out.println("Test: " + Accounts[(Integer.valueOf(sArray[2]))].getName());
                }
            }







        Scanner scan = new Scanner(System.in);
        System.out.println("Logga in, Skriv användarnamn");
        String userNameInput = scan.nextLine();
        System.out.println("username: " + userNameInput);
        System.out.println("Skriv lösenord");
        String passwordInput = scan.nextLine();
        System.out.println("lösenord: " + passwordInput);

            while (in2.hasNextLine()) {
                String s = in2.nextLine();
                String[] sArray = s.split(",");

                System.out.println(sArray[0]);
                System.out.println(sArray[1]);

                if (userNameInput.equals(sArray[1]) && passwordInput.equals(sArray[2])) {
                    System.out.println("Login gick");
                    System.out.println("Vad vill du göra: 1 - Info, 2 - Sätt in pengar, 3 - Ta ut pengar, 4 - Överför pengar");

                    while (in3.hasNextLine()) {
                        String z = in2.nextLine();
                        String[] zArray = s.split(",");
                        ArrayList<Accounts> list = new ArrayList<Accounts>();
                        list.add(Accounts[1]);
                    }

                    switch (scan.nextInt()) {
                        case 1: System.out.println("Test2");
                                System.out.println("Användare: " + Users[(Integer.valueOf(sArray[3]))].getName());

                                break;
                        case 2: System.out.println("");
                                break;
                        case 3: System.out.println("");
                                break;
                        case 4: System.out.println("");
                                break;
                    }

                }
                else {
                    System.out.println("Login misslyckades");
                }
            }



        System.out.println("Hello world!");
    }
}