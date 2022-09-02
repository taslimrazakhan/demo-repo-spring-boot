package collectionsExample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class StudentsList {
	public static void main(String[] args) {

List<StudentVo> list=new ArrayList<StudentVo>();

List<StudentVo> l=new LinkedList<StudentVo>();
for(int i=0;i<10;i++){
	StudentVo obj=new StudentVo();
	obj.setCity("CityName " + i);
	Calendar c;
	obj.setDob(new Date());
	obj.setName("Studen " + i);
	obj.setRollNo("100" + i);
	l.add(obj);
}
for(StudentVo item: l){
	System.out.println(item.getCity() +" " + item.getName() );
	
}

	}

}
