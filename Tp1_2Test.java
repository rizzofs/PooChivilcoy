import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tp1_2Test {

    @Test
    public void testAgregarElemento() {
        Tp1_2.ListaEnlazada lista = new Tp1_2().new ListaEnlazada();
        lista.agregarElemento(10);
        assertEquals(1, lista.obtenerLongitud());
    }

    @Test
    public void testEliminarElemento() {
        Tp1_2.ListaEnlazada lista = new Tp1_2().new ListaEnlazada();
        lista.agregarElemento(10);
        lista.eliminarElemento(10);
        assertTrue(lista.estaVacia());
    }

    @Test
    public void testRecuperarElemento() {
        Tp1_2.ListaEnlazada lista = new Tp1_2().new ListaEnlazada();
        lista.agregarElemento(10);
        assertEquals(10, lista.recuperarElemento(0));
    }

    @Test
    public void testInsertarElemento() {
        Tp1_2.ListaEnlazada lista = new Tp1_2().new ListaEnlazada();
        lista.agregarElemento(10);
        lista.insertarElemento(20, 0);
        assertEquals(20, lista.recuperarElemento(0));
    }
}
