import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        House h1 = new House();

        //Pidiendo y asignando los datos otorgados por el usuario.

        //Asignando la direccion de la casa
        System.out.println("Digite la direccion de la casa: ");
        String direccion = entrada.nextLine();

        //Asignando los nombres de los residentes de la casa
        System.out.println("Digite los residentes de la casa");
        String personas = entrada.nextLine();
        String[] residentsNames = personas.split(",");

        //Asignando el numero de pisos de la casa
        System.out.println("Digite el numero de pisos de la casa: ");
        int pisos = entrada.nextInt();

        //Settamos los datos a las istancias de House
        h1.setAdress(direccion);
        h1.setFloorsNumber(pisos);
        h1.setResidentsNames(residentsNames);

        System.out.println(h1.toString());
    }
}
