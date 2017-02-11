package com.serega.practice.module03.task033;


import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Course obj01 = new Course(new Date(), "HTML");
        Course obj02 = new Course(200, "JAVA", "Курочкина");
        Course obj03 = new Course(new Date(), "С++");
        Course obj04 = new Course(150, "Asemler", "Зузин");
        Course obj05 = new Course(new Date(), "C#");

        Student obj11 = new Student("Вася", "Кукушкин", 1);
        Student obj12 = new Student("Кукушкин", new Course[]{obj01, obj02, obj03, obj04, obj05});

        CollegeStudent obj21 = new CollegeStudent("Шваркин", "Эдуард", 2);
        CollegeStudent obj22 = new CollegeStudent("Уткин", new Course[]{obj01, obj02, obj03, obj04, obj05});
        CollegeStudent obj23 = new CollegeStudent("Гуляев","Ваня",new Course[]{obj01, obj02, obj03, obj04, obj05},"КПИ",9,7746345,20,5);

        SpecialStudent obj31 = new SpecialStudent("Шураев",new Course[]{obj01, obj02, obj03, obj04, obj05});
        SpecialStudent obj32 = new SpecialStudent("Витя", "Криворучко", 3);
        SpecialStudent obj33 = new SpecialStudent("Гуляев","Ваня",new Course[]{obj01, obj02, obj03, obj04, obj05},"КПИ",9,7464369,20,5,79999);


    }
}
