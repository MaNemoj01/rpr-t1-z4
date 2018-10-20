import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testtoString() {
        Student s = new Student("Pero","Peric",101);
        String expectedS ="Peric Pero (101)";
        assertEquals(expectedS,s.toString());

    }
}