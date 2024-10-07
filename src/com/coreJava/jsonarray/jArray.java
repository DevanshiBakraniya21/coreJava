package com.coreJava.jsonarray;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Dog{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 
public class jArray {
	 public static void main(String [] args){
	        Dog dog = new Hound();
	        dog.bark();
	    }
	/*
	 * public static void main(String[] args) { JSONObject b = new JSONObject();
	 * b.put("eCode", "01"); b.put("eMsg", "test");
	 * System.out.println(b.toJSONString());
	 * 
	 * JSONArray array = new JSONArray(); array.add(b);
	 * System.out.println(array.toJSONString());
	 * 
	 * }
	 */

}
