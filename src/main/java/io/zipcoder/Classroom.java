package io.zipcoder;

import java.util.*;
import java.util.stream.Collectors;

public class Classroom {
    private Student[] students;
    private int maxNumberOfStudents;

    public Classroom(Integer maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
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
        return average;
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

    public Student[] getStudentsByScore(){
        ArrayList<Student> sorted = new ArrayList<>(Arrays.asList(students));
        sorted.sort(Comparator.comparing(Student::getAverageExamScore));
        //sorted.sort(Comparator.comparing(Student::getFirstName));

        Student[] copy = sorted.toArray(new Student[sorted.size()]);
        return copy;
    }

    public void getGradeBook(){
        if(getAverageExamScore() > 90){
            System.out.println("A");
        }
        if(getAverageExamScore() < 90 && getAverageExamScore() >= 80){
            System.out.println("B");
        }
        if(getAverageExamScore() < 80 && getAverageExamScore() >= 70){
            System.out.println("C");
        }
        if(getAverageExamScore() < 70 && getAverageExamScore() >= 60){
            System.out.println("D");
        }
        if(getAverageExamScore() < 60){
            System.out.println("F");
        }
    }
}
