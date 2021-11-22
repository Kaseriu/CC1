package org.example;

import org.example.models.Address;
import org.example.models.DataBase;
import org.example.models.Member;

public class App {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();

        dataBase.addNewMember(
                new Member(
                        "Arthur",
                        "Matuszek",
                        18,
                        "a@a.com",
                        new Address(
                                1,
                                "rue",
                                "ville"
                        )
                )
        );

        dataBase.displayMembers();
    }
}
