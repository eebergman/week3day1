package com.notes;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.util.ArrayList;

public class MyWriter {

	public static void main(String[] args) {
		
		ArrayList<String> everytimeIHaveRunTheApp = new ArrayList<>();

		Path alienEggs = Paths.get("\\Users\\erine\\desktop\\somefile.txt");
		File alienA = alienEggs.toFile();
		
		Path horses = Paths.get("\\Users\\erine\\desktop\\abrandnewfile.txt");
		File horseA = horses.toFile();

		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(alienA, true)))) {
			out.print("This application was last run at ");
			LocalDateTime currentDateTime = LocalDateTime.now();
			out.println(currentDateTime);
			out.close();
		} catch (IOException alienException) {
			System.out.println(alienException);

		}
		

		try (BufferedReader in = new BufferedReader(new FileReader(alienA))) {
			String alienC;
			while ((alienC = in.readLine()) != null) {
				everytimeIHaveRunTheApp.add(alienC);
			}

			in.close();
		} catch (IOException alien2Exception) {
			System.out.println(alien2Exception);
		}

	} // main
} // class
