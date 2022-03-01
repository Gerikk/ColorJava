package tp.color.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    private Color colorHexa;
    private Color colorRGB;

    @BeforeEach
    void setUp(){
        colorHexa = new Color("#D58D35");
        colorRGB = new Color(213, 141, 53);
    }


    /**
     * Tests Hexadecimal
     */
    @Test
    void testConstructorHexa(){
        assertEquals(colorHexa.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
        assertEquals(colorHexa.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
        assertEquals(colorHexa.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");

    }

    @Test
    void testGetRed(){
        assertEquals(colorHexa.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
    }

    @Test
    void testGetGreen(){
        assertEquals(colorHexa.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
    }

    @Test
    void testGetBlue(){
        assertEquals(colorHexa.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testConstructorThrowsExceptionIllegalArgument(){
        assertThrows(IllegalArgumentException.class, ()-> new Color("Test"));
    }


    /**
     * Tests RGB
     */
    @Test
    void testConstructorRGB(){
        assertEquals(colorRGB.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
        assertEquals(colorRGB.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
        assertEquals(colorRGB.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testGetRGBRed(){
        assertEquals(colorRGB.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
    }

    @Test
    void testGetRGBGreen(){
        assertEquals(colorRGB.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
    }

    @Test
    void testGetRGBBlue(){
        assertEquals(colorRGB.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testRGBConstructorThrowsExceptionIllegalArgument(){
        assertThrows(IllegalArgumentException.class, ()-> new Color(-1, 700, 34));
    }


    @AfterEach
    void tearDown(){
        colorHexa = null;
        colorRGB = null;
    }

}