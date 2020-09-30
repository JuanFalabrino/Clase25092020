
package clase25092020;

import java.util.Scanner;

public class CLASE25092020 {

    
    public static void main(String[] args) {
       //Ordenar 3 números de mayor a menor
       //Declaración variables
       int n1,n2,n3;
       //contructor de objeto Lector
       Scanner Lector = new Scanner(System.in);
             
       System.out.println("Ordenar los valores los datos ingresados");
       //ingresar numero por teclado
       System.out.print("Ingrese el primer numero :  ");
       n1 = Lector.nextInt();
       System.out.print("Ingrese el segundo numero :  ");
       n2 = Lector.nextInt();
       System.out.print("Ingrese el tercero numero :  ");
       n3 = Lector.nextInt();
       System.out.println("Los numeros ingresados son: " +n1+ "   " + n2 + "   " + n3);
       
       //Compararanumeros ingresados        
       if ((n1>n2)&&(n2>n3)){
        System.out.println("El orden es  :" + n1 + n2 + n3);
       }else if ((n1>n3) &&  (n3>n2)) {
        System.out.println("El orden es  :" + n1 + n3 + n2);
       }else if ((n2>n1)&&(n1>n3)){
        System.out.println("El orden es  :" + n2 + n1 + n3);
       }else if ((n2>n3)&&(n3>n1))  {
        System.out.println("El orden es  :" + n2 + n3 + n1);
       }else if ((n3>n2)&&(n3>n1))  {
        System.out.println("El orden es  :" + n2 + n3 + n1);
        }else if ((n2>n3)&&(n2>n1))  {   
        System.out.println("El orden es  :" + n3 + n1 + n2);
        }
        else{ 
        System.out.println("El orden es  :" + n3 + n2 + n1);
                }
        }
    }


