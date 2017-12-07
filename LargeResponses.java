package com.test.abstraction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class LargeResponses {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Integer totalCount=new Integer(0);
			Long totalBytes=new Long(0);			
            System.out.print("Enter the file name with extension : ");
            String fileName=scan.nextLine();
            File file = new File(fileName); 
            FileReader fileRed=new FileReader(file);
            BufferedReader buffRed=new BufferedReader(fileRed);
            String line;            
            while ((line=buffRed.readLine())!=null) {                               
                String[] lineArr=line.split(" (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);    
                long bytes=Long.parseLong(lineArr[7]);
                if(bytes>5000){
                	totalCount+=1;
                	totalBytes+=bytes;
                }
                //System.out.println(line);
            }
            buffRed.close();
            scan.close();            
            File outfile=new File("bytes_"+file.getName()+".txt");
            PrintWriter pw=new PrintWriter(new FileOutputStream(outfile));
            pw.write(totalCount.toString());
            pw.write("\n");
            pw.write(totalBytes.toString());
            pw.close();
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }

	}

}
