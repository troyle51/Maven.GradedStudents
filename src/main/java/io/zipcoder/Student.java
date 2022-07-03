package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(testScores.length);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken(){
        return this.examScores.size();
    }

    public String getExamScores() {
        StringBuilder stringBuilder = new StringBuilder();
        for(double val : this.examScores){
            stringBuilder.append("Exam " + getNumberOfExamsTaken() + " -> " + this.examScores.set(0, val) + "\n");
        }
        return stringBuilder.toString();
    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }

}
