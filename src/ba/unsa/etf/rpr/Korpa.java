package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] artikl = new Artikl[50]; //maksimalno 50 artikala
    private int broj = 0;
    public boolean dodajArtikl(Artikl a) {

        if(broj < 50) {
            artikl[broj] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            broj++;
            return  true;
    }
        return  false;
    }

    public Artikl[] getArtikl() {
        return artikl;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < broj; i++) {

            if(artikl[i].getKod().equals(kod)) {
                Artikl novi = new Artikl(artikl[i].getNaziv(), artikl[i].getCijena(), artikl[i].getKod());
                artikl[i] = null;
                pomjeriSveZa(i);
                return novi;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupna_cijena = 0;
        for(int i = 0; i < broj; i++) {
            ukupna_cijena = ukupna_cijena + artikl[i].getCijena();
        }
            return ukupna_cijena;
    }

    private void pomjeriSveZa(int pozicija) {
        for(int i = pozicija; i < broj; i++) {
            artikl[i] = artikl[i+1];
        }
        artikl[broj] = null;
        broj--;
    }


}
