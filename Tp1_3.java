public class Tp1_3 {
    public class Nodo{
        int valor;
        Nodo siguiente;

        public Nodo(int valor){
            this.valor=valor;
            this.siguiente=null;
        }
    }

    public class Pila{
        private Nodo tope;
        private int longitud;

        public Pila(){
            tope=null;
            longitud = 0;
        }

        public boolean pila_es_vacia(){return tope == null;}

        public int longitud_pila(){return longitud;}

        public void apilar_elemento(int valor){
            Nodo nuevoNodo = new Nodo(valor);
            if(tope==null){
                tope=nuevoNodo;
            }
            else{
                Nodo actual = tope;
                while(actual.siguiente != null){
                    actual.siguiente=actual;
                }
                actual.siguiente=tope;
            }
            longitud++;
        }

        public int desapilar_elemento(){
            if(tope==null){
                throw new IndexOutOfBoundsException("No hay elemento en el tope");
            }
            int nuevo_valor= tope.valor;
            tope=tope.siguiente;
            longitud--;
            return nuevo_valor;
        }


    }

}
