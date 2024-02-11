package tn.esprit.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.Course;
import tn.esprit.spring.entities.Support;
import tn.esprit.spring.entities.TypeCourse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class testcourse {

    @Mock
    private Course mockCourse;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockCourse.getNumCourse()).thenReturn(1L);
        when(mockCourse.getLevel()).thenReturn(2);
        when(mockCourse.getTypeCourse()).thenReturn(TypeCourse.COLLECTIVE_CHILDREN);
        when(mockCourse.getSupport()).thenReturn(Support.SKI);
        when(mockCourse.getPrice()).thenReturn(50.0f);
        when(mockCourse.getTimeSlot()).thenReturn(10);
    }

    @Test
    void testGetNumCourseWithMock() {
        assertEquals(1L, mockCourse.getNumCourse());
    }

    @Test
    void testGetLevelWithMock() {
        assertEquals(2, mockCourse.getLevel());
    }

    @Test
    void testGetTypeCourseWithMock() {
        assertEquals(TypeCourse.COLLECTIVE_CHILDREN, mockCourse.getTypeCourse());
    }

    @Test
    void testGetSupportWithMock() {
        assertEquals(Support.SKI, mockCourse.getSupport());
    }

    @Test
    void testGetPriceWithMock() {
        assertEquals(50.0f, mockCourse.getPrice());
    }

    @Test
    void testGetTimeSlotWithMock() {
        assertEquals(10, mockCourse.getTimeSlot());
    }
}