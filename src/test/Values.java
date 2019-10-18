package test;

import java.util.ArrayList;
import java.util.HashMap;



public class Values {

static ArrayList<String> sv(ArrayList<Integer> nums, HashMap<Integer, String> hm){
	ArrayList<String> similarValues=new ArrayList<String>();
	for (int i = 0; i < nums.size(); i++) {
		nums.get(i);
		String x=hm.get(nums.get(i));
		
		if(x != null) {
			similarValues.add(x);
		}
		
			
		
	}
	
	return similarValues;
	
}



public static void main(String[] args) {
	
	ArrayList<Integer> nums = new ArrayList<Integer>();
	nums.add(345);
	nums.add(22);
	nums.add(32);
	nums.add(25);
	nums.add(236);
	nums.add(2134);
	nums.add(7);
	nums.add(98);
	nums.add(98);
	nums.add(856);
	nums.add(4565);
	
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(234, "Taco");
	hm.put(254, "Nachos");
	hm.put(7, "Pizza");
	hm.put(32, "Soda");
	hm.put(24, "Burritos");
	hm.put(4565, "Bagel");
	hm.put(2004, "Chips");
	hm.put(2346, "Cake");
	ArrayList<String> similarValues=sv(nums, hm);
	System.out.println(similarValues);
}

}
