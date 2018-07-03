public class Produkty {
    private String nazwa;
    private String producent;
    private String cena;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public Produkty(String nazwa, String producent, String cena) {

        this.nazwa = nazwa;
        this.producent = producent;
        this.cena = cena;
    }
}
