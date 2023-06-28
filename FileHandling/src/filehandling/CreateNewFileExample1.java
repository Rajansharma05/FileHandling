package filehandling;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

public class CreateNewFileExample1 {
	//Create file using Stram classes
	private static void createFileUsingFileOutputStreamClass() throws IOException{
		//It override existing file or create new file
		FileOutputStream out= new FileOutputStream("C://Users//RAJAN//eclipse-workspace//FileHandling//testFile1.txt2");
		String data= "We are learning File Handling";
		out.write(data.getBytes());
		out.close();
	}
	
	private static void createFileIn_NIO() throws IOException{
		String data="Using NIO";
		Files.write(Paths.get("C://Users//RAJAN//eclipse-workspace//FileHandling//testFile1.txt3"),data.getBytes());
		
	}

	public static void main(String[] args) {
		try {
			//createFileUsingFileClass();
			//createFileUsingFileOutputStreamClass();
			createFileIn_NIO();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}