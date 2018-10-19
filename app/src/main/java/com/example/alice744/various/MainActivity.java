package com.example.alice744.various;

import com.example.alice744.various.man.Man;
import com.example.alice744.various.man.Student;

public class MainActivity  {

    public static void main(String[] args) {

        Man man = new Man();
        Student student = new Student();

        man.setName("a");
        man.setAge(1);
        man.setWeight(8);

        student.setName("b");
        student.setAge(12);
        student.setWeight(85);
        student.setYearOfStudy(8);


        // write your code here
    }
}
