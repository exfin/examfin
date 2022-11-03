import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido");
		System.out.println("Ingrese una opción");
		ArrayList<AgenteMercado> lista=new ArrayList<>();
		Scanner datos=new Scanner(System.in);
		while(true) {
			System.out.println("Ingresar Agente");
			System.out.println("Consultar dinero disponible");
			System.out.println(" ");
			int opcion=datos.nextInt();
			if (opcion==1) {
				System.out.println("Ingrese el nombre del agente");
				String nombre=datos.nextLine();
				System.out.println("Ingrese su id");
				double ida=datos.nextDouble();
				System.out.println("Ingrese la ciudad");
				String ciudad=datos.next();
				System.out.println("Ingrese la cantidad de dinero");
				double dineroDisponible=datos.nextDouble();
				System.out.println("Ingrese el número de plantas");
				int n=datos.nextInt();
				PlantaGeneracion[] p=new PlantaGeneracion[n];
				for(int i=0;i<n;i++) {
					System.out.println("Ingrese la id de la planta");
					double id=datos.nextDouble();
					System.out.println("Ingrese el recurso");
					String recurso=datos.next();
					System.out.println("Ingrese la ciudad de la planta");
					String ciudadp=datos.next();
					System.out.println("Ingrese el factor de disponibilidad");
					double factordeDisponibilidad=datos.nextDouble();
					System.out.println("Ingrese la fecha inicial");
					int fechainicial=datos.nextInt();
					System.out.println("Ingrese el presupuesto de mantenimiento");
					double presupuestoMantenimiento=datos.nextDouble();
					System.out.println("Ingrese cuantas fechas de mantenimiento tiene");
					int m=datos.nextInt();
					String[] f=new String[m];
					for(int j=0;j<m;j++) {
						System.out.println("Ingrese las fechas de mantenimiento");
						String fechas=datos.next();
						f[j]=fechas;
					}
					/*
					 * public PlantaGeneracion(int id, String recurso, String ciudadp, int fechainicial, String[] fechasmantenimiento,
			double factordeDisponibilidad, double presupuestoMantenimiento)
					 */
				
					
					
					
					
				}
				
			}
			
			
		 
			
					
				
			}
		
		

	}

}
