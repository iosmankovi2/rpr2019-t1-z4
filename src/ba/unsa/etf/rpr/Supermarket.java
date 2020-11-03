package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikl = new Artikl[1000]; // maksimalno 1000 artikala
    private int broj;
    public boolean dodajArtikl(Artikl a) {
        if(broj < 50) {
            artikl[broj] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            broj++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikl() {
        return artikl;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i <broj; i++) {
            if(artikl[i].getKod().equals(kod)) {
                Artikl novi = new Artikl(artikl[i].getNaziv(), artikl[i].getCijena(), artikl[i].getKod());
                artikl[i] = null;
                pomjeriSve(i);
                return novi;
            }
        }
        return null;
    }

    private void pomjeriSve(int pozicija) {
        for (int i = pozicija; i < broj; i++) {
            artikl[i] = artikl[i + 1];
        }

        artikl[broj] = null;
        broj--;
    }

}
