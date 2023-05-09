package dominio;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private String descripcion;
    private boolean estaDisponible;
    private List<Producto> listaProductos = new ArrayList<>();

    public Categoria(){}

    public Categoria(String nombre, String descripcion, boolean estaDisponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estaDisponible = estaDisponible;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estaDisponible=" + estaDisponible +
                ", listaProductos=" + listaProductos +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) { this.listaProductos.addAll(listaProductos);}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isestaDisponible() {
        return estaDisponible;
    }

    public void setestaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
}
