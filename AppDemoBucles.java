import java.util.Scanner;
/**
 *  @author - Richard Eguaras
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{
    private static Scanner teclado;
    private static DemoBucles bucle;
    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    public static void main(String[] args)
    {
         teclado = new Scanner(System.in);
         bucle = new DemoBucles();
         
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public String aleatorios()
    {
        System.out.println("Teclee tope de aleatorios a generar [10, 15]: ");
        String aleatorios = teclado.nextLine();
        if ()
        {
        
        }
        return aleatorios;
    }

}

