package tn.esprit.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        instructor.setFirstName("John");
        instructor.setLastName("Doe");
        instructor.setDateOfHire(LocalDate.of(2020, 1, 1));

        Set<Course> courses = new HashSet<>();
        courses.add(new Course(1L, "Course 1"));
        courses.add(new Course(2L, "Course 2"));
        instructor.setCourses(courses);
    }

    @Test
    void testGetNumInstructor() {
        assertEquals(1L, instructor.getNumInstructor());
    }

    @Test
    void testGetFirstName() {
        assertEquals("John", instructor.getFirstName());
    }

    @Test
    void testGetLastName() {
        assertEquals("Doe", instructor.getLastName());
    }

    @Test
    void testGetDateOfHire() {
        assertEquals(LocalDate.of(2020, 1, 1), instructor.getDateOfHire());
    }

    @Test
    void testGetCourses() {
        Set<Course> courses = instructor.getCourses();
        assertEquals(2, courses.size());
        assertTrue(courses.stream().anyMatch(course -> course.getId() == 1L));
        assertTrue(courses.stream().anyMatch(course -> course.getId() == 2L));
    }
}
