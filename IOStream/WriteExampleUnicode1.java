package IOStream;

import java.io.*;

public class WriteExampleUnicode1 {

	public static void main(String[] args)throws Exception {
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char [] array = {'A', 'B', 'C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();
		}

	}


