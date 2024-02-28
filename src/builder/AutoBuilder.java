package builder;

public class AutoBuilder implements Builder{

	private TipoAuto tipo;
	private int asientos;
	private Motor motor;
	private Transmision transmision;
	private TripComputer tripComputer;
	private GPSNavegador gpsNavegador;

	
	public void setTipoAuto(TipoAuto tipo) {
		this.tipo = tipo;
	}
	@Override
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public void setTransmision(Transmision transmision) {
		this.transmision = transmision;
	}
	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}
	
	@Override
	public void setGPSNavegador(GPSNavegador gpsNavegador) {
		this.gpsNavegador = gpsNavegador;
	}
	
	public Auto getResultado() {
		
		return new Auto(tipo, asientos, motor, transmision, tripComputer, gpsNavegador);
		
	}
	
}
