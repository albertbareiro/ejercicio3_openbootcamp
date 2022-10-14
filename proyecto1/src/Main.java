import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Llamar a la función en el main y darle valores
        Scanner teclado = new Scanner(System.in);
        int sumatoria, nro1, nro2, nro3;
        System.out.println("Ingrese 1er valor");
        nro1 = teclado.nextInt();
        System.out.println("Ingrese 2do valor");
        nro2 = teclado.nextInt();
        System.out.println("Ingrese 3er valor");
        nro3 = teclado.nextInt();
        sumatoria=suma(nro1,nro2,nro3);
        System.out.println("La sumatoria de los nros ingresados es: "+sumatoria);

        //Crear un objeto miCoche en el main y añadirle una puerta
        Coche miCoche= new Coche();
        miCoche.incrementa();
        //Mostrar el número de puertas que tiene el objeto.
        System.out.println("La cantidad de puerta que posee el coche es: "+miCoche.puerta);
    }

    //Crear una función con tres parámetros que sean números que se suman entre sí.
    public static int suma(int a,int b,int c){
        int resultado;
        resultado=a+b+c;
        return resultado;
    }
}

//Crear una clase coche.
class Coche {
    public int puerta=1;  ////una variable numérica que almacene el número de puertas que tiene.
    public void incrementa() { ////Una función que incremente el número de puertas que tiene el coche
        this.puerta++;
    }
}
