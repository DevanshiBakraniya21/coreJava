package com.coreJava.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class list {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("ak", "a1");
		map.put("av", "a1a");
		
		
		Map<String, Object> map1 = new HashMap<>();
		map.put("ak", "a2");
		map.put("av", "a2a");
		
		Map<String, Object> map2 = new HashMap<>();
		map.put("ak", "a3");
		map.put("av", "a3a");
		
		List<Map<String, Object>> list = new ArrayList<>();
		list.add(map);
		list.add(map1);
		list.add(map2);
		
		List<Map<String, Object>> list1 =list.stream()
                .distinct()
                .collect(Collectors.toList());
				//.filter(m -> (m.get("e") == "e" )).collect(Collectors.toList());
		
//		list.stream().forEach(map5 -> {
//			if(map5.get("a")=="a1") {
//				callmethod(map5);
//			}else {
//				map5.put("k", "k1");
//			}
//		});
		System.out.println(list1);
		
	}

	private static void callmethod(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
	}

}
