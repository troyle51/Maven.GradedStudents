package io.zipcoder;

public class Classroom {
    private Student[] students;
    private int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    public Classroom(Student[] collectionStudents){
        this.getStudent();
    }
    public Classroom(){
        this(30);
    }
    public Student[] getStudent(){
        return students;
    }
    public double getAverageExamScore(){
        getStudent();
        return 0;
    }
}
