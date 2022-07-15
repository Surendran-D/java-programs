package map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {

	public static void main(String[] args) throws IOException {
	Properties p=new Properties();
	FileInputStream fin=new FileInputStream("C://Users//DELL//eclipse-workspace//javapractice//src//map//test.properties");
    p.load(fin);
    System.out.println(p);
    String s=p.getProperty("orange");
    System.out.println("Property  "+s);
    p.setProperty("mango", "50"); // key and values are given String
    FileOutputStream fo=new FileOutputStream("C://Users//DELL//eclipse-workspace//javapractice//src//map//test.properties");
    p.store(fo, "updated done");
    
	}

}
