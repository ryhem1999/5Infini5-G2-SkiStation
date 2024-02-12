package tn.esprit.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.Subscription;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SubscriptionMockTest {

    @Mock
    private Subscription mockSubscription;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockSubscription.getNumSub()).thenReturn(1L);
        when(mockSubscription.getStartDate()).thenReturn(LocalDate.of(2023, 1, 1));
        when(mockSubscription.getEndDate()).thenReturn(LocalDate.of(2024, 1, 1));
        when(mockSubscription.getPrice()).thenReturn(50.0f);
    }

    @Test
    void testGetNumSubWithMock() {
        assertEquals(1L, mockSubscription.getNumSub());
    }

    @Test
    void testGetStartDateWithMock() {
        assertEquals(LocalDate.of(2023, 1, 1), mockSubscription.getStartDate());
    }

    @Test
    void testGetEndDateWithMock() {
        assertEquals(LocalDate.of(2024, 1, 1), mockSubscription.getEndDate());
    }

    @Test
    void testGetPriceWithMock() {
        assertEquals(50.0f, mockSubscription.getPrice());
    }
}
