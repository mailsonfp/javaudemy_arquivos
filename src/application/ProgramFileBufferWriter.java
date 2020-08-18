package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileBufferWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Olá","Enfermeira","!"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
	
			for(String linha : lines) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
	}

}
