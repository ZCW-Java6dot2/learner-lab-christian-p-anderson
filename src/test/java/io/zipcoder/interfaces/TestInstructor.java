package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor testInstructor = new Instructor("Chris");

        Boolean isInstOf = testInstructor instanceof Teacher;

        assertTrue(isInstOf);
    }

    @Test
    public void testInheritance() {
        Instructor testInstructor = new Instructor("Chris");

        Boolean isInstOf = testInstructor instanceof Person;

        assertTrue(isInstOf);
    }

    @Test
    public void testTeach() {
        // When
        Instructor testInstructor = new Instructor("Chris");
        double expected = 1.0;
        Student testStudent = new Student("Charlie");
        testInstructor.teach(testStudent, 1);

        // Given
        double actual = testStudent.getTotalStudyTime();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        // When
        Instructor testInstructor = new Instructor("Chris");
        Student testStudent1 = new Student("Charlie");
        Student testStudent2 = new Student("Beth");
        Student testStudent3 = new Student("Lori");
        double expected = 2.0;

        Student[] testStudents = {testStudent1, testStudent2, testStudent3};

        // Given
        testInstructor.lecture(testStudents, 6);
        double actual = testStudent1.getTotalStudyTime();

        // Then
        assertEquals(expected, actual);
    }
}
