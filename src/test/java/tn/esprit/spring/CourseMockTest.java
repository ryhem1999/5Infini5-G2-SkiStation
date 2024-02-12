package tn.esprit.spring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.Color;
import tn.esprit.spring.entities.Course;
import tn.esprit.spring.entities.Support;
import tn.esprit.spring.entities.TypeCourse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CourseMockTest {

    @Mock
    private Course mockCourse;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockCourse.getNumCourse()).thenReturn(2L);
        when(mockCourse.getTypeCourse()).thenReturn(TypeCourse.COLLECTIVE_ADULT);
        when(mockCourse.getSupport()).thenReturn(Support.SNOWBOARD);
        when(mockCourse.getPrice()).thenReturn(100.f);
        when(mockCourse.getLevel()).thenReturn(2);
    }

    @Test
    void testGetNumCourseWithMock() {
        assertEquals(2L, mockCourse.getNumCourse());
    }

    @Test
    void testGetTypeCourseWithMock() {
        assertEquals(TypeCourse.COLLECTIVE_ADULT, mockCourse.getTypeCourse());
    }

    @Test
    void testGetSupportWithMock() {
        assertEquals(Support.SNOWBOARD, mockCourse.getSupport());
    }

    @Test
    void testGetPriceWithMock() {
        assertEquals(100.f, mockCourse.getPrice());
    }

    @Test
    void testGetLevelWithMock() {
        assertEquals(2, mockCourse.getLevel());
    }
}