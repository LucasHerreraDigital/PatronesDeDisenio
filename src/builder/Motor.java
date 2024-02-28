package builder;

public class Motor {

	private final double volumen;
	private double kilometraje;
	private boolean arrancado;
	
	public Motor(double volumen, double kilometraje) {
		this.volumen = volumen;
		this.kilometraje = kilometraje;
	}
	
	public void encender() {
		arrancado = true;
	}
	
	public void apagar() {
		arrancado = false;
	}
	
	public boolean estaArrancado() {
		return arrancado;
	}
	
	public void andar(double  kilometraje) {
		if(arrancado) {
			this.kilometraje =+ kilometraje;
		}else {
			System.err.println("no puede avanzar, encender el motor primero");
		}
	}
	
	public double getVolumen() {
		return volumen;
	}
	
	public double getKilometraje() {
		return kilometraje;
	}
	
	
}

