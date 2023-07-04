public class Zhangkang{
	public static void main(String[] args){
		System.out.println("张康 is studying java!");
	}
}
//public static void main(String[] args)
//一个源文件中最多只能有一个public类。其他类的个数不限。
//Dog是一个类
//编译后每一个类，都对应一个.class文件 
//文件名必须是public类的名称 
class Dog{

	//一个源文件中最多只能有一个public类。其他类的个数不限，也可以将main方法写在非public类中
	//然后指定运行非public类，这样入口方法就是非public的main的方法
	public static void main(String[] args){
		System.out.println("汪汪汪");
	}

}
class friend{

}
