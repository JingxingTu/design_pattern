package singleton.type4;

public class type4 {

	public static void main(String[] args) {
		System.out.println("lazy safe");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);
		System.out.println("hashcode 1: " + instance1.hashCode());
		System.out.println("hashcode 2: " + instance2.hashCode());

	}

}

// 单例线程安全懒汉式
// 效率低，每次在想获得类的实例时候，执行getinstance()都要执行同步。
//也不推荐
class Singleton{
	
	private static Singleton instance;
	
	private Singleton() {};
	
	// 提供一个静态的公有方法，加入同步处理的代码
	public static synchronized Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}