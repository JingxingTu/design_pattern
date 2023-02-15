package singleton.type5;


public class type5 {

	public static void main(String[] args) {
		System.out.println("double check");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);
		System.out.println("hashcode 1: " + instance1.hashCode());
		System.out.println("hashcode 2: " + instance2.hashCode());

	}

}

//double check
//线程安全，同步方法
//建议使用
class Singleton{
	
	private static volatile Singleton instance;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		
		if(instance == null ) {
			synchronized (Singleton.class) {
				if(instance == null ) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}