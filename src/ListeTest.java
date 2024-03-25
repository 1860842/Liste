import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {
    Liste data = new Liste();
    @Test
    void setUp(){
        data.ajouter(0);
        data.ajouter(2);
        data.ajouter(4);
        data.ajouter(6);
        data.ajouter(8);
        data.ajouter(10);
    }

    @Test
    void getNbElements() {
    }

    @Test
    void estVide() {
    }

    @Test
    void getElementAt() {
        setUp();
        assertEquals(0,data.getElementAt(0));
        assertEquals(6,data.getElementAt(3));
        assertEquals(10,data.getElementAt(5));


    }

    @Test
    void ajouter() {
    }

    @Test
    void testAjouter() {
    }

    @Test
    void testAjouter1() {
    }

    @Test
    void trouver() {
    }

    @Test
    void trouverTout() {
    }

    @Test
    void effacerAt() {
    }

    @Test
    void effacerTout() {
    }

    @Test
    void testEffacerTout() {
    }
}