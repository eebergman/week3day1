package com.monday;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime; 


public class OurDateWriterReader {

	public static void main(String[] args) {
		
		Path aNewPath = Paths.get("\\Users\\erine\\SSAResart\\WeekThree\\src\\com\\monday\\mycountries.txt");
		File ourNewFile = aNewPath.toFile();
		
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ourNewFile, true)))) {
			LocalDateTime currentDateTime = LocalDateTime.now();
			
			out.println("I accessed this app at " + currentDateTime);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
