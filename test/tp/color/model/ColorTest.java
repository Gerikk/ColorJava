package tp.color.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertAll("Constructeur Hexadecimal incorrect",
                () -> assertEquals(213, colorHexa.getRed(), "Erreur! la valeur de Red est incorrecte"),
                () -> assertEquals(141, colorHexa.getGreen(), "Erreur! la valeur de Green est incorrecte"),
                () -> assertEquals(53, colorHexa.getBlue(), "Erreur! la valeur de Blue est incorrecte")
        );
    }

    @Test
    void testToStringHexa() {
        assertEquals("[value=" + colorHexa.getHexValue() + ", r=" + colorHexa.getRed() + ", g=" + colorHexa.getGreen() + ", b=" + colorHexa.getBlue() + "]",
                colorHexa.toString(),
                "Méthode toString ratée pour Hexa.");
    }

    @Test
    void testGetRed() {
        assertEquals(213, colorHexa.getRed(), "Erreur! la valeur de Red est incorrecte");
    }

    @Test
    void testSetRedHexa() {
        colorHexa.setRed(34);
        assertAll("Objets couleur non conformes",
                () -> assertEquals(34, colorHexa.getRed(), "Erreur! setRed pas bon"),
                () -> assertEquals(141, colorHexa.getGreen(), "Erreur! la valeur de Green est incorrecte"),
                () -> assertEquals(53, colorHexa.getBlue(), "Erreur! la valeur de Blue est incorrecte"),
                () -> assertNotEquals("#D58D35", colorHexa.getHexValue(), "Erreur !  code Hexa non modifié")
        );
    }

    @Test
    void testGetGreen() {
        assertEquals(141, colorHexa.getGreen(), "Erreur! la valeur de Green est incorrecte");
    }

    @Test
    void testSetGreenHexa() {
        colorHexa.setGreen(34);
        assertAll("Objets couleur non conformes",
                () -> assertEquals(213, colorHexa.getRed(), "Erreur! la valeur de Red est incorrecte"),
                () -> assertEquals(34, colorHexa.getGreen(), "Erreur! setGreen pas bon"),
                () -> assertEquals(53, colorHexa.getBlue(), "Erreur! la valeur de Blue est incorrecte"),
                () -> assertNotEquals("#D58D35", colorHexa.getHexValue(), "Erreur !  code Hexa non modifié")
        );
    }

    @Test
    void testGetBlue() {
        assertEquals(53, colorHexa.getBlue(), "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testSetBlueHexa() {
        colorHexa.setBlue(34);
        assertAll("Objets couleur non conformes",
                () -> assertEquals(213, colorHexa.getRed(), "Erreur! la valeur de Red est incorrecte"),
                () -> assertEquals(34, colorHexa.getBlue(), "Erreur! setBlue pas bon"),
                () -> assertEquals(141, colorHexa.getGreen(), "Erreur! la valeur de Green est incorrecte"),
                () -> assertNotEquals("#D58D35", colorHexa.getHexValue(), "Erreur !  code Hexa non modifié")
        );
    }

    @Test
    void testGetHexValueHexa() {
        assertEquals("#D58D35", colorHexa.getHexValue(), "Error getHEx");
    }

    @Test
    void testSetHexValueHex() {
        colorHexa.setHexValue("#D3D3D3");
        assertAll("Objets couleurs incorrects",
                () -> assertEquals(211, colorHexa.getRed(), "Rouge incorrect"),
                () -> assertEquals(211, colorHexa.getGreen(), "Vert incorrect"),
                () -> assertEquals(211, colorHexa.getBlue(), "Bleu incorrect"),
                () -> assertEquals("#D3D3D3", colorHexa.getHexValue(), "Error setHexValue")
        );
    }

    @Test
    void testConstructorThrowsExceptionIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> new Color("#fFFFFF"));
    }

    /**
     * Tests RGB
     */
    @Test
    void testConstructorRGB() {
        assertAll("Constructeur RGB incorrect",
                () -> assertEquals(213, colorRGB.getRed(), "Erreur! la valeur de Red est incorrecte"),
                () -> assertEquals(141, colorRGB.getGreen(), "Erreur! la valeur de Green est incorrecte"),
                () -> assertEquals(53, colorRGB.getBlue(), "Erreur! la valeur de Blue est incorrecte"),
                () -> assertEquals("#D58D35", colorRGB.getHexValue(), "Erreur Code hexa incorrect")
        );
    }

    @Test
    void testToStringRGB() {
        assertEquals("[value=" + colorRGB.getHexValue() + ", r=" + colorRGB.getRed() + ", g=" + colorRGB.getGreen() + ", b=" + colorRGB.getBlue() + "]",
                colorRGB.toString(),
                "Méthode toString ratée pour RGB.");
    }

    @Test
    void testGetRGBRed() {
        assertEquals(213, colorRGB.getRed(), "Erreur! la valeur de Red est incorrecte");
    }

    @Test
    void testSetRedRGB() {
        colorRGB.setRed(34);
        assertAll("Objets couleurs incorrects",
                () -> assertEquals(34, colorRGB.getRed(), "Erreur! setRed pas bon"),
                () -> assertEquals(141, colorRGB.getGreen(), "Erreur! la valeur de Green est incorrecte"),
                () -> assertEquals(53, colorRGB.getBlue(), "Erreur! la valeur de Blue est incorrecte"),
                () -> assertNotEquals("#D58D35", colorRGB.getHexValue(), "Erreur !  code Hexa non modifié")
        );
    }

    @Test
    void testGetRGBGreen() {
        assertEquals(141, colorRGB.getGreen(), "Erreur! la valeur de Green est incorrecte");
    }

    @Test
    void testSetGreenRGB() {
        colorRGB.setGreen(34);
        assertAll("Objets couleurs incorrects",
                () -> assertEquals(213, colorRGB.getRed(), "Erreur! la valeur de Red est incorrecte"),
                () -> assertEquals(34, colorRGB.getGreen(), "Erreur! setGreen pas bon"),
                () -> assertEquals(53, colorRGB.getBlue(), "Erreur! la valeur de Blue est incorrecte"),
                () -> assertNotEquals("#D58D35", colorRGB.getHexValue(), "Erreur !  code Hexa non modifié")
        );
    }

    @Test
    void testGetRGBBlue() {
        assertEquals(53, colorRGB.getBlue(), "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testSetBlueRGB() {
        colorRGB.setBlue(34);
        assertAll("Objets couleurs incorrects",
                () -> assertEquals(213, colorRGB.getRed(), "Erreur! la valeur de Red est incorrecte"),
                () -> assertEquals(34, colorRGB.getBlue(), "Erreur! setBlue pas bon"),
                () -> assertEquals(141, colorRGB.getGreen(), "Erreur! la valeur de Green est incorrecte"),
                () -> assertNotEquals("#D58D35", colorRGB.getHexValue(), "Erreur !  code Hexa non modifié")
        );
    }

    @Test
    void testGetHexValueRGB() {
        assertEquals("#D58D35", colorRGB.getHexValue(), "Error getHEx");
    }

    @Test
    void testSetHexValueRGB() {
        colorRGB.setHexValue("#D3D3D4");
        assertAll("Objets couleurs incorrects",
                () -> assertEquals(Integer.valueOf(colorRGB.getHexValue().substring(1, 3), 16), colorRGB.getRed(), "Erreur couleur rouge"),
                () -> assertEquals(Integer.valueOf(colorRGB.getHexValue().substring(3, 5), 16), colorRGB.getGreen(), "Erreur couleur verte"),
                () -> assertEquals(Integer.valueOf(colorRGB.getHexValue().substring(5, 7), 16), colorRGB.getBlue(), "Erreur couleur bleue"),
                () -> assertEquals("#D3D3D4", colorRGB.getHexValue(), "Error setHexValue")
        );
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