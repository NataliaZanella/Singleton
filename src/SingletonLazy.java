/*
 * Singleton "preguiçoso"
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy(){
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
						
		}
		return instancia;
		
	}

    public static void setInstancia(SingletonLazy instancia) {
        SingletonLazy.instancia = instancia;
    }