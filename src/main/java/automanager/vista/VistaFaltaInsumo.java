package automanager.vista;

import automanager.controlador.ControladorFaltaInsumo;
import automanager.modelo.Proveedor;

import java.util.ArrayList;
import java.util.Scanner;

//Vista para registrar la falta de insumos.
public class VistaFaltaInsumo {

    private ControladorFaltaInsumo controlador;
    private ArrayList<Proveedor> listaProveedores;
    private Scanner scanner;

    // Constructor de la vista.
    public VistaFaltaInsumo(ControladorFaltaInsumo controlador, ArrayList<Proveedor> listaProveedores) {
        this.controlador = controlador;
        this.listaProveedores = listaProveedores;
        this.scanner = new Scanner(System.in);
    }

    // Ejecuta el flujo para registrar una nueva falta de insumo.
    public void mostrarFormularioRegistro() {
        System.out.println("=== Registrar falta de insumo ===");

        System.out.print("Ingrese la descripción del insumo faltante: ");
        String descripcion = scanner.nextLine();

        // Mostrar lista de proveedores
        System.out.println("\nSeleccione el proveedor al que se debe contactar:");
        for (int i = 0; i < listaProveedores.size(); i++) {
            Proveedor proveedor = listaProveedores.get(i);
            System.out.println((i + 1) + ". " + proveedor.getNombre() + " - " + proveedor.getDescripcion());
        }

        int seleccion = -1;
        while (seleccion < 1 || seleccion > listaProveedores.size()) {
            System.out.print("Ingrese el número correspondiente al proveedor: ");
            while (!scanner.hasNextInt()) {
                System.out.print("⚠️ Ingrese un número válido: ");
                scanner.next(); // descartar entrada no numérica
            }
            seleccion = scanner.nextInt();
            scanner.nextLine(); // Limpiar salto de línea
        }

        Proveedor proveedorSeleccionado = listaProveedores.get(seleccion - 1);

        // Registrar la falta
        controlador.registrarFalta(descripcion, proveedorSeleccionado);
    }
}
