package CustomerFile;

import java.io.*;
import java.util.*;

public class Customer {
	public static void main(String[] args) throws Exception {

		List l = new ArrayList();
		BufferedReader reader;
		BufferedWriter writer;

		reader = new BufferedReader(new FileReader("inFile.txt"));
		writer = new BufferedWriter(new FileWriter("outFile.txt"));
		String line = reader.readLine();

		char data;
		String[] s;
		int si = 0;
		while ((line != null)) {
			String str[] = line.split(" ");
			for(int i=0;i<str.length;i++)
				l.add(str[i]);
			line = reader.readLine();
		//	System.out.println(l);
			}
		System.out.println(l);
		reader.close();
		writer.close();

	}
}