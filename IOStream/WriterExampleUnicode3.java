package IOStream;

import java.io.*;


public class WriterExampleUnicode3 {
	public static void main(String[] args)throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str= "ABC";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
		}
}
