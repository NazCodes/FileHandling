package fileHandlingPack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndAppendFile {
	
	File Textfile = new File("myFile.txt");
	
	//*****This Method Writes Text To A Text File*****//
	public void write() {
		try(FileWriter Textwriter = new FileWriter(Textfile);) {
			Textwriter.write("This Is The 1st Line");
		}catch (IOException e) {
			System.out.println("Could Not Write To Text File");
		}
	}
	
	//*****This Method Appends Text To A Text File*****//
	public void append() {
		try(BufferedWriter appendWriter = new BufferedWriter(new FileWriter(Textfile,true))) {
			appendWriter.newLine();
			appendWriter.write("This Is The 2nd Line");
			appendWriter.newLine();
			appendWriter.write("This Is The 3rd Line");
			appendWriter.newLine();
			appendWriter.write("This Is The 4th Line");
			appendWriter.newLine();
			appendWriter.write("This Is The 5th Line");
		} catch (IOException e) {
			System.out.println("Could Not Append To Text File");
		}
	}
}
