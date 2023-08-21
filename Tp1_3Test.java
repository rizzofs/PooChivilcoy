import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tp1_3Test {

    @Test
    public void testApilarElemento() {
        Tp1_3.Pila pila = new Tp1_3().new Pila();
        pila.apilar_elemento(10);
        assertFalse(pila.pila_es_vacia());
        assertEquals(1, pila.longitud_pila());
    }

    @Test
    public void testDesapilarElemento() {
        Tp1_3.Pila pila = new Tp1_3().new Pila();
        pila.apilar_elemento(10);
        int valorDesapilado = pila.desapilar_elemento();
        assertTrue(pila.pila_es_vacia());
        assertEquals(10, valorDesapilado);
    }

    @Test
    public void testLongitudPila() {
        Tp1_3.Pila pila = new Tp1_3().new Pila();
        pila.apilar_elemento(10);
        pila.apilar_elemento(20);
        assertEquals(2, pila.longitud_pila());
    }

    @Test
    public void testPilaEsVacia() {
        Tp1_3.Pila pila = new Tp1_3().new Pila();
        assertTrue(pila.pila_es_vacia());
        pila.apilar_elemento(10);
        assertFalse(pila.pila_es_vacia());
    }
}
