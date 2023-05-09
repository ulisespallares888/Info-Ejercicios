package dominio;


import java.util.UUID;

public class Producto {
    private UUID id;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private int descuento;
    private PrecioActual precioActual;
    private PrecioTachado precioTachado;

    public Producto(){}
    public Producto(UUID id, String nombre, String descripcion, Categoria categoria,  PrecioActual precioActual, PrecioTachado precioTachado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioActual = precioActual;
        this.precioTachado = precioTachado;
    }


    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public PrecioActual getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(PrecioActual precioActual) {
        this.precioActual = precioActual;
    }

    public PrecioTachado getPrecioTachado() {
        return precioTachado;
    }

    public void setPrecioTachado(PrecioTachado precioTachado) {
        this.precioTachado = precioTachado;
    }

    @Override
    public String toString() {
        String salida =  nombre + " " +
                    descripcion +" " +
                    categoria.getNombre() +" " +
                    precioActual.getValor() +"\n";
                    if (precioTachado != null){
                        salida += descuento + "% "+precioTachado.getValor() +  "\n";
                    }
        return salida;
    }
}
