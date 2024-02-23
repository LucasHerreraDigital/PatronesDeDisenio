package creacionales;

public class PruebaSingleton {

	public static void main(String[] args){
		
		
		System.out.println("Si ves el mismo valor el singleton fue reusado"+"\n"+"si ves diferentes valores, se crearon 2 singletons");
		//prueba singleton unico hilo
		
		//Singleton singleton = Singleton.getInstancia("S1");
		//Singleton otroSingleton = Singleton.getInstancia("S2");
		//System.out.println(singleton.valor);
		//System.out.println(otroSingleton.valor);
		
		//prueba singleton multihilo
		
		Thread threadS1 = new Thread(new ThreadS1());
		Thread threadS2 = new Thread(new ThreadS2());
		threadS1.start();
		threadS2.start();
	}
	
	static class ThreadS1 implements Runnable{
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstancia("S1");
			System.out.println(singleton.valor);
		}
	}
	static class ThreadS2 implements Runnable{
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstancia("S2");
			System.out.println(singleton.valor);
		}
	}
	
}

//singleton ingenuo

//final class Singleton{
//	private static Singleton instancia;
//	public String valor;
//	
//	private Singleton (String valor) {
//		try {
//			Thread.sleep(1000);
//		}catch(InterruptedException ex) {
//			ex.printStackTrace();
//		}
//		this.valor = valor;	
//		}
//	public static Singleton getInstancia(String valor) {
//		if (instancia == null) {
//			instancia = new Singleton(valor);
//		}
//		return instancia;
//	}
//}

//Singleton con seguridad, sincronizamos los hilos

final class Singleton{
	private static Singleton instancia;
	public String valor;
	
	private Singleton(String valor) {
		this.valor = valor;
	}
	public static Singleton getInstancia(String valor) {
		Singleton resultado = instancia;
		if(resultado != null) {
			return resultado;
		}
		synchronized(Singleton.class) {
			if(instancia == null) {
				instancia = new Singleton(valor);
			}
			return instancia;
		}
	}
}