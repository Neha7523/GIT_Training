package inheritance.programme;
class base
{
	protected final int number =10;
	public final void printvalue()
	{
	System.out.println("number in base:"+number);	
	}
}
final class derived1 extends base
{
	public derived1()
	{
		System.out.println("number in derived1:"+number);
	}
	//number++; final variable  can not be modified
	
}
//public void print value()    final method cannot be overridden
//system.out.println("number in derived 1"+number);
//}

//class derived2 extends derived1    final class cannot be subclassed
//{
//
//}
public class polyex3 {
	

}
