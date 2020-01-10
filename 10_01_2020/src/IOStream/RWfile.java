package IOStream;

import java.io.*;

import jdk.jfr.events.FileWriteEvent;

public class RWfile {

	public static void main(String[] args) throws Exception{
		int i;
		Reader r=null;
		Writer w=null;
		try {
			r=new FileReader("inFile.txt");
			w=new FileWriter("outFile.txt");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		while((i=r.read())!=-1) {
			System.out.print((char)i);
			w.write(i);
		}
	
	}

}
