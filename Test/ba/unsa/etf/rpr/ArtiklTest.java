package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    Artikl TestniA = new Artikl("Jabuke", 8, "9876");
    @Test

    void provjeragetKod()
    {
        assertEquals("9876", TestniA.getKod());
    }

    @Test

    void provjeragetNaziv()
    {
        assertEquals("Jabuke", TestniA.getNaziv());
    }

    @Test

    void provjeragetCijena()
    {
        assertEquals(8, TestniA.getCijena());
    }

}