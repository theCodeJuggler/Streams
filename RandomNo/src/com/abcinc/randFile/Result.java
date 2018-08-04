package com.abcinc.randFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Result {
	
	public static void main(String args[]) throws IOException
	{
		
		File file = new File("boy.txt");		//creating the file
		FileWriter fw = new FileWriter(file);	//opening for writing the file
		
		int num;
		
		//running the loop 100 times to generate the random numbers and write them in the file simultaneously
		for(int i=0;i<100;i++)
		{
			num = (int)(Math.random()*49);
			if(num == 0)
				num += 1;
			fw.write(num + "\n");
		}
		
		fw.close(); //closing the file
		System.out.println("Writing Completed !!");
		
		Set<Integer> randSet = new TreeSet<Integer>();	//declaring the tree set
		
		FileReader fr = new FileReader(file);			//opening the file in read mode
		BufferedReader in = new BufferedReader(fr);
		String line = in.readLine();					//reading a line
		
		while (line != null)
		{
			randSet.add(Integer.valueOf(line));	//adding the texts of each line from file into the set
			line = in.readLine();				//storing the next line number in the variable
		}
		
		randSet.stream().forEach(System.out::println);	//displaying each line 
		
		fr.close();	//closing the file
	}

}
