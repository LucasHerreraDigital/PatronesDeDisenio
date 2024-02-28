package builder;

public class Auto {

	

	private final TipoAuto tipoAuto;
    private final int asientos;
    private final Motor motor;
    private final Transmision transmision;
    private final TripComputer tripComputer;
    private final GPSNavegador gpsNavegador;
    private double combustible = 0;
	
	
	public Auto(TipoAuto tipoAuto, int asientos, Motor motor, Transmision transmision, TripComputer tripComputer,
			GPSNavegador gpsNavegador) {
		super();
		this.tipoAuto = tipoAuto;
		this.asientos = asientos;
		this.motor = motor;
		this.transmision = transmision;
		this.tripComputer = tripComputer;
		this.gpsNavegador = gpsNavegador;
	}
	
	public double getCombustible() {
		return combustible;
	}

	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}

	public TipoAuto getTipoAuto() {
		return tipoAuto;
	}

	public int getAsientos() {
		return asientos;
	}

	public Motor getMotor() {
		return motor;
	}

	public Transmision getTransmision() {
		return transmision;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavegador getGpsNavegador() {
		return gpsNavegador;
	}
	
	public String informacion() {
		String info = "";
		info += "Tipo de auto: " + tipoAuto + "\n";
		info += "Conteo de asientos: " + asientos + "\n";
        info += "Motor: volumen - " + motor.getVolumen() + "; kilometraje - " + motor.getKilometraje() + "\n";
        info += "Transmision: " + transmision + "\n";
        return info;
	}

}
