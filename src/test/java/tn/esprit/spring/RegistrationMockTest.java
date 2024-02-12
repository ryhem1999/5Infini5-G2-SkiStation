import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.Course;
import tn.esprit.spring.entities.Registration;
import tn.esprit.spring.entities.Skier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class RegistrationMockTest {

    @InjectMocks
    private Registration mockRegistration;

    @Mock
    private Skier mockSkier;

    @Mock
    private Course mockCourse;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockRegistration.getNumRegistration()).thenReturn(1L);
        when(mockRegistration.getNumWeek()).thenReturn(2);
        when(mockRegistration.getSkier()).thenReturn(mockSkier);
        when(mockRegistration.getCourse()).thenReturn(mockCourse);

        // Set up mock for Skier entity
        when(mockSkier.getNumSkier()).thenReturn(101L);
        when(mockSkier.getFirstName()).thenReturn("MockSkierFirstName");
        when(mockSkier.getLastName()).thenReturn("MockSkierLastName");

        // Set up mock for Course entity
        when(mockCourse.getNumCourse()).thenReturn(201L);
        when(mockCourse.getLevel()).thenReturn(3);
        // Set other properties of the mockCourse as needed
        // ...
    }

    @Test
    void testGetNumRegistrationWithMock() {
        assertEquals(1L, mockRegistration.getNumRegistration());
    }

    @Test
    void testGetNumWeekWithMock() {
        assertEquals(2, mockRegistration.getNumWeek());
    }

    @Test
    void testGetSkierWithMock() {
        assertEquals(101L, mockRegistration.getSkier().getNumSkier());
        // Add more assertions as needed based on your actual implementation
    }

    @Test
    void testGetCourseWithMock() {
        assertEquals(201L, mockRegistration.getCourse().getNumCourse());
        // Add more assertions as needed based on your actual implementation
    }
}
