package com.coreJava.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class Hr3 {

	public static void main(String[] args) throws ParseException {
		String t = "07:05:45PM";
		SimpleDateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		SimpleDateFormat df2 = new SimpleDateFormat("HH:mm:ss");
		Date d = df.parse(t);
		
		System.out.println(df2.format(d));
	}

}
