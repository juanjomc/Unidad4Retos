
public class Combate extends Avion {
	
	private boolean esFurtivo;
	
	public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		super(idAvion, modAvion, capAvion, piloto);
		
		this.esFurtivo = esFurtivo;
	}

	public boolean isEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}

	public void mostrarAvion() {
		
		System.out.println("Avion con id ==> " + getIdAvion() + "\n" + "Modalidad de Avion ==> " + getModAvion() + "\n" + "Capacidad ==> " + getCapAvion() + "\nTiene doble mando ==>" + esFurtivo);
		this.getPiloto().mostrarPiloto();
		
	}
	
	

}
