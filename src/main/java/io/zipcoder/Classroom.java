package io.zipcoder;

import java.util.Arrays;

public class Classroom {
    private Student[] students;
    private int maxNumberOfStudents;

    public Classroom(Integer maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] students){
        this.students = students;
    }
    public Classroom(){
        this(30);
    }
    public Student[] getStudent(){
        return students;
    }
    public double getAverageExamScore(){
        double average = 0;
        for (Student s : students){
            average += s.getAverageExamScore();
        }
        return average / students.length;
    }

    public void addStudent(Student student){
        Arrays.fill(students, student);
    }

    public Student[] getStudents() {
        return students;
    }

    public void removeStudent(String firstName, String lastname){
        int index = 0;
        if(students[index] != null){
            for(int i = index; i < students.length; i++){
                if(students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastname)){
                    students[i] = null;
                }
                index++;
            }
        }
    }

    public void getStudentsByScore(){
        for(Student s : students){
            s.getExamScores();
        }
    }
}
