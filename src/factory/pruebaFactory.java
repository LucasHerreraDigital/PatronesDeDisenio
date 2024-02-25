package factory;

public class pruebaFactory {
	public static void main(String[] args) throws NoSuchFieldException{
		
		ObjetoFactory objetoFactory = new ObjetoFactory();
		Objeto unObjeto = objetoFactory.obtenerObjeto("Objeto6");
		unObjeto.queObjeto();
	}
}

class ObjetoFactory{
	
	public Objeto obtenerObjeto(String tipoObjeto) {
		
		return switch(tipoObjeto) {
		case "Objeto1" -> new Objeto1();
		case "Objeto2" -> new Objeto2();
		case "Objeto3" -> new Objeto3();
		case "Objeto4" -> new Objeto4();
		//agregamos otro objeto
		case "Objeto5" -> new Objeto5();
		case "Objeto6" -> new Objeto6();
		default -> throw new IllegalArgumentException("Unexpected value: " + tipoObjeto);
		};
			
	}
	
}


interface Objeto{
	
	void queObjeto();
	
}


class Objeto1 implements Objeto{

	@Override
	public void queObjeto() {
		System.out.println("soy objeto 1");
		
	}
	
}

class Objeto2 implements Objeto{

	@Override
	public void queObjeto() {
		System.out.println("soy objeto 2");
		
	}
	
}

class Objeto3 implements Objeto{

	@Override
	public void queObjeto() {
		System.out.println("soy objeto 3");
		
	}
	
}

class Objeto4 implements Objeto{

	@Override
	public void queObjeto() {
		System.out.println("soy objeto 4");
		
	}
	
}

class Objeto5 implements Objeto{

	@Override
	public void queObjeto() {
		System.out.println("soy objeto 5");
		
	}
	
}

class Objeto6 implements Objeto{

	@Override
	public void queObjeto() {
		System.out.println("soy objeto 6");
		
	}
	
}