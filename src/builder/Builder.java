package builder;

public interface Builder {

	void setTipoAuto(TipoAuto tipo);
	void setAsientos(int asientos);
	void setMotor(Motor motor);
	void setTransmision(Transmision transmision);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavegador(GPSNavegador gpsNavegador);
	
}
