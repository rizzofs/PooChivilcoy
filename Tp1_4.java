public class Tp1_4 {
    public class Nodo {
        private int valor;
        Nodo siguiente;

        public Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    public class Cola {
        private Nodo frente_cola;
        private Nodo final_cola;

        private int longitud;

        public Cola() {
            frente_cola = null;
            final_cola = null;
            longitud = 0;
        }

        public boolean cola_es_vacia() {
            return frente_cola == null;
        }

        public int longitud_cola(){ return longitud;}

        public void encolar(int valor){
            Nodo nuevoNodo = new Nodo(valor);
            if(frente_cola==null){
                frente_cola=nuevoNodo;
            }
            else{
                Nodo actual = frente_cola;
                while(actual.siguiente != null){
                    actual.siguiente = actual;
                }
                actual.siguiente =frente_cola;
            }
            longitud++;
        }

        public void desencolar(){
            if(frente_cola == null){
                throw new IndexOutOfBoundsException("No hay elementos para desencolar");
            }
            int valorFrente = frente_cola.valor;
            frente_cola = frente_cola.siguiente;
            longitud--;

        }
    }
}
