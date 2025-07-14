package automanager.controlador;

import automanager.modelo.FaltaInsumo;
import automanager.modelo.Proveedor;
import java.util.ArrayList;

//Controlador encargado de gestionar los registros de insumos sin stock.
public class ControladorFaltaInsumo {
    private ArrayList<FaltaInsumo> faltantes = new ArrayList<>();

    //Registra una nueva falta de insumo con su proveedor correspondiente.
    public void registrarFalta(String descripcion, Proveedor proveedor) {
        FaltaInsumo falta = new FaltaInsumo(descripcion, proveedor);
        faltantes.add(falta);
        System.out.println("✅ Falta registrada exitosamente.");
    }

    //Devuelve la lista de faltas de insumo registradas.
    public ArrayList<FaltaInsumo> obtenerFaltantes() {
        return faltantes;
    }
}
