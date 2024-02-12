package tn.esprit.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class InstructorMockTest {

    @Mock
    private Instructor mockInstructor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockInstructor.getNumInstructor()).thenReturn(2L);
        when(mockInstructor.getFirstName()).thenReturn("Ghassen");
        when(mockInstructor.getLastName()).thenReturn("Fathallah");
        when(mockInstructor.getDateOfHire()).thenReturn(LocalDate.now());
    }

    @Test
    void testGetNumInstructorWithMock() {
        assertEquals(2L, mockInstructor.getNumInstructor());
    }

    @Test
    void testGetFirstNameWithMock() {
        assertEquals("Ghassen", mockInstructor.getFirstName());
    }

    @Test
    void testGetLastNameWithMock() {
        assertEquals("Fathallah", mockInstructor.getLastName());
    }

    @Test
    void testGetDateOfHireWithMock() {
        assertEquals(LocalDate.now(), mockInstructor.getDateOfHire());
    }

}