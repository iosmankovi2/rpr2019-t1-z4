package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa korpa;
    private Artikl artikl;
    private Object Executable;

    @BeforeEach

    void setup() {

        korpa = new Korpa();
        artikl = new Artikl("Printer",  1800, "5678");
    }

    @Test

    void daLiSeMozeDodatiArtikl() {

        boolean moze = korpa.dodajArtikl(artikl);
        assertTrue(moze);
    }

    @Test

    void brojArtikalaUKorpi()
    {
        korpa.dodajArtikl(artikl);
        //assertEquals(1, korpa.getArtikl());
    }

    @Test

    void dodajArtiklUPunuKorpu() {

        for(int i = 0; i < 50; i++)
        {
            Artikl artikl = new Artikl("Miš", 30, "4567");
            korpa.dodajArtikl(artikl);
        }
        boolean moze = korpa.dodajArtikl(new Artikl("Mobitel", 1300,"654"));
        assertAll("Nema mjesta u korpi!",
        () -> assertFalse(moze),
                () -> assertEquals(50, korpa.getArtikl())
        );
    }
    @Test

    void IzbacitiArtiklIzKorpe() {

        korpa.dodajArtikl(artikl);
        Artikl za_izbaciti = korpa.izbaciArtiklSaKodom("5678");
        assertAll("Izbaciti",
                () -> assertEquals(artikl.getNaziv(), za_izbaciti.getNaziv()),
                () -> assertEquals(artikl.getCijena(), za_izbaciti.getCijena()),
                () -> assertEquals(artikl.getKod(), za_izbaciti.getKod())
        );
    }





}