package io.zipcoder.interfaces;


import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;;

public class TestZipCodeWilmington {

    @Before
    public void setup() {
        ZipCodeWilmington testZCW = new ZipCodeWilmington();
        testZCW.fireStaff();
    }

    @Test
    public void testFireStaff() {
        // Given
        ZipCodeWilmington actual = new ZipCodeWilmington();
        ArrayList<Instructor> expected = new ArrayList<Instructor>();

        // When


        // Then
        assertEquals(expected, actual.getInstructors());
    }



}
