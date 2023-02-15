package singleton;

public class type1 {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);
		System.out.println("hashcode 1: " + instance1.hashCode());
		System.out.println("hashcode 2: " + instance2.hashCode());
	}

}

// 单例静态常量饿汉式
// 优点： 写法简单，装载时就完成实例化，避免线程同步问题。
// 缺点： 没有达到lazy loading的效果，如果没有用过该实例，造成浪费。
class Singleton{
	
	private Singleton(){};
	
	private final static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
}