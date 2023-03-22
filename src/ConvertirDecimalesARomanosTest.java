import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertirDecimalesARomanosTest {

    ConvertirDecimalesARomanos convertidor = new ConvertirDecimalesARomanos();


    // Casos de prueba para la conversión de unidades
    @Test
    public void testUnidades() {
        assertEquals("I", convertidor.convertirDecARomanos(1));
        assertEquals("II", convertidor.convertirDecARomanos(2));
        assertEquals("III", convertidor.convertirDecARomanos(3));
        assertEquals("IV", convertidor.convertirDecARomanos(4));
        assertEquals("V", convertidor.convertirDecARomanos(5));
        assertEquals("VI", convertidor.convertirDecARomanos(6));
        assertEquals("VII", convertidor.convertirDecARomanos(7));
        assertEquals("VIII", convertidor.convertirDecARomanos(8));
        assertEquals("IX", convertidor.convertirDecARomanos(9));
    }

    // Casos de prueba para la conversión de decenas
    @Test
    public void testDecenas() {
        assertEquals("X", convertidor.convertirDecARomanos(10));
        assertEquals("XX", convertidor.convertirDecARomanos(20));
        assertEquals("XXX", convertidor.convertirDecARomanos(30));
        assertEquals("XL", convertidor.convertirDecARomanos(40));
        assertEquals("L", convertidor.convertirDecARomanos(50));
        assertEquals("LX", convertidor.convertirDecARomanos(60));
        assertEquals("LXX", convertidor.convertirDecARomanos(70));
        assertEquals("LXXX", convertidor.convertirDecARomanos(80));
        assertEquals("XC", convertidor.convertirDecARomanos(90));
    }

    // Casos de prueba para la conversión de centenas
    @Test
    public void testCentenas() {
        assertEquals("C", convertidor.convertirDecARomanos(100));
        assertEquals("CC", convertidor.convertirDecARomanos(200));
        assertEquals("CCC", convertidor.convertirDecARomanos(300));
        assertEquals("CD", convertidor.convertirDecARomanos(400));
        assertEquals("D", convertidor.convertirDecARomanos(500));
        assertEquals("DC", convertidor.convertirDecARomanos(600));
        assertEquals("DCC", convertidor.convertirDecARomanos(700));
        assertEquals("DCCC", convertidor.convertirDecARomanos(800));
        assertEquals("CM", convertidor.convertirDecARomanos(900));
    }

    // Casos de prueba para la conversión de miles
    @Test
    public void testMiles() {
        assertEquals("M", convertidor.convertirDecARomanos(1000));
        assertEquals("MM", convertidor.convertirDecARomanos(2000));
        assertEquals("MMM", convertidor.convertirDecARomanos(3000));
    }

}
