package practica1;

import javax.swing.JOptionPane;

public class Menu {
// instanciamos la clase Pila 
    Pila p = new Pila();
// creamos el menu
    public void menu() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion deseada :" + "\n"
                + "1.Agregar elemento" + "\n"
                + "2.Extraer elemento" + "\n"
                + "3.Mostrar elemento" + "\n"
                + "4.Salir"));

        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Agregar elemento");
                p.apilar();
                p.mostrar();
                menu();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Extraer elemento");
                p.desapilar();
                p.mostrar();
                menu();
            case 3:
                JOptionPane.showMessageDialog(null, "Mostrar elemento");
                p.mostrar();
                menu();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Usted esta saliendo del sistema , gracias");
                System.exit(0);

        }
    }
}
