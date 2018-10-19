package com.example.alice744.various.man;


public class Student extends Man {
    private int yearOfStudy;

    public void setYearOfStudy(int yearOfStudy) {

        if (yearOfStudy>6){
            yearOfStudy=6;
        }else if (yearOfStudy<0){
            System.out.println("Школьник");
        }else if (yearOfStudy<=6){
            this.yearOfStudy=yearOfStudy;
        }
    }


    private static void yearOfStudy() {
        Student yearOfStudy = new Student();
    }

    public void increaseYearOfStudy() {
        if (yearOfStudy == 0) {
            yearOfStudy = 1;
        }
        yearOfStudy++;
    }




}