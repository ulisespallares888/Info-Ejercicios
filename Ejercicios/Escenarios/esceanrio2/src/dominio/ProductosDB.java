package dominio;
import static dominio.App.clacularDescuento;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



public class ProductosDB {


    public static List<Producto> listaProductos = new ArrayList<Producto>();
   public static ArrayList<Producto> dameProductos() {

       Producto productos1,productos2,productos3,productos4,productos5,productos6,productos7,productos8,productos9,productos10,productos11,productos12,productos13,productos14,productos15,productos16,productos17 = new	Producto();

       listaProductos.add( productos1 = new	Producto	(UUID.randomUUID(),	"Sable de luz de Anakin Skywalker",	"Réplica del icónico casco de Boba Fett, con detalles precisos y visor ajustable.",	buscaCategoria("Juguetes"),	buscarPrecioActual(1500),	buscarPrecioTachado(2000	)));
       listaProductos.add( productos2 = new	Producto	(UUID.randomUUID(),	"Casco de Boba Fett",			"Traje completo de Stormtrooper, hecho a medida y con detalles precisos. Incluye casco, armadura, guantes y botas.",	buscaCategoria("Coleccionables"),	buscarPrecioActual(800),	buscarPrecioTachado(0	)));
       listaProductos.add( productos3 = new	Producto	(UUID.randomUUID(),	"Traje de Stormtrooper"	,"Juego de construcción de la famosa nave de Han Solo. Incluye miniaturas de los personajes de la película.",	buscaCategoria("Ropa y disfraces"),	buscarPrecioActual(3000),	buscarPrecioTachado(5000	)));
       listaProductos.add( productos4 = new	Producto	(UUID.randomUUID(),	"Lego Millenium Falcon", "Juego de construcción de la Estrella de la Muerte, con detalles precisos y miniaturas de naves y personajes de la película.",	buscaCategoria("Juguetes"),	buscarPrecioActual(200),	buscarPrecioTachado(300	)));
       listaProductos.add( productos5 = new	Producto	(UUID.randomUUID(),	"Estrella de la muerte en Lego",			"Réplica a escala del Halcón Milenario, con control remoto y efectos de luz y sonido.",	buscaCategoria("Juguetes"),	buscarPrecioActual(300),	buscarPrecioTachado(0	)));
       listaProductos.add( productos6 = new	Producto	(UUID.randomUUID(),	"Halcón Milenario de control remoto",		"Figura de acción de alta calidad de Darth Vader, con detalles precisos y accesorios intercambiables.",	buscaCategoria("Juguetes"),	buscarPrecioActual(1200),	buscarPrecioTachado(1500)));
       listaProductos.add( productos7 = new	Producto	(UUID.randomUUID(),	"Figura de acción de Darth Vader",			"Modelo a escala del X-wing utilizado por Luke Skywalker, con detalles precisos y efectos de luz y sonido.",	buscaCategoria("Juguetes"),	buscarPrecioActual(50),	buscarPrecioTachado(100	)));
       listaProductos.add( productos8 = new	Producto	(UUID.randomUUID(),	"X-wing de Luke Skywalker",			"Libro de arte de la saga de Star Wars, con ilustraciones y bocetos de personajes, naves y escenarios de la película.",	buscaCategoria("Coleccionables"),	buscarPrecioActual(500),	buscarPrecioTachado(250)));
       listaProductos.add( productos9 = new	Producto	(UUID.randomUUID(),	"Libro de arte de Star Wars",	"Poster a todo color de la saga de Star Wars, con diseños originales y detalles precisos.",	buscaCategoria("Libros y revistas"),	buscarPrecioActual(60),	buscarPrecioTachado(0)));
       listaProductos.add( productos10 = new	Producto	(UUID.randomUUID(),	"Poster de Star Wars",			"Réplica del icónico casco de Darth Vader, con detalles precisos y sistema de voz y respiración integrado.",	buscaCategoria("Decoración"),	buscarPrecioActual(20),	buscarPrecioTachado(0)));
       listaProductos.add( productos11 = new	Producto	(UUID.randomUUID(),	"Casco de Darth Vader",			"Juego de construcción de la nave de Kylo Ren, con detalles precisos y miniaturas de personajes de la película.",	buscaCategoria("Coleccionables"),	buscarPrecioActual(600),	buscarPrecioTachado(0)));
       listaProductos.add( productos12 = new	Producto	(UUID.randomUUID(),	"Nave de Kylo Ren en Lego",	"Taza de cerámica con diseño de R2-D2 y detalles precisos. Ideal para los fans de la saga.",	buscaCategoria("Juguetes"),	buscarPrecioActual(150),	buscarPrecioTachado(347)));
       listaProductos.add( productos13 = new	Producto	(UUID.randomUUID(),	"Taza de R2-D2",	"Réplica de los guantes utilizados por Darth Vader, con detalles precisos y fabricados con materiales de alta calidad.",	buscaCategoria("Cocina y hogar"),	buscarPrecioActual(15),	buscarPrecioTachado(35)));
       listaProductos.add( productos14 = new	Producto	(UUID.randomUUID(),	"Guantes de Darth Vader",			"Figura de vinilo de Yoda, de la línea Funko Pop, con diseño caricaturesco y detalles precisos.",	buscaCategoria("Ropa y disfraces"),	buscarPrecioActual(100),	buscarPrecioTachado(0)));
       listaProductos.add( productos15 = new	Producto	(UUID.randomUUID(),	"Funko Pop de Yoda",			"Poster a todo color de Darth Vader, con diseños originales y detalles precisos.",	buscaCategoria("Juguetes"),	buscarPrecioActual(10),	buscarPrecioTachado(15)));
       listaProductos.add( productos16 = new	Producto	(UUID.randomUUID(),	"Poster de Darth Vader",			"Modelo a escala de la nave Slave I, utilizada por Boba Fett, con detalles precisos y miniaturas de personajes de la película.",	buscaCategoria("Decoración"),	buscarPrecioActual(20),	buscarPrecioTachado(35)));
       listaProductos.add( productos17 = new	Producto	(UUID.randomUUID(),	"Nave Slave I de Boba Fett",			"Modelo a escala de la nave Slave I, utilizada por Boba Fett, con detalles precisos y miniaturas de personajes de la película.",	buscaCategoria("Coleccionables"),	buscarPrecioActual(400),	buscarPrecioTachado(500	)));

       cagarDescuento();

       return (ArrayList<Producto>) listaProductos;
    }
        public static Categoria buscaCategoria(String nombre) {
            List<Categoria> categorias = CategoriasDB.dameCategorias();
            for (int i = 0; i < categorias.size(); i++) {
                if (categorias.get(i).getNombre() == nombre) {
                    return categorias.get(i);
                }
            }
            return null;
        }

        public  static  PrecioActual buscarPrecioActual(int valor){
           PrecioActual precioActual = new PrecioActual();
           precioActual.setValor(valor);
           precioActual.setFechaDeCarga(LocalDateTime.now());
           return precioActual;
        }

        public  static  PrecioTachado buscarPrecioTachado(int valor){
            PrecioTachado precioTachado = new PrecioTachado();
            precioTachado.setValor(valor);
            precioTachado.setFechaDeCarga(LocalDateTime.now());
            precioTachado.setFechaDeFinalizacion(LocalDateTime.now());
            return precioTachado;
        }
        public static void cagarDescuento() {
            for (int i = 0; i < listaProductos.size(); i++) {
                if(listaProductos.get(i).getPrecioTachado().getValor() != 0.0){
                    listaProductos.get(i).setDescuento(clacularDescuento(listaProductos.get(i).getPrecioTachado().getValor(),listaProductos.get(i).getPrecioActual().getValor()));
                }
            }
        }


}

