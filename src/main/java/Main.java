/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

        System.out.println("Please enter your name: ");

        Scanner in = new Scanner(System.in);
        String enteredName = in.nextLine();

        Greeting greeting = new Greeting(enteredName);
        System.out.print(greeting.getGreeting(enteredName));


    }
}
