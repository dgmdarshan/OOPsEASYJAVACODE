package FileHandling_module;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class MyClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("File Handling in JAVA");
		File file=new File("abc.txt");
		file.createNewFile();
		System.out.println(file.exists());		
		FileReader fr=new FileReader(file);
		FileWriter fw=new FileWriter(file);
//		fw.write("Hi I am ABC");
//		fw.close();
		System.out.println(fr.read());
	}

}
