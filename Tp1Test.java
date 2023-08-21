import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Tp1Test {

    @Test
    public void testAgregarElemento() {
        Tp1.ListaEnlazada lista = new Tp1().new ListaEnlazada();
        lista.agregarElemento(10);
        assertEquals(1, lista.obtenerLongitud());
    }

    @Test
    public void testEliminarElemento() {
        Tp1.ListaEnlazada lista = new Tp1().new ListaEnlazada();
        lista.agregarElemento(10);
        lista.eliminarElemento(10);
        assertTrue(lista.estaVacia());
    }

    @Test
    public void testRecuperarElemento() {
        Tp1.ListaEnlazada lista = new Tp1().new ListaEnlazada();
        lista.agregarElemento(10);
        assertEquals(10, lista.recuperarElemento(0));
    }

    @Test
    public void testInsertarElemento() {
        Tp1.ListaEnlazada lista = new Tp1().new ListaEnlazada();
        lista.agregarElemento(10);
        lista.insertarElemento(20, 0);
        assertEquals(20, lista.recuperarElemento(0));
    }
}
