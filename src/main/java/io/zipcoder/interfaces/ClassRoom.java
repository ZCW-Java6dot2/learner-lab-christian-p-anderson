package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {

    private ArrayList<Student> students = TechConnect.getStudents();
    private ArrayList<Instructor> instructors = ZipCodeWilmington.getInstructors();

    public HashMap<Student, Instructor> getRoster(ArrayList<Student> students, ArrayList<Instructor> instructors) {

        HashMap<Student, Instructor> a = new HashMap<Student, Instructor>();
        for (int i = 0; i < students.size(); i++) {
            a.put(students.get(i), instructors.get(i));
        }

        return a;
    }
}
