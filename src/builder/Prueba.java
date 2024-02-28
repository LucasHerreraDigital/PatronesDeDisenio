package builder;

public class Prueba {
	
	public static void main(String[] args) {
		Director director = new Director();
		
		AutoBuilder builder = new AutoBuilder();
		director.construirAutoSport(builder);
		
		Auto auto = builder.getResultado();
		System.out.println(auto.getTipoAuto());
		System.out.println(auto.informacion());
		
		director.construirAutoCiudad(builder);
		
		Auto auto1 = builder.getResultado();
		System.out.println(auto1.getTipoAuto());
		System.out.println(auto1.informacion());
	}
	
}
