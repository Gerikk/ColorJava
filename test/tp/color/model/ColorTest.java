package tp.color.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    private Color color;

    @BeforeEach
    void setUp(){
        color = new Color("#D58D35");
    }

    @Test
    void testConstructor(){
        assertEquals(color.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
        assertEquals(color.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
        assertEquals(color.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");

    }

    @Test
    void testGetRed(){
        assertEquals(color.getRed(), 213, "Erreur! la valeur de Red est incorrecte");
    }

    @Test
    void testGetGreen(){
        assertEquals(color.getGreen(), 141, "Erreur! la valeur de Green est incorrecte");
    }

    @Test
    void testGetBlue(){
        assertEquals(color.getBlue(), 53, "Erreur! la valeur de Blue est incorrecte");
    }

    @Test
    void testConstructorThrowsExceptionIllegalArgument(){
        assertThrows(IllegalArgumentException.class, ()-> new Color("Test"));
    }

    @AfterEach
    void tearDown(){
        color = null;
    }

}