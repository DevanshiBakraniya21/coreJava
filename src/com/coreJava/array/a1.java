package com.coreJava.array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class a1 {
	    
	    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

	    public static String convertToCrore(long number) {
	        if (number == 0) {
	            return "Zero";
	        }
	        
	         String  words = "";
	        int crore = (int) (number / 10000000);
	        int remaining = (int) (number % 10000000);
	        BigDecimal d = BigDecimal.ZERO;
	        if (crore > 0) {
	            d=new BigDecimal( crore+"."+remaining );
	            words= d.setScale(2, RoundingMode.HALF_UP)+" Crore ";
	        }
	        
	        
	        
	        return words.trim();
	    }
	    
	    private static String convertToWords(int number) {
	        if (number < 10) {
	            return ones[number];
	        }
	        if (number < 20) {
	            return teens[number - 10];
	        }
	        if (number < 100) {
	            return tens[number / 10] + " " + ones[number % 10];
	        }
	        if (number < 1000) {
	            return ones[number / 100] + " Hundred " + convertToWords(number % 100);
	        }
	        if (number < 100000) {
	            return convertToWords(number / 1000) + " Thousand " + convertToWords(number % 1000);
	        }
	        if (number < 10000000) {
	            return convertToWords(number / 100000) + " Lakh " + convertToWords(number % 100000);
	        }
	        return "";
	    }
	    
	    public static void main(String[] args) {
	        long[] numbers = {70000000, 770000000, 770330000, 100000, 500000, 1000000, 5000000, 10000000, 50000000, 100000000};
	        
	        for (long number : numbers) {
	            if (number <= 1000000) {
	                System.out.println(number);
	            } else {
	                System.out.println(convertToCrore(number));
	            }
	        }
	    }
	
}

