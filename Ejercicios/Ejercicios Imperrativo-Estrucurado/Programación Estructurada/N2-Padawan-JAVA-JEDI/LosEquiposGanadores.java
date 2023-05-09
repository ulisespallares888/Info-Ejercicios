/*
Los equipos ganadores : Guarde en variables el nombre de 2 equipos de fútbol,
luego en otras 2 variables el nombre de los entrenadores y luego guarde el nombre
de los jugadores en distintas variables. Luego muestre un encabezado con el
nombre de cada equipo y por cada equipo muestre los nombres de los jugadores.
*/
public class LosEquiposGanadores {
    public static void main(String[] args) {
        String[] boca = {"Boca","Hugo Ibarra","Palermo", "Riquelme"};
        String[] river = {"River","Gallardo","Martinez", "Sosa"};
        System.out.println("Nombre: " + boca[0]);
        System.out.println("Entrenador: " + boca[1]);
        System.out.println("Jugadores: ");
        for (int i = 2; i < boca.length; i++){
            System.out.println( "-"+boca[i]);
        }
        System.out.println("------------------- ");
        System.out.println("Nombre: " + river[0]);
        System.out.println("Entrenador: " + river[1]);
        System.out.println("Jugadores: "); 
        for (int i = 2; i < river.length; i++){
            System.out.println("-"+river[i]);
        }
    }
    
}
