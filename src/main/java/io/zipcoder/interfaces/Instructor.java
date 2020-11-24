package io.zipcoder.interfaces;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Instructor extends Person implements Teacher {

    public Instructor(String name) {
        super(name);
    }

    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    public void lecture(Student[] students, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / students.length;

        for (Student element : students) {
            element.learn(numberOfHoursPerStudent);
        }


    }
}
