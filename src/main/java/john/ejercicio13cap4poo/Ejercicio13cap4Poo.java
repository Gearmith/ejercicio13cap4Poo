/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio13cap4poo;

import java.util.Scanner;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio13cap4Poo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el valor de la compra: ");
	int vCompra = entrada.nextInt();
	System.out.println("Ingrese el color de la bolita: ");
	String bola = entrada.next();
	int p;
	if ("blanco".equals(bola)) {
	    p = 0;	
	} else if ("verde".equals(bola)) {
	    p = 10;
	} else if ("amarillo".equals(bola)) {
	    p = 25;
	} else if ("azul".equals(bola)) {
	    p = 50;
	} else {
	    p = 100;
	}

	int vPagar = vCompra - ((p * vCompra) / 100);

	System.out.println("El cliente debe pagar: $" + vPagar);
    }
}
