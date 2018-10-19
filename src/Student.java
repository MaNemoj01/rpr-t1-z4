public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;

    public Student (String ime, String prezime, int broj) {
        this.ime=ime; this.prezime=prezime; this.brojIndeksa=broj;
    }

    public String getIme() {                // daj ime
        return ime;
    }

    public void setIme(String ime) {           // postavi ime
        this.ime = ime;
    }

    public String getPrezime() {                // daj prezime
        return prezime;
    }

    public void setPrezime(String prezime) {    //postavi prezime
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {   // daj broj indeksa
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {  // postavi broj indeksa
        this.brojIndeksa = brojIndeksa;
    }

    public String toString() {                      // ispis studenta
        return prezime + " " + ime + " (" + brojIndeksa + ")";
    }
}
