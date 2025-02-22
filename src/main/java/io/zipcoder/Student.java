package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(){

    }

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
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
        for(double i : this.examScores){
            stringBuilder.append('\t'+ ("Exam " + this.examScores.indexOf(i) + " -> " + this.examScores.get(examScores.indexOf(i)) + "\n"));
        }
        return stringBuilder.toString();
    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){ //Not working properly
        this.examScores.add(examNumber, newScore);
    }

    public Double getAverageExamScore(){
        int total = 0;
        for (int i = 0; i < examScores.size()-1; i++){
            total += examScores.get(i);
        }

        return Double.valueOf(total/examScores.size());
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Student name: " + getFirstName() + " " + getLastName() + "\n");
        str.append("> Average Score: " + getAverageExamScore() + "\n");
        str.append("> Exam Scores: \n" + getExamScores());
        return str.toString();
    }

}
