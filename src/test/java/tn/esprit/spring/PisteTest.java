package tn.esprit.spring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tn.esprit.spring.entities.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PisteTest {

    private Piste piste;

    @BeforeEach
    public void setUp() {
        piste = new Piste();
        piste.setNumPiste(1L);
        piste.setNamePiste("Test Piste");
        piste.setColor(Color.BLUE);
        piste.setLength(500);
        piste.setSlope(30);

        Set<Skier> skiers = new HashSet<>();
        skiers.add(new Skier());
        piste.setSkiers(skiers);
    }

    @Test
    void testGetNumPiste() {
        assertEquals(1L, piste.getNumPiste());
    }

    @Test
    void testGetNamePiste() {
        assertEquals("Test Piste", piste.getNamePiste());
    }

    @Test
    void testGetColor() {
        assertEquals(Color.BLUE, piste.getColor());
    }

    @Test
    void testGetLength() {
        assertEquals(500, piste.getLength());
    }

    @Test
    void testGetSlope() {
        assertEquals(30, piste.getSlope());
    }




}