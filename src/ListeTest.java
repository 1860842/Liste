import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    @org.junit.jupiter.api.Test
    void getNbElements() {
        Liste test = new Liste();
        assertEquals(0, test.getNbElements());

        test.ajouter(0);
        assertEquals(1, test.getNbElements());

        test.ajouter(0);
        assertEquals(2, test.getNbElements());
    }

    @org.junit.jupiter.api.Test
    void estVide() {
    }

    @org.junit.jupiter.api.Test
    void getElementAt() {
    }

    @org.junit.jupiter.api.Test
    void ajouter() {
    }

    @org.junit.jupiter.api.Test
    void testAjouter() {
    }

    @org.junit.jupiter.api.Test
    void testAjouter1() {
    }

    @org.junit.jupiter.api.Test
    void trouver() {
    }

    @org.junit.jupiter.api.Test
    void trouverTout() {
    }

    @org.junit.jupiter.api.Test
    void effacerAt() {
    }

    @org.junit.jupiter.api.Test
    void effacerTout() {
    }

    @org.junit.jupiter.api.Test
    void testEffacerTout() {
    }
}