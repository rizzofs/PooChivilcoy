public class Tp1_2 {


        public class Nodo {
            int valor;
            Nodo siguiente;
            Nodo anterior;

            public Nodo(int valor) {
                this.valor = valor;
                this.siguiente = null;
                this.anterior = null;
            }
        }


        public class ListaEnlazada {
            private Nodo cabeza;
            private Nodo ultimo;
            private int longitud;

            public ListaEnlazada() {
                cabeza = null;
                ultimo = null;
                longitud = 0;
            }

            public boolean estaVacia() {
                return cabeza == null;
            }

            public int obtenerLongitud() {
                return longitud;
            }

            public void agregarElemento(int valor) {
                Nodo nuevoNodo = new Nodo(valor);
                if (cabeza == null) {
                    cabeza = nuevoNodo;
                } else {
                    Nodo actual = cabeza;
                    while (actual.siguiente != null) {
                        actual = actual.siguiente;
                    }
                    actual.siguiente = nuevoNodo;
                }
                longitud++;
            }

            public void eliminarElemento(int valor) {
                if (cabeza == null) {
                    return;
                }
                if (cabeza.valor == valor) {
                    cabeza = cabeza.siguiente;
                    longitud--;
                    return;
                }
                Nodo actual = cabeza;
                while (actual.siguiente != null && actual.siguiente.valor != valor) {
                    actual = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente = actual.siguiente.siguiente;
                    longitud--;
                }
            }

            public int recuperarElemento(int posicion) {
                if (posicion < 0 || posicion >= longitud) {
                    throw new IndexOutOfBoundsException("Posición inválida");
                }
                Nodo actual = cabeza;
                for (int i = 0; i < posicion; i++) {
                    actual = actual.siguiente;
                }
                return actual.valor;
            }

            public void insertarElemento(int valor, int posicion) {
                if (posicion < 0 || posicion > longitud) {
                    throw new IndexOutOfBoundsException("Posición inválida");
                }
                Nodo nuevoNodo = new Nodo(valor);
                if (posicion == 0) {
                    nuevoNodo.siguiente = cabeza;
                    cabeza = nuevoNodo;
                } else {
                    Nodo actual = cabeza;
                    for (int i = 0; i < posicion - 1; i++) {
                        actual = actual.siguiente;
                    }
                    nuevoNodo.siguiente = actual.siguiente;
                    actual.siguiente = nuevoNodo;
                }
                longitud++;
            }
        }




}
