package tn.esprit.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.Course;
import tn.esprit.spring.entities.Instructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class InstructorMockTest {

    @Mock
    private Instructor mockInstructor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockInstructor.getNumInstructor()).thenReturn(1L);
        when(mockInstructor.getFirstName()).thenReturn("Mock");
        when(mockInstructor.getLastName()).thenReturn("Instructor");
        when(mockInstructor.getDateOfHire()).thenReturn(LocalDate.of(2020, 1, 1));

        // Creating a set of courses
        Set<Course> courses = new HashSet<>();
        Course course1 = new Course();
        course1.setId(1L);
        course1.setName("Course 1");
        courses.add(course1);
        Course course2 = new Course();
        course2.setId(2L);
        course2.setName("Course 2");
        courses.add(course2);
        when(mockInstructor.getCourses()).thenReturn(courses);
    }

    @Test
    void testGetNumInstructorWithMock() {
        assertEquals(1L, mockInstructor.getNumInstructor());
    }

    @Test
    void testGetFirstNameWithMock() {
        assertEquals("Mock", mockInstructor.getFirstName());
    }

    @Test
    void testGetLastNameWithMock() {
        assertEquals("Instructor", mockInstructor.getLastName());
    }

    @Test
    void testGetDateOfHireWithMock() {
        assertEquals(LocalDate.of(2020, 1, 1), mockInstructor.getDateOfHire());
    }

    @Test
    void testGetCoursesWithMock() {
        Set<Course> courses = mockInstructor.getCourses();
        assertEquals(2, courses.size());
        // You can add more assertions to verify the courses if needed
    }
}
