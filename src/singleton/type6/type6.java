package singleton.type6;

public class type6 {

	public static void main(String[] args) {
		System.out.println("静态内部类");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);
		System.out.println("hashcode 1: " + instance1.hashCode());
		System.out.println("hashcode 2: " + instance2.hashCode());

	}

}

// 静态内部类 推荐使用
// 只有一个线程
// 被装载时不会立即被实例化，而是需要实例化时，调用getinstance方法
// 线程安全
class Singleton{

	private static class SingletonInstance{
		private static final Singleton INSTANCE = new Singleton();
	}
	public static final Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
}
