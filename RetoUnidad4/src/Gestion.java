import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nomPiloto, rangoPiloto, teclado;
		int horasVueloPiloto,capAvion;
		boolean tieneDobleMando;
		
		/*
		
		Crea tres objetos de la clase Piloto y pasa los datos correspondientes mediante su constructor
		(que habrás creado y que tiene todos los parámetros) de los siguientes pilotos. El número de 
		identificación es a libre elección.
		
		*/

		Piloto piloto1 = new Piloto(1,"Pete Maverick", 10000, "Capitan");
		Piloto piloto2 = new Piloto(2,"Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3 = new Piloto(3,"Bradley Rooster", 3500, "Teniente");
		
		/*
		 
		 A continuación, pide al usuario que introduzca los datos de otros dos pilotos, 
		 crea los objetos correspondientes y pasa dicha información igualmente al constructor 
		 (de todos los parámetros).
		  
		 */
		
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

		
		/*
		 
		  Muestra la información del piloto Maverick y de Rooster utilizando el método mostrarPiloto(), 
		  que debes haber implementado ya.
		  
		 */
		
		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();
		
		
		/*
		 
		 Muestra la información de los dos pilotos cuya información te ha proporcionado el usuario,
		 utilizando el método mostrarPiloto().
		  
		 */
		
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();
		
		// Para ello crea tres objetos Avion, de los cuales uno será de entrenamiento y dos de combate.
		
		Entrenamiento entrenamiento1 = new Entrenamiento(1, "Entrenamiento", 400, piloto2, true);
		
		Combate combate1 = new Combate(1, "Combate", 200, piloto1, true);
		Combate combate2 = new Combate(2, "Combate", 100, piloto3, false);
		
		
		
		// Después pedirás al usuario que introduzca la información de dos Aviones, que serán ambos de entrenamiento.
		
		System.out.println("Introduzca los datos de dos aviones de Entrenamiento");
		
		System.out.println("Avion 1");

		System.out.println("Capacidad del Avion:");
		capAvion=sc.nextInt();
		System.out.println("Tiene doble mando (Y/N):");
		teclado = sc.next();
		
		
		if (teclado == "Y"  || teclado == "y") {
			tieneDobleMando=true;
		} else {
			tieneDobleMando=false;
		}
		
		Entrenamiento entrenamiento2 = new Entrenamiento(2, "Entrenamiento", capAvion, piloto4, tieneDobleMando);
		
		System.out.println("Avion 2");

		System.out.println("Capacidad del Avion:");
		capAvion=sc.nextInt();
		System.out.println("Tiene doble mando (Y/N):");
		teclado = sc.next();
		
		
		if (teclado == "Y"  || teclado == "y") {
			tieneDobleMando=true;
		} else {
			tieneDobleMando=false;
		}
		
		Entrenamiento entrenamiento3 = new Entrenamiento(3, "Entrenamiento", capAvion, piloto5, tieneDobleMando);
		
		/*
		  
		 Muestra toda la información de los aviones, tanto los Aviones cuyos datos has asignado tú,
		como la de los Aviones que ha introducido por teclado el usuario. 
		
		*/
		
		entrenamiento1.mostrarAvion();
		entrenamiento2.mostrarAvion();
		entrenamiento3.mostrarAvion();
		
		combate1.mostrarAvion();
		combate2.mostrarAvion();
		
		sc.close();

	}

}
