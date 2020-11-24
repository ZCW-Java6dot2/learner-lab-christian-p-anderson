package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class TestPerson {

    private Person testPerson;

    @Test
    public void testConstructor() {
        testPerson = new Person("John");
        assertEquals("John", testPerson.getName());
    }

    @Test
    public void testSetName() {
        // When
        String expected = "Charlie";
        Person testPerson = new Person(expected);

        // Given
        String actual = testPerson.getName();

        // Then
        assertEquals(expected, actual);
    }


}
