package collectionsExample;

public class ToStringExample {
	public static void main(String[] args) {
		Demo d=new Demo(2,"TRK");
		System.out.println(d);
	
	}

}
class Demo{
int i;
	 int j;
	String name;
Demo(int i,String name)	{
this.i=i;
this.name=name;
}
public String  toString(){
	System.out.println("Object Made "+ i + " " + name);
	return "";
}
}
