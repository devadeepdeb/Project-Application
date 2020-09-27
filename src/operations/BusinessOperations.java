package operations;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BusinessOperations implements FileInterface {

	List<String> r = new ArrayList<String>();
	File directory = new File("C:\\Users\\HP\\FSD-Phase1-Project\\Project-Application");
	File[] files = new File("C:\\Users\\HP\\FSD-Phase1-Project\\Project-Application").listFiles();
	
	@Override
	public void showAllFiles() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("All files names available in ["+directory+"] directory are as follows: \n");
		for (File file : files) {
			if (file.isFile()) {
				r.add(file.getName());
			}
			System.out.println(file.getName());
		}
	}

	@Override
	public void addFile() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Enter the text format file (.txt) name which you want to add in ["+directory+"] directory:");
		Scanner sc2=new Scanner(System.in);
		String filename=sc2.nextLine();
		File F= new File(filename);
		try {
			if (F.createNewFile()) {
				System.out.println(filename+" file is added to the directory");
				Desktop.getDesktop().edit(F);
			} else {

				System.out.println("This file is already there");
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("You cannot add content to "+filename+" in the directory as it is not a text (.txt) format file. Please delete it if you wish from Business level operation menu");
		}
		  catch (NoSuchElementException e) {
			// TODO: handle exception
			  sc2.close();
		}
	}

	@Override
	public void deleteFile() {
		// TODO Auto-generated method stub
		Scanner sc3=new Scanner(System.in);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Enter the file name in ["+directory+"] directory which you want to delete:");
		String fileName=sc3.nextLine();
        File[] files=directory.listFiles();
        int flag=0;
        for (File file : files) {
        	String name = file.getName();
        	if (name.equals(fileName)) {
        		file.delete();
        		System.out.println("The filename "+fileName+" is deleted from the directory");
        		flag=1;
			}
		}
		try {
			if (flag==0) {
				System.out.println("File is not there");
			}
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			sc3.close();
		}
	}

	@Override
	public void searchFile() throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc4=new Scanner(System.in);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Enter the file name in ["+directory+"] directory which you want to search:");
		String fileName=sc4.nextLine();
        File[] files=directory.listFiles();
        int flag=0;
        for (File file : files) {
        	String name = file.getName();
        	if (name.equals(fileName)) {
        		System.out.println("The filename "+fileName+" is present in the directory and its contents are");
                System.out.println("-------------------------------------------------------------------------------");
				File f= new File(fileName);
				Scanner sc5 = new Scanner(f);
				while (sc5.hasNextLine()) {
					System.out.println(sc5.nextLine());
				}
				flag=1;
				sc5.close();
			}
		}
        try {
			if (flag==0) {
				System.out.println("File is not there");
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			sc4.close();
		}
	}

	
}
