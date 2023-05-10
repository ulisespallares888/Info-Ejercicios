package dominio;

import dominio.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class App {
    //Atributo global
    private  static  List<Categoria> categorias = CategoriasDB.dameCategorias();
    private  static  List<Categoria> categoriasCredasPorMi = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    private static List<Producto> productosCreadosPorMi = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        String opcion = "";
        while (!opcion.equals("#")){
            System.out.println("----------------MENU-------------");
            System.out.println("1: CREAR UNA CATEGORIA NUEVA (recomendable hacer primero)");
            System.out.println("2: CREAR UN NUEVO PRODUCTO");
            System.out.println("3: CARGAR MASIVA DE PRODUCTOS (cargara una lista de Productos)");
            System.out.println("4: LISTAR PRODUCTOS POR CATEGORIA");
            System.out.println("5: LISTAR LOS 5 PRODUCTOS MAS CAROS");
            System.out.println("6: LISTAR LOS 5 PRODUCTOS MAS BARATOS");
            System.out.println("# : PARA SALIR");
            opcion = getScanner().next();
            elegirOpcionMenu(opcion);
        }
    }

    private static void elegirOpcionMenu(String opcion){
        switch (opcion){
            case "1":{ System.out.println(crearCategoria());System.out.println(categorias); break;}
            case "2":{ System.out.println(crearProducto()); break; }
            case "3":{ productos.clear(); productos = ProductosDB.dameProductos(); productos.addAll(productosCreadosPorMi); System.out.println(productos);
                cargarProductosEnCategorias(); break;}
            case "4":{ System.out.println("INGRESE CATEGORIA");System.out.println(listarProductosPorCategoria(getScanner().next())); break;}
            case "5":{ System.out.println(losCincoMasCaros()); break;}
            case "6":{ System.out.println(losCincoMasBaratos());break;}
            default:{System.out.println("OPCION INEXISTENTE"); }
        }
    }
    private static Producto crearProducto(){
        Producto productoNuevo = new Producto();
        productoNuevo.setId(UUID.randomUUID());
        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO : ");
        productoNuevo.setNombre(getScanner().next());
        System.out.println("INGRESE LA DESCRIPCION DEL PRODUCTO : ");
        productoNuevo.setDescripcion(getScanner().next());
        productoNuevo.setPrecioActual(crearPrecioActual());
        System.out.println("INGRESE LA CATEGORIA DEL PRODUCTO : ");
        Categoria cat = buscarCategoria(getScanner().next());
        if (cat == null) {
            productoNuevo.setCategoria(crearCategoriaEnProductos(productoNuevo,cat));
        }else {
            productoNuevo.setCategoria(cat);
        }
            System.out.println("¿TIENE DESCUENTO? Si ingrese 1 - No ingrese 0: ");
            int quieroDescuento = getScanner().nextInt();
            if (quieroDescuento == 1){
                productoNuevo = asignarPrecioTachado(productoNuevo);
            }
            productosCreadosPorMi.add(productoNuevo);
            productos.addAll(productosCreadosPorMi);
            cargarProductosEnCategorias();

        return productoNuevo;

    }

    private static Categoria crearCategoriaEnProductos(Producto productoNuevo, Categoria cat){
        while(cat == null) {
            System.out.println("LA CATEGORIA QUE INGRESO NO EXISTE");
            System.out.println("LAS CATEGORIAS DISPONIBLES SON");
            for (int i = 0; i < categorias.size(); i++) {
                System.out.println(categorias.get(i).getNombre());
            }
            String opcion = "";
            while (cat == null) {
                System.out.println("¿DESEA CREAR UNA CATEGORIA NUEVA? SI/NO/INGRESAR DE NUEVO (0/1/2)");
                opcion = getScanner().next();
                if (opcion.equals("0")) {
                    productoNuevo.setCategoria(crearCategoria());
                    break;
                } else if (opcion.equals("1")) {
                    System.out.println("NO SE PUDO CREAR EL PRODUCTO");
                    productoNuevo = null;
                    System.gc();
                    break;
                } else if (opcion.equals("2")) {
                    System.out.println("INGRESE UNA NUEVA CATEGORIA");
                    opcion = getScanner().next();
                    cat = buscarCategoria(opcion);
                    if (cat != null) {
                        productoNuevo.setCategoria(cat);
                    }
                }
            } break;
        }
        return productoNuevo.getCategoria();
    }

    public static Producto asignarPrecioTachado( Producto productoNuevo){
        productoNuevo.setPrecioTachado(crearPrecioTachado(productoNuevo.getPrecioActual()));
        productoNuevo.setPrecioActual(crearPrecioActual());
        productoNuevo.setDescuento(clacularDescuento(productoNuevo.getPrecioTachado().getValor(),productoNuevo.getPrecioActual().getValor()));
        return productoNuevo;
    }

    public static int clacularDescuento(double precioTachado, double precioActual){
        int descuento = (int) (100 - 100/(precioTachado/precioActual)) ;
        return descuento;
    }


    private static PrecioActual crearPrecioActual(){
        PrecioActual precioActual = new PrecioActual();
        System.out.println("INGRESE PRECIO DEL PRODUCTO actual : ");
        precioActual.setValor(getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());
        return precioActual;
    }

    private static PrecioTachado crearPrecioTachado(){
        PrecioTachado precioTachado = new PrecioTachado();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioTachado.setValor(getScanner().nextDouble());
        precioTachado.setFechaDeCarga(LocalDateTime.now());
        precioTachado.setFechaDeFinalizacion(LocalDateTime.of(2024,5,10,0,0,0));
        return precioTachado;
    }

    private static PrecioTachado crearPrecioTachado(PrecioActual precioActual){
        PrecioTachado precioTachado = new PrecioTachado();
        precioTachado.setValor(precioActual.getValor());
        precioTachado.setFechaDeCarga(precioActual.getFechaDeCarga());
        precioTachado.setFechaDeFinalizacion(precioActual.getFechaDeCarga());
        return precioTachado;
    }

    private static Categoria crearCategoria() {
        Categoria categoriaNueva = new Categoria();
        System.out.println("INGRESE NOMBRE DE LA CATEGORIA : ");
        categoriaNueva.setNombre(getScanner().next());
        System.out.println("INGRESE DESCRIPCION DE LA CATEGORIA : ");
        categoriaNueva.setDescripcion(getScanner().next());
        System.out.println("INGRESE SI LA CATEGORIA ESTA DISPONIBLE (Si ingrese 1 - No ingrese 0) : ");
        int disp= getScanner().nextInt();
        categoriaNueva.setestaDisponible((disp == 1)? true:false);
        categoriasCredasPorMi.add(categoriaNueva);
        categorias.addAll(categoriasCredasPorMi);
        return categoriaNueva;
    }

    private static List<Producto> listarProductosPorCategoria( String categoriaBuscar){
        List<Producto> productosPorCategoria = new ArrayList<Producto>();
        Categoria categoriaBuscada = buscarCategoria(categoriaBuscar);
        if(categoriaBuscada != null) {
            if (categoriaBuscada.isestaDisponible() == true) {
                for (int i = 0; i < productos.size(); i++) {
                    if (productos.get(i).getCategoria().getNombre() == categoriaBuscada.getNombre()) {
                        productosPorCategoria.add(productos.get(i));
                    }
                }
            } else { System.out.println("NO ESTA DISPONIBLE LA CATEGORIA !!! " + categoriaBuscada.getNombre()); }
        } else { System.out.println("LA CATEGORIA NO EXISTE !!! " + categoriaBuscada); }
        return productosPorCategoria;
    }


    private static ArrayList<Producto> losCincoMasCaros(){
        List<Producto> productosCaros = new ArrayList<Producto>();
        List<Producto> productosOrdenados = productos.stream().sorted((p1, p2) -> Double.compare(p2.getPrecioActual().getValor(), p1.getPrecioActual().getValor())).toList();
        for (int i = 0; i < 5 && i < productosOrdenados.size(); i++) {
            productosCaros.add(productosOrdenados.get(i));
        }
        return (ArrayList<Producto>) productosCaros;
    }

    private static ArrayList<Producto> losCincoMasBaratos(){
        List<Producto> productosBaratos = new ArrayList<Producto>();
        List<Producto> productosOrdenados = productos.stream().sorted((p1, p2) -> Double.compare(p1.getPrecioActual().getValor(), p2.getPrecioActual().getValor())).toList();
        for (int i = 0; i < 5 && i < productosOrdenados.size(); i++) {
            productosBaratos.add(productosOrdenados.get(i));
        }
        return (ArrayList<Producto>) productosBaratos;
    }

    public static void cargarProductosEnCategorias(){
        List<Producto> listaAuxiliar = new ArrayList<Producto>();
        for (int i = 0; i < categorias.size() ;i++){
            for (int j = 0; j < productos.size() ;j++){
                if(productos.get(j).getCategoria().getNombre().equals(categorias.get(i).getNombre())){
                    listaAuxiliar.add(productos.get(j));
                }
            }
            categorias.get(i).setListaProductos(listaAuxiliar);
            listaAuxiliar.clear();
        }

    }

    public static Categoria buscarCategoria(String nombre){
        boolean encontrado = false;
        int posicionDeCategoria = 0;
        for (int i = 0; i < categorias.size() ;i++){
            if(nombre.equals(categorias.get(i).getNombre())){
                encontrado = true;
                posicionDeCategoria = i;
            }
        }
        if(encontrado){
            return categorias.get(posicionDeCategoria);
        } else  {
            return null;}
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
