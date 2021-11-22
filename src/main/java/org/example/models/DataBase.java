package org.example.models;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.ArrayList;

public class DataBase {

    private ArrayList<Member> memberList;

    public DataBase() {
        this.memberList = new ArrayList<>();
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void addNewMember(Member newMember) {
        if (applicationVerification(newMember)) {
            System.out.println("Application successful !");
            this.memberList.add(newMember);
        } else {
            System.out.println("Application failed !");
        }
    }

    public boolean applicationVerification(Member newMember) {

        if (newMember.getAge() < 18) {
            System.out.println("To young to register (must be at least 18 years old)");
            return false;
        }

        if (!EmailValidator.getInstance().isValid(newMember.getEmail())) {
            System.out.println("Must have a valid email format");
            return false;
        }

        return true;
    }
}
