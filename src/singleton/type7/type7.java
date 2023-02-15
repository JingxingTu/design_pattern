package singleton.type7;

public class type7 {

	public static void main(String[] args) {
		System.out.println("枚举方法");
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance1 == instance2);
		System.out.println("hashcode 1: " + instance1.hashCode());
		System.out.println("hashcode 2: " + instance2.hashCode());

	}

}

enum Singleton{
	INSTANCE;
	public void sayOK() {
		System.out.println("ok");
	}
}