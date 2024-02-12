package tn.esprit.spring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tn.esprit.spring.entities.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    private Course course;

    @BeforeEach
    public void setUp() {
        course = new Course();
        course.setNumCourse(1L);
        course.setTypeCourse(TypeCourse.COLLECTIVE_ADULT);
        course.setSupport(Support.SKI);
        course.setPrice(500.0f);
        course.setLevel(5);


        Set<Registration> Registrations = new HashSet<>();
        Registrations.add(new Registration());
        course.setRegistrations(Registrations);
    }

    @Test
    void testGetNumCourse() {
        assertEquals(1L, course.getNumCourse());
    }


    @Test
    void testGetTypeCourse() {
        assertEquals(TypeCourse.COLLECTIVE_ADULT, course.getTypeCourse());
    }

    @Test
    void testGetSupport() {
        assertEquals(Support.SKI, course.getSupport());
    }

    @Test
    void testGetPrice() {
        assertEquals(500.0f, course.getPrice());
    }

    @Test
    void testGetLevel() {
        assertEquals(5, course.getLevel());
    }




}