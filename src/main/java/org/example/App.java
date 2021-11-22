package org.example;

import org.example.models.Address;
import org.example.models.DataBase;
import org.example.models.Member;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        int exitCode = 0;
        int scannerValue;

        while (exitCode == 0) {

            System.out.println("1.Add member");
            System.out.println("2.Show members");
            System.out.println("3.Exit");

            scannerValue = scanner.nextInt();

            switch (scannerValue) {
                case 1:
                    System.out.print("Firstname : ");
                    String firstName = scanner.next();
                    System.out.print("Lastname : ");
                    String lastName = scanner.next();
                    System.out.print("Age : ");
                    int age = scanner.nextInt();
                    System.out.print("Email : ");
                    String email = scanner.next();
                    System.out.print("Street Number : ");
                    int streetNumber = scanner.nextInt();
                    System.out.print("Street : ");
                    String street = scanner.next();
                    System.out.print("City : ");
                    String city = scanner.next();

                    dataBase.addNewMember(
                            new Member(
                                    firstName,
                                    lastName,
                                    age,
                                    email,
                                    new Address(
                                            streetNumber,
                                            street,
                                            city
                                    )
                            )
                    );
                    break;

                case 2:
                    dataBase.displayMembers();
                    break;

                case 3:
                    exitCode++;
                    break;
            }
        }
    }
}
