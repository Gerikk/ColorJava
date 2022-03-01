package tp.color.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ColorTest {

    private Color colorHexa;
    private Color colorRGB;

    @BeforeEach
    void setUp() {
        colorHexa = new Color("#D58D35");
        colorRGB = new Color(213, 141, 53);
    }

    /**
     * Tests Hexadecimal
     */
    @Test
    void testConstructorHexa() {
        assertEquals(colorHexa.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
        assertEquals(colorHexa.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
        assertEquals(colorHexa.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");

    }

    @Test
    void testGetRed() {
        assertEquals(colorHexa.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
    }

    @Test
    void testSetRedHexa() {
        colorHexa.setRed(34);
        assertEquals(colorHexa.getRed(), 34, "Erreur! setRed pas bon");
    }

    @Test
    void testGetGreen() {
        assertEquals(colorHexa.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
    }

    @Test
    void testSetGreenHexa() {
        colorHexa.setGreen(34);
        assertEquals(colorHexa.getGreen(), 34, "Erreur! setGreen pas bon");
    }

    @Test
    void testGetBlue() {
        assertEquals(colorHexa.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testSetBlueHexa() {
        colorHexa.setBlue(34);
        assertEquals(colorHexa.getBlue(), 34, "Erreur! setBlue pas bon");
    }

    @Test
    void testConstructorThrowsExceptionIllegalArgument() {
        //TODO gestion des cas ou le code hexadecimal est composé de lettres uniquement (ex #FFFFFF)
        assertThrows(IllegalArgumentException.class, () -> new Color("#d58d35"));
    }

    /**
     * Tests RGB
     */
    @Test
    void testConstructorRGB() {
        assertEquals(colorRGB.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
        assertEquals(colorRGB.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
        assertEquals(colorRGB.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testGetRGBRed() {
        assertEquals(colorRGB.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
    }

    @Test
    void testSetRedRGB() {
        colorRGB.setRed(34);
        assertEquals(colorRGB.getRed(), 34, "Erreur! setRed pas bon");
    }

    @Test
    void testGetRGBGreen() {
        assertEquals(colorRGB.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
    }

    @Test
    void testSetGreenRGB() {
        colorRGB.setGreen(34);
        assertEquals(colorRGB.getGreen(), 34, "Erreur! setGreen pas bon");
    }

    @Test
    void testGetRGBBlue() {
        assertEquals(colorRGB.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testSetBlueRGB() {
        colorRGB.setBlue(34);
        assertEquals(colorRGB.getBlue(), 34, "Erreur! setBlue pas bon");
    }

    @Test
    void testRGBConstructorThrowsExceptionIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> new Color(-1, 255, 53));
    }

    @AfterEach
    void tearDown() {
        colorHexa = null;
        colorRGB = null;
    }

}