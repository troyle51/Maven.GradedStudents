package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

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
        //String s = "";
        //examScores.toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(double i : this.examScores){
            stringBuilder.append("Exam " + this.examScores.indexOf(i) + " -> " + this.examScores.get(examScores.indexOf(i)) + "\n");
        }
        return stringBuilder.toString();
//        for (int i = 0; i < examScores.toArray().length-1; i++){
//            //stringBuilder.append("Exam " + examScores.get(i));
//            s = "Exam " + examScores.toArray()[i] + "Score";
//        }
    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        this.examScores.add(examNumber, newScore);
    }

    public Double getAverageExamScore(){
        int total = 0;
        for (int i = 0; i < examScores.size()-1; i++){
            total += examScores.get(i);
        }

        return Double.valueOf(total/examScores.size());
    }

}
