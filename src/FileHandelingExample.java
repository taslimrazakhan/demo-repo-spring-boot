import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileHandelingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String newFile="newFile.txt";
		File dir=new File("d:\\MyDir");
		dir.mkdir();
		File f= new File(dir,newFile);
		File newDir=new File("newDir");
		newDir.renameTo(dir);
		
	
	try {
		//FileWriter fw=new FileWriter(f);
		//fw.write("Amir is a good boy");
	//	fw.flush();
		//fw.close();
		FileReader fr=new FileReader(f);
	BufferedReader br =new BufferedReader(fr);
	String s;
	while ((s = br.readLine())!=null)
System.out.println(s);
		fr.close();
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	File newName=new File(dir,"NewFile1.txt");
	f.renameTo(newName);
	System.out.println("File Deleted"+newName.delete());


	}

}
