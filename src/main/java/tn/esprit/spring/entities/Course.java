import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
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

    @InjectMocks
    private Instructor mockInstructor;

    @Mock
    private Set<Course> mockCourses;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockInstructor.getNumInstructor()).thenReturn(1L);
        when(mockInstructor.getFirstName()).thenReturn("MockFirstName");
        when(mockInstructor.getLastName()).thenReturn("MockLastName");
        when(mockInstructor.getDateOfHire()).thenReturn(LocalDate.of(2022, 1, 1));
        when(mockInstructor.getCourses()).thenReturn(mockCourses);

        // Set up mock for Course entity
        Course mockCourse = new Course();
        mockCourse.setNumCourse(101L);
        mockCourse.setLevel(2);
        // Set other properties of the mockCourse as needed
        // ...

        Set<Course> mockCoursesSet = new HashSet<>();
        mockCoursesSet.add(mockCourse);
        when(mockCourses.size()).thenReturn(mockCoursesSet.size());
        when(mockCourses.iterator()).thenReturn(mockCoursesSet.iterator());
    }

    @Test
    void testGetNumInstructorWithMock() {
        assertEquals(1L, mockInstructor.getNumInstructor());
    }

    @Test
    void testGetFirstNameWithMock() {
        assertEquals("MockFirstName", mockInstructor.getFirstName());
    }

    @Test
    void testGetLastNameWithMock() {
        assertEquals("MockLastName", mockInstructor.getLastName());
    }

    @Test
    void testGetDateOfHireWithMock() {
        assertEquals(LocalDate.of(2022, 1, 1), mockInstructor.getDateOfHire());
    }

    @Test
    void testGetCoursesWithMock() {
        assertEquals(1, mockInstructor.getCourses().size());
        // Add more assertions as needed based on your actual implementation
    }
}
