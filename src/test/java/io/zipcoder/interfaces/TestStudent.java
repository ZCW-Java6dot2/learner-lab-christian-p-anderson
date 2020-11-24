package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student testStudent = new Student("Chris");

        Boolean isInstOf = testStudent instanceof Learner;

        assertTrue(isInstOf);
    }

    @Test
    public void testInheritance() {
        Student testStudent = new Student("Chris");

        Boolean isInstOf = testStudent instanceof Person;

        assertTrue(isInstOf);
    }

    @Test
    public void testLearn() {
        // When
        Student testStudent = new Student("Chris");
        double expected = 1.0;
        testStudent.learn(expected);

        // Given
        double actual = testStudent.getTotalStudyTime();

        // Then
        assertEquals(expected, actual);
    }
}
