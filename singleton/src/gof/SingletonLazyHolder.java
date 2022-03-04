package gof;

public class SingletonLazyHolder {
	
	
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia;
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}