import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void upisi() {
        Predmet p = new Predmet("RPR", 111, 1);
        Student s = new Student("Pero","Peric",101);
        p.upisi(s);
        Student[] spisak = p.getSpisakStudenata();
        assertEquals(spisak[0],s);
    }

    @Test
    void ispisi() {
        Predmet p = new Predmet("RPR", 111, 1);
        Student s = new Student("Pero","Peric",101);
        p.upisi(s);
        p.ispisi(s);
        Student[] spisak = p.getSpisakStudenata();
        assertEquals(spisak[0],s);
    }


}