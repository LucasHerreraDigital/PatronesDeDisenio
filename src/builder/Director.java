package builder;

public class Director {

	public void construirAutoSport(Builder builder) {
		builder.setTipoAuto(TipoAuto.AUTO_SPORT);
		builder.setAsientos(2);
		builder.setMotor(new Motor(3.0,0));
		builder.setTransmision(Transmision.SEMI_AUTOMATICA);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavegador(new GPSNavegador());
	}
	
	public void construirAutoCiudad(Builder builder) {
		builder.setTipoAuto(TipoAuto.AUTO_CIUDAD);
		builder.setAsientos(2);
		builder.setMotor(new Motor(1.2,0));
		builder.setTransmision(Transmision.AUTOMATICO);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavegador(new GPSNavegador());
	}
	
	public void construirSUV(Builder builder) {
		builder.setTipoAuto(TipoAuto.SUV);
		builder.setAsientos(4);
		builder.setMotor(new Motor(2.5,0));
		builder.setTransmision(Transmision.MANUAL);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavegador(new GPSNavegador());
	}
	
}
