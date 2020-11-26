package io.zipcoder.interfaces;


import org.apache.tools.ant.taskdefs.Zip;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestZipCodeWilmington {

    @Before
    public void setup() {
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void testFireStaff() {
        // Given
        ZipCodeWilmington testZCW = new ZipCodeWilmington();
        testZCW.fireStaff();

        // When
        Boolean actual = testZCW.getInstructors().isEmpty();

        // Then
        assertTrue(actual);
    }

    @Test
    public void testHireStaff() {
        // Given
        ZipCodeWilmington testZCW = new ZipCodeWilmington();
        Instructor parker = new Instructor("Parker");
        testZCW.hire(parker);

        // When
        Boolean actual = testZCW.getInstructors().contains(parker);


        // Then
        assertTrue(actual);

    }



}
