package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {


    @Test
    public void getAverageExamScoreTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudent(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

//        System.out.println("===========================");
//        System.out.println(preEnrollmentAsString);
//        System.out.println("===========================");
//        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void removeStudent(){
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();
        classroom.removeStudent("Leon", "Hunter");

        Assert.assertEquals(classroom.getStudents()[0], null);
    }
    @Test
    public void getStudentByScore(){
        Double[] s1Scores = { 100.0, 99.0 };
        Double[] s2Scores = { 75.0, 25.0 };
//        Double[] s3Scores = { 25.0, 25.0 };
//        Double[] s4Scores = { 65.0, 50.0 };

        Student s1 = new Student("Tom", "One", s1Scores);
        Student s2 = new Student("Tweet", "Two", s2Scores);
//        Student s3 = new Student("Jerry", "Hoo", s3Scores);
//        Student s4 = new Student("Jack", "From", s4Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        classroom.getStudentsByScore();

        // Then
        System.out.println(Arrays.toString(classroom.getStudentsByScore()));
    }

    @Test
    public void getGrade(){
        Double[] s1Scores = { 100.0, 99.0 };
        Double[] s2Scores = { 75.0, 25.0 };
//        Double[] s3Scores = { 25.0, 25.0 };
//        Double[] s4Scores = { 65.0, 50.0 };

        Student s1 = new Student("Tom", "One", s1Scores);
        Student s2 = new Student("Tweet", "Two", s2Scores);
//        Student s3 = new Student("Jerry", "Hoo", s3Scores);
//        Student s4 = new Student("Jack", "From", s4Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        classroom.getGradeBook();

        // Then
        //System.out.println(classroom.getGradeBook());
    }
}
