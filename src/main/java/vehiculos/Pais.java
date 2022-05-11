package vehiculos;

import java.util.*;

public class Pais{

    public static ArrayList<Pais> listaPaises = new ArrayList<>();
    public int autosPorPais;
    private String nombre;

    public Pais(String nombre){
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public static Pais paisMasVendedor(){
        Pais paisMasVendedor = new Pais("base");
        for (int i = 0; i < listaPaises.size(); i++){
            if (paisMasVendedor.autosPorPais < listaPaises.get(i).autosPorPais){
                paisMasVendedor = listaPaises.get(i);
            }
        }
        return paisMasVendedor;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}




