package grupo4.modelo;

public class Vehiculo {
    private String placa;
    private TipoVehiculo tipo;
    
    public Vehiculo(String placa, TipoVehiculo tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }


    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    

    
    
}
