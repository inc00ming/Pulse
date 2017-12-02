package com.company;

import java.util.ArrayList;

/**
 * Created by furkan on 30.11.2017.
 */
public class Semester {
    private ArrayList<Course> semesterCourses;
    private int semesterCredit;

    public Semester(){
        semesterCourses = new ArrayList<Course>();
        semesterCredit = 0;
    }

    public ArrayList<Course> getSemesterCourses(){
        return semesterCourses;
    }

    public int getSemesterCredit(){
        return semesterCredit;
    }

    public void addCourse(Course c){
        semesterCourses.add(c);
        semesterCredit += c.getCourseCredit();
    }
}
