public final class ImmutableDemo {
	private final String college;
	private final Student std ;
	public static void main(String[] args) {
		Student newStd=new Student();
		newStd.setName("Student 1");
		ImmutableDemo d=new ImmutableDemo("College","Delhi",newStd);		
		System.out.println("Details: " +  d.getCollege() + " " + d.getStd().getName());
		newStd.setName("Student 2");
		System.out.println("Details: " +  d.getCollege() + " " + d.getStd().getName() );
	
		System.out.println("Details: " +  d.getCollege() + " " + d.getStd().getName() );
	}
	ImmutableDemo(String college,String city,Student s){
		this.college=college;
		Student restrictChange=new Student();
		restrictChange.setName(s.getName());
		this.std=restrictChange;
	}
	public String  getCollege() 
	{
		return college;
	}
	public Student getStd() {
		Student cloneObj=new Student();
		cloneObj.setName(this.std.getName());
		return cloneObj;	}
}
class Student{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
