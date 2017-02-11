package com.serega.practice.module03.task033;


public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;


    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, String setFirstName, Course[] coursesTaken, String collegeName, int rating, long id,  int setAge, int setGroup, long secretKey) {
        super(lastName, setFirstName, coursesTaken, collegeName, rating, id,  setAge, setGroup);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
