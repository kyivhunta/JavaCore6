package com.serega.practice.module03.task033;


public class CollegeStudent extends Student {

    String collegeName;
    int rating;
    long id;



    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String lastName, String setFirstName, Course[] coursesTaken, String collegeName, int rating, long id, int setAge,int setGroup) {
        super(lastName, coursesTaken);
        setAge(setAge);
        setFirstName(setFirstName);
        setGroup(setGroup);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }


    public String getCollegeName() {
        return collegeName;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setId(long id) {
        this.id = id;
    }
}
