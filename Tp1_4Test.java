import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tp1_4Test {

    @Test
    public void testEncolar() {
        Tp1_4.Cola cola = new Tp1_4().new Cola();
        cola.encolar(10);
        assertFalse(cola.cola_es_vacia());
        assertEquals(1, cola.longitud_cola());
    }

    @Test
    public void testDesencolar() {
        Tp1_4.Cola cola = new Tp1_4().new Cola();
        cola.encolar(10);
        cola.desencolar();
        assertTrue(cola.cola_es_vacia());
        assertEquals(0, cola.longitud_cola());
    }

    @Test
    public void testLongitudCola() {
        Tp1_4.Cola cola = new Tp1_4().new Cola();
        cola.encolar(10);
        cola.encolar(20);
        assertEquals(2, cola.longitud_cola());
    }

    @Test
    public void testColaEsVacia() {
        Tp1_4.Cola cola = new Tp1_4().new Cola();
        assertTrue(cola.cola_es_vacia());
        cola.encolar(10);
        assertFalse(cola.cola_es_vacia());
    }
}

