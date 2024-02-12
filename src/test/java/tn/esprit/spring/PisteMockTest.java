package tn.esprit.spring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.Color;
import tn.esprit.spring.entities.Piste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PisteMockTest {

    @Mock
    private Piste mockPiste;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockPiste.getNumPiste()).thenReturn(2L);
        when(mockPiste.getNamePiste()).thenReturn("MockPiste");
        when(mockPiste.getColor()).thenReturn(Color.BLUE);
        when(mockPiste.getLength()).thenReturn(100);
        when(mockPiste.getSlope()).thenReturn(30);
    }

    @Test
    void testGetNumPisteWithMock() {
        assertEquals(2L, mockPiste.getNumPiste());
    }

    @Test
    void testGetNamePisteWithMock() {
        assertEquals("MockPiste", mockPiste.getNamePiste());
    }

    @Test
    void testGetColorWithMock() {
        assertEquals(Color.BLUE, mockPiste.getColor());
    }

    @Test
    void testGetLengthWithMock() {
        assertEquals(100, mockPiste.getLength());
    }

    @Test
    void testGetSlopeWithMock() {
        assertEquals(30, mockPiste.getSlope());
    }
}
