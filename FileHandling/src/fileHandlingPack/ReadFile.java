package fileHandlingPack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends WriteAndAppendFile {
	
	//*****This Method Reads The Text File*****//
	public void read() {
		try(FileReader Textreader = new FileReader(Textfile); BufferedReader bufferedReader = new BufferedReader(Textreader);) {
			String line = bufferedReader.readLine();
			while(line != null) {
				System.out.println(line + " From " + Textfile);
				line = bufferedReader.readLine();
			}
		}catch (FileNotFoundException e) {
			System.out.println("The File Was Not Found");
		}catch (IOException e) {
			System.out.println("The File Never Opened");
		}
	}
}