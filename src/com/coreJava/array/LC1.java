package com.coreJava.array;

import java.io.File;

public class LC1 {

	public static void main(String[] args) {
		// Specify the old file name and path
        File oldFile = new File("E:/GSRTC_harsha.pdf");
        
        // Specify the new file name and path
        File newFile = new File("E:/GSRTC_harsha1.pdf");
        
        // Attempt to rename the file
        boolean success = oldFile.renameTo(newFile);
        
        if (success) {
            System.out.println("File renamed successfully!");
        } else {
            System.out.println("Failed to rename the file.");
        }
	}

}
