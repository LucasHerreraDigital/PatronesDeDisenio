package builder;

public class TripComputer {

	private Auto auto;

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	public void mostrarNivelNafta() {
		System.out.println("nivel de nafta: "+ auto.getCombustible());
	}
	
	public void mostrarEstado() {
		if(this.auto.getMotor().estaArrancado()) {
			System.out.println("esta arrancado");
		}else {
			System.out.println("no esta arrancado");
		}
	}
	
}
