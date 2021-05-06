package Casos_Covid;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES 
		Scanner scan = new Scanner(System.in);
		final int EMPLEADOS = 50;
		int sector;
		int cantCasosGral = 0;
		int cantEmpleados, cantCasosSector;
		
		for(int i=1; i<=3; i++) {
			System.out.println("\nIngrese sector a evaluar:");
		    sector = scan.nextInt();
			scan.nextLine();	
						
			cantEmpleados = (int) (Math.random() * (EMPLEADOS)) + 1;
			cantCasosSector= 0;
			
			for(int j = 1; j <= cantEmpleados; j++) {
				System.out.println("Ingrese la temperatura:");
				double temperatura = (int) (Math.random() * (40 - 35) + 35);
				System.out.println("La temperatura es de: " + temperatura);
				
				if (temperatura > 37.5) {
					cantCasosSector++;
				}
			}
			cantCasosGral+=cantCasosSector;
			
			double porcentajeSector = ((cantCasosSector * 100) / cantEmpleados);
			
			System.out.println("\nSector: " + sector + "\nCantidad de empleados: " + cantEmpleados + "\nCantidad de casos: "
					+ cantCasosSector + "\nPorcentaje de casos sospechosos: " + porcentajeSector + "%");			
			
		}
		System.out.println("\nCantidad de casos generales: " + cantCasosGral);
		
		double porcentajeFabrica = ((cantCasosGral * 100) / EMPLEADOS);
		System.out.println("\nEl porcentaje de casos sopechosos en la fábrica es de: " + porcentajeFabrica + "%");
		
	}

}
