import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInfo {
    
    public static void main(String[] args) throws Exception {
        
        if (args.length < 1){
            System.err.println("Provide dummyname as command line argument");
            return;
        }
        
        String fileName = args[0];
        File fn = new File(fileName);
		/*
		 * try { fn.createNewFile(); } catch (IOException e) {
		 * 
		 * }
		 */        System.out.println("Name: " + fn.getName());
        
        // Check if the file exists using exists() method
        if (fn.exists()) {
            System.out.println(fileName + " does exist.");
        }
        else
        	System.out.println(fileName + " doesn't exist.");
        
        if (fn.canRead()) {
            System.out.println(fileName  + " is readable.");
        }
        
        System.out.println(fileName + " is " + fn.length() + " bytes long.");
        System.out.println(fileName + " is last modifed at " +
                new java.util.Date(fn.lastModified())) ;
        
        if (fn.canWrite()) {
            System.out.println(fileName  + " is writable.");
        } else{
            System.out.println(fileName  + " is not writable.");
        }
        if(fn.exists()) {
        BufferedReader reader = null;
		try {
			System.err.println("\nContent on file: "+ fileName.toUpperCase());
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
	        while (line != null) {
	          System.out.println(line);
	            line = reader.readLine();
	        }       
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        reader.close();
    }}
}