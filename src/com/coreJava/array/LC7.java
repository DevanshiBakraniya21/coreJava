package com.coreJava.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LC7 {

	public static void main(String[] args) {
		List<Map<String, Object>> data4 = new ArrayList();
		Map<String, Object> data = new HashMap<>();
		data.put("id", "d");
		data.put("val", "d1-1");
		Map<String, Object> data1 = new HashMap<>();
		data1.put("id", "d1-2");
		data1.put("val", "d1-1-1");
		Map<String, Object> data2 = new HashMap<>();
		data2.put("id", "d1-1-2");
		data2.put("val", "d1-1-3");
		
		data4.add(data);
		data4.add(data1);
		data4.add(data2);
		
		boolean isWorkCategoryExist =data4.stream().map(a -> a.get("id"))
		        .filter(Objects::nonNull)
		        .anyMatch(type -> ("d1-1-2".equals(type.toString())));
		System.out.println(isWorkCategoryExist);
	}

}
