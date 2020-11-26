package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class TestTechConnect {

    @Before
    public void setup() {
        TechConnect.removeStudents();
    }

    @Test
    public void testRemoveStudents() {
        // While
        TechConnect testZCW = new TechConnect();
        testZCW.removeStudents();

        // Given
        Boolean actual = testZCW.getStudents().isEmpty();

        // Then
        assertTrue(actual);

    }

    @Test
    public void testRecruitStudent() {
        // While
        TechConnect testTechConnect = new TechConnect();
        Student william = new Student("Willian");
        testTechConnect.recruitStudent(william);

        // Given
        boolean actual = testTechConnect.getStudents().contains(william);

        // Then
        assertTrue(actual);
    }
}
