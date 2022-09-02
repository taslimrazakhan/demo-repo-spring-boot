import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {
	private final int i;
	private List<String> l;//=new ArrayList<String>();
	public static void main(String[] args) {
		SerializationDemo s=new SerializationDemo(20);

		SerializationDemo s1=new SerializationDemo(30);
		s1=new  SerializationDemo(60);
		System.out.println(
				s1.i);
		System.out.println(s1.l.size()+"  df");
		
		
	}
	private SerializationDemo(int j){
		this.i= j;
	}
}