import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nomPiloto, rangoPiloto;
		int horasVueloPiloto;

		Piloto piloto1 = new Piloto(1,"Pete Maverick", 10000, "Capitan");
		Piloto piloto2 = new Piloto(2,"Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3 = new Piloto(3,"Bradley Rooster", 3500, "Teniente");
		
		System.out.println("Introduzca los datos de otros dos pilotos");
		
//		for (int i = 0; i < 2; i++) {
			
//			System.out.println("Piloto" + (i+1));
			System.out.println("Piloto 1");

			System.out.println("Nombre:");
			nomPiloto = sc.next();
			System.out.println("Horas de Vuelo:");
			horasVueloPiloto=sc.nextInt();
			System.out.println("Rango:");
			rangoPiloto= sc.next();
			
//			if (i == 0) {
				Piloto piloto4=new Piloto(4, nomPiloto, horasVueloPiloto, rangoPiloto);
//			} else {
				
				System.out.println("Piloto 2");

				System.out.println("Nombre:");
				nomPiloto = sc.next();
				System.out.println("Horas de Vuelo:");
				horasVueloPiloto=sc.nextInt();
				System.out.println("Rango:");
				rangoPiloto= sc.next();
				
				Piloto piloto5=new Piloto(5, nomPiloto, horasVueloPiloto, rangoPiloto);
//			}
			
//		}
		
		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();
		
		Entrenamiento entrenamiento1 = new Entrenamiento(1, "Entrenamiento", 400, piloto2, true);
		
	}

}
