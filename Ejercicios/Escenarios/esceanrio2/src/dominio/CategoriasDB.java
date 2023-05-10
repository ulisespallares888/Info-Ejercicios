package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class CategoriasDB {
    public static ArrayList<Categoria> listaCatgorias = dameCategorias();
    public static ArrayList<Categoria> dameCategorias() {
        ArrayList<Categoria> listaCatgorias = new ArrayList<>();
        Categoria categoria1,categoria2,categoria3,categoria4,categoria5,categoria6 = new Categoria();
        listaCatgorias.add( categoria1 = new Categoria("Juguetes","Figuras de acción,vehículos, naves y playsets que permiten recrear escenas y batallas de las películas y series de Star Wars. Ideales para niños y coleccionistas por igual.\n",	true));
        listaCatgorias.add( categoria2 = new Categoria("Coleccionables","Piezas únicas y limitadas que abarcan desde figuras de edición especial, hasta objetos de coleccionismo, como réplicas de sables láser, cascos, bustos y maquetas de naves.\n.",	true));
        listaCatgorias.add( categoria3 = new Categoria("Ropa y disfraces","Camisetas, sudaderas, chaquetas, gorras y disfraces de personajes de Star Wars para fans de todas las edades. Perfectos para eventos temáticos, convenciones y el día a día.\n.",	true));
        listaCatgorias.add( categoria4 = new Categoria("Libros y revistas","Novelas, cómics, guías, enciclopedias y revistas de Star Wars para conocer en profundidad el universo expandido y sus personajes. Ideal para los fans que quieren sumergirse en historias y detalles más allá de las películas.\n",	true));
        listaCatgorias.add( categoria5 = new Categoria("Decoración","Posters, cuadros, esculturas, lámparas y otros objetos de decoración inspirados en Star Wars para darle un toque especial y temático a cualquier habitación o espacio del hogar.\n",	true));
        listaCatgorias.add( categoria6 = new Categoria("Cocina y hogar","Utensilios de cocina, vasos, platos, tazas y otros accesorios con diseños de Star Wars para agregar un toque divertido a la hora de cocinar y comer. Además, toallas, cojines y otros objetos para decorar y personalizar el hogar.\n",	true));


        return listaCatgorias;
    }



}
