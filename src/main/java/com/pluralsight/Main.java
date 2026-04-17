package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // creating a stringBuilder
        Scanner scanner = new Scanner(System.in);
        StringBuilder info = new StringBuilder();

        // prompting the user.

        System.out.print("Please provide the following information:");
        
        System.out.print("Full name: ");
        String FullName = scanner.nextLine();
        System.out.print("Billing Street: ");
        String street = scanner.nextLine();
        System.out.print("Billing City: ");
        String city = scanner.nextLine();
        System.out.print("Billing State: ");
        String state = scanner.nextLine();
        System.out.print("Billing Zip: ");
        String zip = scanner.nextLine();
        System.out.print("Shipping Street: ");
        String Street = scanner.nextLine();
        System.out.print("Shipping City: ");
        String City = scanner.nextLine();
        System.out.print("Shipping State: ");
        String State = scanner.nextLine();
        System.out.print("Shipping Zip: ");
        String Zip = scanner.nextLine();

        //appending the strings
        info.append(FullName);

        info.append(street);
        info.append(city);
        info.append(state);
        info.append(zip);
        info.append(Street);
        info.append(City);
        info.append(State);
        info.append(Zip);

        //retrieve the information
        String address = info.toString();
        System.out.println(address);






    }
}
