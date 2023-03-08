package inout;
import java.io.FileOutputStream;
public class fileinout {
	public static void main(String[] args) {
	try {
		FileOutputStream fout= new FileOutputStream("D:\\test.txt");
		String s="welcome";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("success");
	}catch (Exception e) {System.out.println(e);}
	
	}}
