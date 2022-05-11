package vehiculos;

public class Automovil extends Vehiculo{

    private static int cantidadAutomoviles;
    private int puestos;

    public Automovil(String placa, String nombre, float precio, float peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Automovil.cantidadAutomoviles++;
    }

    public void setPuestos(int puestos){
        this.puestos = puestos;
    }

    public int getPuestos(){
        return puestos;
    }

    public static int getCantidadAutomoviles(){
        return Automovil.cantidadAutomoviles;
    }

}



