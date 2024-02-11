package tn.esprit.spring;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import tn.esprit.spring.entities.Course;
import tn.esprit.spring.entities.Registration; // Ajout de cette ligne
import tn.esprit.spring.entities.Support;
import tn.esprit.spring.entities.TypeCourse;

public class testcourse {

    private Course course;

    @Before
    public void setUp() {
        course = new Course();
    }

    @Test
    public void testGettersAndSetters() {
        // Mock dependencies
        course = Mockito.spy(new Course());

        // Set values using setter methods
        course.setNumCourse(1L);
        course.setLevel(2);
        course.setTypeCourse(TypeCourse.COLLECTIVE_CHILDREN);
        course.setSupport(Support.SKI);
        course.setPrice(50.0f);
        course.setTimeSlot(10);

        // Test getters
        assertEquals(Long.valueOf(1L), course.getNumCourse());
        assertEquals(2, course.getLevel());
        assertEquals(TypeCourse.COLLECTIVE_CHILDREN, course.getTypeCourse());
        assertEquals(Support.SKI, course.getSupport());
        assertEquals(50.0f, course.getPrice(), 0.0f);
        assertEquals(10, course.getTimeSlot());
    }

    @Test
    public void testRegistrations() {
        // Test initial registrations is not null
        assertNotNull(course.getRegistrations());

        // Test setting and getting registrations
        Set<Registration> registrations = new HashSet<>();
        Registration registration1 = mock(Registration.class);
        Registration registration2 = mock(Registration.class);
        registrations.add(registration1);
        registrations.add(registration2);

        course.setRegistrations(registrations);

        assertEquals(registrations, course.getRegistrations());
    }
}
