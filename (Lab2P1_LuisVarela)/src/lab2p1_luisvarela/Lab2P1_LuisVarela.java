/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_luisvarela;
import java.util.Scanner;

/**
 *
 * @author Luis Andres Varela
 */
public class Lab2P1_LuisVarela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        boolean continuar=true;
        while (continuar){
        System.out.println("\n\n1.Clasificando números:");
        System.out.println("2.Aproximando PI:");
        System.out.println("3.MCD:");
        System.out.println("4.Salir:");
        int opcion=lea.nextInt();
        switch (opcion){
            case 1:{
                System.out.println("Ingrese un numero:");
                int num=lea.nextInt();
                int ciclo=1;
                int contador=0;
                boolean par=false;
                while(num<=0){
                    System.out.println("Ingrese un numero positivo:");
                    num=lea.nextInt();
                }
                while (ciclo<=num){
                    if (num%2==0){
                        par=true;
                    }
                    if(num%ciclo==0){
                        contador++;
                    }
                    ciclo++;
                }
                if(par){
                    System.out.print("El numero es par ");
                }else{
                    System.out.print("El numero es impar");
                }
                if(contador==2){
                    System.out.print(" y es primo");
                }
            }
            break;
            case 2:{
               System.out.println("Ingrese un numero:");
                double num=lea.nextInt();
                while(num<=0){
                    System.out.println("Ingrese un numero positivo:");
                    num=lea.nextInt();
                }
                double contador=1;
                double pi=1;
                double f=4;
                while (contador<=num){
                     double potencia=Math.pow(contador, 2);
                     double fraccion=(f*potencia)/(f*potencia-1);
                     pi=pi*fraccion;
                     contador++;
                }
                System.out.println("Pi:"+pi*2);
            }
            break;
            case 3:{
                System.out.println("Ingrese un numero:");
                int num1=lea.nextInt();
                System.out.println("Ingrese un numero:");
                int num2=lea.nextInt();
                while (num1<=0){
                System.out.println("Ingrese un numero positivo:");
                num1=lea.nextInt(); 
                }
                while (num1<=0){
                System.out.println("Ingrese otro numero positivo:");
                num1=lea.nextInt(); 
                }
                while(num1!=num2){
                    if(num1>num2){
                        num1-=num2;
                    }
                    if(num2>num1){
                        num2-=num1;
                    }
                }
                System.out.println("Maximo comun divisor es:"+num2);
            }
            break;
            case 4:{
               continuar=false; 
            }
            break;
            default:
                System.out.println("Error");

        }
    }
    }
    
}
