package practica1;

public class Nodo {
// clases
    private Pagina pagina;
    private Nodo siguiente;
// constructor
    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(Pagina pagina) {
        this.pagina = null;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
