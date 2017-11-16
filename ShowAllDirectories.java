/*********************************************************************************************************
 * File Name:		
 * 
 * Description:		Write a program that goes through your file system and outputs a tree 
					diagram of all of your directories in a file called dir_tree.txt. The 
					methods in the File class will probably come in very handy. For a sample 
					output, check out this webpage: http://www.computerhope.com/treehlp.htm 
					Make sure you get the indentation right/tree branches right.
					
					NOTE: GIVEN THAT YOUR ENTIRE DIRECTORY TREE WILL PROBABLY BE HUGE, FEEL 
					FREE TO START FROM ANY FOLDER JUST AS LONG AS THAT FOLDER CONTAINS A 
					BUNCH OF SUB FOLDERS AND A BUNCH OF SUB-SUB FOLDERS, AND FILES AT EACH 
					LEVEL. THE LOGIC IS THE SAME.
					
					Also, figure out why the program stopped running when we used 
					Thread.sleep(), and we right clicked/marked the DOS window. 
 * 
 * Author: 			Steven Imas
 * 
 * Notes:
 ********************************************************************************************************/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class ShowAllDirectories {
	public static void main(String[] args) throws IOException {
			File directory = new File ("C:\\");	
			File[] list = directory.listFiles();
			PrintWriter writer = new PrintWriter("dir_tree.txt");

			printDirectory(list, writer);
			
			writer.close();
	}//end main 
	
	public static void printDirectory(File[] list,PrintWriter writer) {
		for (File file : list) {
			if( file.isDirectory() ) {
				
				writer.println( "Directory: " + file.getName() );
				//checkSubDirectory( file.getName(), list ); 
			}//end if
			else {
				writer.println( "Not Directory: " + file.getName() );
			}//end else
		}//end for loop
	}//end method
	
	
	//supposed to be recursive method.
	//passes the index of list to method to check if any more sub-directories exist and prints them
//	public static void checkSubDirectory(String fileName, File[] fileList) {
//		File dirName = new File (fileName);
//		fileList = dirName.listFiles();
//		printDirectory(fileList);
//		for (File file : fileList) {
//			if( file.isDirectory() ) {
//				
//				System.out.println( "Directory: " + file.getName() );
//				checkSubDirectory( file.getName(), fileList ); 
//			}//end if
//			else {
//				continue; 		//break or continue?
//			}//end else
//		}//end for loop
//		
//	
//	}//end method
	
	
} // end class


/*
 * 
 * 
 * 		OUTPUT:
 * 
 *
 Directory: $RECYCLE.BIN
Directory: Boot
Directory: bootmgr
Directory: BOOTNXT
Directory: Config.Msi
Directory: cygwin64
Directory: Documents and Settings
Directory: hiberfil.sys
Directory: Intel
Directory: pagefile.sys
Directory: PerfLogs
Directory: Program Files
Directory: Program Files (x86)
Directory: ProgramData
Directory: Python27
Directory: Recovery
Directory: Recovery.txt
Directory: swapfile.sys
Directory: System Volume Information
Directory: UserGuidePDF
Directory: Users
Directory: Windows
 * 
 */
 