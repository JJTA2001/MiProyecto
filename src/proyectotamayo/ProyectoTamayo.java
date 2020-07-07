
package proyectotamayo;

import utils.Leer;
import static utils.Leer.cadena;
//Autor : Tamayo Abanto Joseph Jeremy

public class ProyectoTamayo {
    public static void Potencia(){
        int pot=1;
        System.out.print("Ingrese numero: ");
        int n1 = Leer.entero();
        System.out.print("Ingrese exponente: ");
        int n2 = Leer.entero();
        for (int i = 1; i <= n2; i++) {
            pot *= n1;
        }
        System.out.println("Potencia es: "+pot);
    }
    public static void PosiciondeunaCadena(){
        String cad;
        int pos;
        System.out.print("Ingrese cadena: ");
        cad = Leer.cadena();
        System.out.print("Elija la posicion de la cadena: ");
        pos = Leer.entero();
        System.out.println("El caracter de la posicion "+pos+" es: "+cad.charAt(pos));
    }
    public static void saludos(){
        String nombre;
        System.out.print("Ingrese nombre: ");
        nombre = Leer.cadena();
        System.out.println("Bienvenido a mi programa "+nombre);
    }
    public static void Sumadenumero(){
        //1+2+3+...+N
        int numero;
        int suma = 0;
        System.out.print("Ingrese numero: ");
        numero = Leer.entero();
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("La sumatoria es: "+suma);
    }
    public static void error(){
        System.out.println("Error-Opcion Incorrecta");
    }   
    public static void salir(){
        System.out.println("Gracias por visitarnos...");
    }    
    public static void menu(){
        int numero; 
        System.out.println("***MENU***");
        System.out.println("1.Saludos");
        System.out.println("2.Suma de numeros");
        System.out.println("3.Potencia");
        System.out.println("4.Posicion de una Cadena");
        System.out.println("5.Salir");
        System.out.print("Ingrese opcion[1-5]");
        
    }
    public static void inicio(){
       int opcion;
       do{
           menu();
           opcion = Leer.entero();
           switch(opcion){
               case 1:saludos();
               break;
               case 2:Sumadenumero();
               break; 
               case 3:Potencia();
               break;
               case 4:PosiciondeunaCadena();
               break;
               case 5:salir();
               default: error();
               break;
                   
  
           }
       }while(opcion!=5);
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
