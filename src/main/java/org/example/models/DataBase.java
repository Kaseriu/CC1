package org.example.models;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.ArrayList;

public class DataBase {

    private final ArrayList<Member> memberList;

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

        int count = 0;

        if (newMember.getAge() < 18) {
            System.out.println("To young to register (must be at least 18 years old)");
            count++;
        }

        if (!EmailValidator.getInstance().isValid(newMember.getEmail())) {
            System.out.println("Must have a valid email format");
            count++;
        }

        return count <= 0;
    }

    public void displayMembers() {
        for (Member member : this.memberList) {
            System.out.println(member);
        }
    }
}
