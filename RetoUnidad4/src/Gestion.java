import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nomPiloto, rangoPiloto;
		int horasVueloPiloto,capAvion;
		boolean tieneDobleMando;

		Piloto piloto1 = new Piloto(1,"Pete Maverick", 10000, "Capitan");
		Piloto piloto2 = new Piloto(2,"Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3 = new Piloto(3,"Bradley Rooster", 3500, "Teniente");
		
		System.out.println("Bienvenido a la escuela Top Gun, por favor introduzca los datos de dos pilotos");
		

		System.out.println("Piloto 1");

		System.out.println("Nombre:");
		nomPiloto = sc.next();
		System.out.println("Horas de Vuelo:");
		horasVueloPiloto=sc.nextInt();
		System.out.println("Rango:");
		rangoPiloto= sc.next();
			
		Piloto piloto4=new Piloto(4, nomPiloto, horasVueloPiloto, rangoPiloto);

				
		System.out.println("Piloto 2");

		System.out.println("Nombre:");
		nomPiloto = sc.next();
		System.out.println("Horas de Vuelo:");
		horasVueloPiloto=sc.nextInt();
		System.out.println("Rango:");
		rangoPiloto= sc.next();
				
		Piloto piloto5=new Piloto(5, nomPiloto, horasVueloPiloto, rangoPiloto);

		
		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();
		
		Entrenamiento entrenamiento1 = new Entrenamiento(1, "Entrenamiento", 400, piloto2, true);
		
		Combate combate1 = new Combate(1, "Combate", 200, piloto1, true);
		Combate combate2 = new Combate(2, "Combate", 100, piloto3, false);
		
		
		
		System.out.println("Introduzca los datos de otros dos aviones de Entrenamiento");
		
		System.out.println("Avion 1");

		System.out.println("Capacidad del Avion:");
		capAvion=sc.nextInt();
		System.out.println("Es furtivo (Y/N):");
		if (sc.next()=="Y"  || sc.next()== "y") {
			tieneDobleMando=true;
		} else {
			tieneDobleMando=false;
		}
		
		Entrenamiento entrenamiento2 = new Entrenamiento(2, "Entrenamiento", capAvion, piloto4, tieneDobleMando);
		
		System.out.println("Avion 2");

		System.out.println("Capacidad del Avion:");
		capAvion=sc.nextInt();
		System.out.println("Es furtivo (Y/N):");
		if (sc.next()=="Y"  || sc.next()== "y") {
			tieneDobleMando=true;
		} else {
			tieneDobleMando=false;
		}
		
		Entrenamiento entrenamiento3 = new Entrenamiento(3, "Entrenamiento", capAvion, piloto5, tieneDobleMando);
		
		entrenamiento1.mostrarAvion();
		entrenamiento2.mostrarAvion();
		entrenamiento3.mostrarAvion();
		
		combate1.mostrarAvion();
		combate2.mostrarAvion();
		
		sc.close();

	}

}
