package vehiculos;

import java.util.*;

public class Fabricante{

    public static ArrayList<Fabricante> listaFabricantes = new ArrayList<>();
    public int autosPorFabricante;
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        listaFabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricaMayorVentas = new Fabricante("base", new Pais("base"));
        for (int i = 0; i < listaFabricantes.size(); i++){
            if (fabricaMayorVentas.autosPorFabricante < listaFabricantes.get(i).autosPorFabricante){
                fabricaMayorVentas = listaFabricantes.get(i);
            }
        }
        return fabricaMayorVentas;
    }

    public String getNombre(){
        return nombre;
    }

    public Pais getPais(){
        return pais;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }
}


