package com.serega.practice.module03.task033;


import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Course obj01 = new Course(new Date(), "HTML");
        Course obj02 = new Course(200, "JAVA", "Курочкина");
        Course obj03 = new Course(new Date(), "С++");
        Course obj04 = new Course(150, "Asemler", "Зузин");
        Course obj05 = new Course(new Date(), "C#");

        Student obj06 = new Student("Вася", "Кукушкин", 1);
        Student obj07 = new Student("Кукушкин", new Course[]{obj01, obj02, obj03, obj04, obj05});

        CollegeStudent obj08 = new CollegeStudent("Инокентий","Бест",1);
        CollegeStudent obj09 = new CollegeStudent("НеБест",new Course[]{obj01, obj02, obj03, obj04, obj05});
        CollegeStudent obj10 = new CollegeStudent("КПИ",10,5671);

        SpecialStudent obj11 = new SpecialStudent("НУХТ",9,4687);
        SpecialStudent obj12 = new SpecialStudent("Дима","Ярош", 5);
        SpecialStudent obj13 = new SpecialStudent(546546446);


    }
}
