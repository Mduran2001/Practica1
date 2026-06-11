package practica1;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public boolean vacia() {
        // si la cima esta en blanco
        if (cima == null) {
            return true;// nos devuelve que si esta vacia
        } else {
            return false;// sino que esta llena 
        }
    }

    // Ingresar a la pila
    public void apilar() {
// crear un objeto para guaradar datos 
        Pagina d = new Pagina();
// se le solcita que ingrese el nombre
        d.setNombre(JOptionPane.showInputDialog("Porfavor Ingrese el nombre: "));
        // creamos una instancia de nodo
        Nodo nuevo = new Nodo();
        //pasamos el objeto dato al nodo
        nuevo.setPagina(d);
        // insertamos el dato (nombre) en la pila
        nuevo.setSiguiente(cima);
        if (vacia()) {
            cima = nuevo;
        } else {
            //actualiza el puntero al siguiente dato
            nuevo.setSiguiente(cima);
            // colocamos el nodo en la cima 
            cima = nuevo;
        }
    }

    // Se sacan los nombres de la pila 
    public void desapilar() {
        // mientras que tenga algun elemento dentro de la pila
        if (!vacia()) {
            //antes dem muestro los objetos y decido cual extraer
            JOptionPane.showMessageDialog(null, "Datos a extraer : " + cima.getPagina().getNombre());
            // cambio la referencia y elimino el dato
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemenot a sido eliminado");
        } else {//de lo contrario la pila esta vacia y se muestra el mensaje

            JOptionPane.showMessageDialog(null, "La pila esta vacia, no se puede extraer");
        }
    }
// Mostrar historial
    public void mostrar() {
// si la pila esta vacia 
        if (cima == null) {
            // se muestra el mensaje de que el historial esata vacio
            JOptionPane.showMessageDialog(null, "Historial vacio");

        } else {// de lo contrario 
            // se muestran los datos (nombre) que estan en la pila 
            String historial = "Historial \n\n";

            Nodo aux = cima;
            // si es diferente a null 
            while (aux != null) {

                historial += aux.getPagina().getNombre() + "\n";

                aux = aux.getSiguiente();
            }

            JOptionPane.showMessageDialog(null, historial);
        }
    }
}
