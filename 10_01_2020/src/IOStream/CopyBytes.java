package IOStream;

import java.io.*;

public class CopyBytes {
	public static void main(String args[]) throws Exception {
		int i;
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream("inFile.txt");
			out=new FileOutputStream("outFile.txt");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		while((i=in.read())!=-1) {
			System.out.print(i+" ");
			out.write(i);
		}
	}

}
