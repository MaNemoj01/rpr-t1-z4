public class Predmet {

    private Student[] spisakStudenata;    //atributi
    private String imePredmeta;
    private int sifraPredmeta;
    private final int maxBrojSstudenata;
    private int trenutniBrojStudenata;

    public Predmet (String ime, int sifra, int maks){
        this.imePredmeta=ime; this.sifraPredmeta=sifra; this.maxBrojSstudenata=maks;
        this.trenutniBrojStudenata=0; this. spisakStudenata = new Student[maks];
    }

    public void upisi(Student student) {       //upis studenta na predmet
        if( maxBrojSstudenata == trenutniBrojStudenata ){
            System.out.println("Nije moguce upisati "+ student +" na predmet, zato sto je predmet popunjen.");
        }
        else {
            this.spisakStudenata[trenutniBrojStudenata] = student;
            this.trenutniBrojStudenata++;
        }
    }

    public void ispisi(Student student) {    // ispis studenta sa predmeta
        int temp=this.trenutniBrojStudenata;
        for(int i=0; i<this.trenutniBrojStudenata; i++){
            if(student.equals(this.spisakStudenata[i])){
                for(int j=i; j<this.trenutniBrojStudenata-1 ; j++)
                {
                    this.spisakStudenata[j] = this.spisakStudenata[j+1];
                }
                this.trenutniBrojStudenata--;
                break;
            }
        }
        if(temp == this.trenutniBrojStudenata){
            System.out.println("Student "+ student +" nije ni upisan/na na predmet " + this.imePredmeta + ".");
        }
    }

    public void ispisSpiskaSvihStudenata(){
        for(int i=0; i< this.trenutniBrojStudenata; i++){
            System.out.println(i+1 + ". "+ this.spisakStudenata[i]);
        }
    }

    public Student[] getSpisakStudenata() {        // daj spisak studenata
        return spisakStudenata;
    }

    public String getImePredmeta() {             // daj ime predmeta
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {   //postavi ime predmeta
        this.imePredmeta = imePredmeta;
    }

    public int getSifraPredmeta() {                  // daj sifru predmeta
        return sifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {    // postavi sifru predmeta
        this.sifraPredmeta = sifraPredmeta;
    }

    public int getMaxBrojSstudenata() {                   //daj maksimalni broj studenata
        return maxBrojSstudenata;
    }


}
