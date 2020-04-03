
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("bb"); ///  constructor will add 2 in defaullt
		//capacity i.e. 16 
		System.out.println(b.length()); //here length will be zero
		System.out.println(b.capacity());
		b.ensureCapacity(40);// here 18*2+2=38 is less than minCapacity so New Capacity will be 40 
		System.out.println(b.capacity());
		System.out.println(b.length());
	}

}
