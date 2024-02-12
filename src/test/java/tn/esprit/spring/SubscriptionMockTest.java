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
        when(mockRegistration.getNumWeek()).thenReturn(3);
        when(mockRegistration.getSkier()).thenReturn(mockSkier);
        when(mockRegistration.getCourse()).thenReturn(mockCourse);

        // Set up mocks for Skier entity
        when(mockSkier.getSkierId()).thenReturn(101L);
        when(mockSkier.getFirstName()).thenReturn("MockSkierFirstName");
        when(mockSkier.getLastName()).thenReturn("MockSkierLastName");
        // Add more fields and behavior as needed for Skier entity

        // Set up mocks for Course entity
        when(mockCourse.getNumCourse()).thenReturn(201L);
        when(mockCourse.getLevel()).thenReturn(2);
        when(mockCourse.getTypeCourse()).thenReturn(TypeCourse.ADVANCED);
        when(mockCourse.getSupport()).thenReturn(Support.ONLINE);
        when(mockCourse.getPrice()).thenReturn(29.99f);
        when(mockCourse.getTimeSlot()).thenReturn(3);
        // Add more fields and behavior as needed for Course entity
    }

    @Test
    void testGetNumRegistrationWithMock() {
        assertEquals(1L, mockRegistration.getNumRegistration());
    }

    @Test
    void testGetNumWeekWithMock() {
        assertEquals(3, mockRegistration.getNumWeek());
    }

    @Test
    void testGetSkierWithMock() {
        assertEquals(mockSkier, mockRegistration.getSkier());
    }

    @Test
    void testGetCourseWithMock() {
        assertEquals(mockCourse, mockRegistration.getCourse());
    }
}
