
public class Entrenamiento extends Avion{
	
	private boolean tieneDobleMando;

	public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		super(idAvion, modAvion, capAvion, piloto);
		
		this.tieneDobleMando = tieneDobleMando;
		
	}

	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}
	
	public void mostrarAvion() {
		
		System.out.println("Avion con id ==> " + this.getIdAvion() + "\n" + "Modalidad de Avion ==> " + getModAvion() + "\n" + "Capacidad ==> " + getCapAvion() + "\nTiene doble mando ==>" + tieneDobleMando);
		this.getPiloto().mostrarPiloto();

	}

}
