import java.util.Scanner;//Para importar la libreria Scanner
public class Main {
    public static void main(String[] args) {

        //Esto es un comentario. Vamos a saludar al mundo
        System.out.println("Hola mundo, distrito PROGCOM");
        //Creando un objeto tipo scanner
        Scanner leer= new Scanner(System.in);
        //Se imprime la pegunta
        System.out.print("Está lloviendo?");
        //Creando un objeto que recibirá la respuesta
        String respuesta=leer.nextLine();

        System.out.println("Tu respuesta fue: "+respuesta);
        //Programando con if/else
        if (respuesta==no); {
            System.out.println("Te recomiendo ir al parque");
        }
    }
}