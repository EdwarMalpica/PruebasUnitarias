import static org.junit.jupiter.api.Assertions.*;

class CalificacionTest {

    @org.junit.jupiter.api.Test
    void calificacion() {
        Calificacion c = new Calificacion();
        String resultado = c.calificacion(9, 9, 10);
        assertEquals("Excelente", resultado);
    }
    @org.junit.jupiter.api.Test
    public void testCalificacionBuena() {
        Calificacion c = new Calificacion();
        String resultado = c.calificacion(8, 8, 7);
        assertEquals("Buena", resultado);
    }

    @org.junit.jupiter.api.Test
    public void testCalificacionAceptable() {
        Calificacion c = new Calificacion();
        String resultado = c.calificacion(6, 7, 7);
        assertEquals("Aceptable", resultado);
    }

    @org.junit.jupiter.api.Test
    public void testCalificacionReprobado() {
        Calificacion c = new Calificacion();
        String resultado = c.calificacion(5, 3, 2);
        assertEquals("Reprobado", resultado);
    }

}