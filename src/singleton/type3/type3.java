package singleton.type3;

public class type3 {

	public static void main(String[] args) {
		System.out.println("lazy no safe");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);
		System.out.println("hashcode 1: " + instance1.hashCode());
		System.out.println("hashcode 2: " + instance2.hashCode());

	}

}

// 单例线程不安全懒汉式
// 起到了lazy loading的效果，但是只能在单线程下使用。
// 如果在多线程下，一个线程进入if判断语句，未结束时另一个线程
// 也通过了这个判断语句，会产生多个实例。
// 实际开发中不建议使用
class Singleton{
	
	private static Singleton instance;
	
	private Singleton() {};
	
	// 提供一个静态的公有方法
	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	
	
}