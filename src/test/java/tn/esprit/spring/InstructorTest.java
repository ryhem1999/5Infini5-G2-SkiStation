package tn.esprit.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tn.esprit.spring.entities.Course;
import tn.esprit.spring.entities.Instructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class InstructorTest {

    private Instructor instructor;

    @BeforeEach
    public void setUp() {
        instructor = new Instructor();
        instructor.setNumInstructor(1L);
        instructor.setFirstName("Mehdi");
        instructor.setDateOfHire(LocalDate.now()); // Set the current date as an example
        instructor.setLastName("Chabchoub");

        Set<Course> courses = new HashSet<>();
        courses.add(new Course());
        instructor.setCourses(courses);
    }

    @Test
    void testGetNumInstructor() {
        assertEquals(1L, instructor.getNumInstructor());
    }

    @Test
    void testGetFirstName() {
        assertEquals("Mehdi", instructor.getFirstName());
    }

    @Test
    void testGetDateOfHire() {
        assertEquals(LocalDate.now(), instructor.getDateOfHire());
    }

    @Test
    void testGetLastName() {
        assertEquals("Chabchoub", instructor.getLastName());
    }

    // Additional tests for other methods...

}