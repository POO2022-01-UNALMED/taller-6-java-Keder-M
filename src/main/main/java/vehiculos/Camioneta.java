package vehiculos;

public class Camioneta extends Vehiculo{

    private static int cantidadCamionetas;
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, float precio, float peso, Fabricante fabricante, boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.cantidadCamionetas++;
    }

    public void setVolco(boolean volco){
        this.volco = volco;
    }

    public boolean isVolco(){
        return volco;
    }

    public static int getCantidadCamionetas(){
        return Camioneta.cantidadCamionetas;
    }
}


