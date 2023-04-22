package project2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileProjectPractice {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner =new Scanner (System.in);
		
		File file =new File("/Users/user/eclipse-workspace/project2.txt");
		
		
		FileWriter writer=new FileWriter(file);
		
		String userInput=scanner.nextLine();
		
		
		String[] split = userInput.split(" ");
		
		System.out.println(file.canExecute());
		System.out.println(file.canRead()); 
		System.out.println(file.canWrite()); 
		System.out.println(file.getAbsolutePath()); 
		System.out.println(file.getName()); 
		System.out.println(file.getParent()); 
		System.out.println(file.length()); 
		
		for (String string : split) {
			
			writer.write(string +"\n");
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		writer.close();
	}

}
