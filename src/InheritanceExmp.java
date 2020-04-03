
class Parent{
	Integer a=30;
	int b=10;
}
public class InheritanceExmp extends Parent {
	Integer a=90;
	public static void main(String[] args) {
		Parent p=new InheritanceExmp();
		System.out.println(p.a + " " + p.b);
	}

}
