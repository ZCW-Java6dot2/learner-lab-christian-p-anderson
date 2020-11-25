package io.zipcoder.interfaces;


import java.util.ArrayList;
import io.zipcoder.interfaces.Instructor;

public class ZipCodeWilmington {

    private static ArrayList<Instructor> instructorList;

    static { // static initializer
        String[] instructorNames = {"Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu"};
        for (String instructorName : instructorNames) {
            Instructor instructor = new Instructor(instructorName);
            hire(instructor);
        }
    }

        public static void hire (Instructor instructor){
            instructorList.add(instructor);
        }

        public static ArrayList<Instructor> getInstructors () {
            return instructorList;
        }

        public static void fireStaff () {
            instructorList.clear();
        }

}


