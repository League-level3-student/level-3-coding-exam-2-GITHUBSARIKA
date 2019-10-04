package test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {
ArrayList<String> commonKeyValues(ArrayList<Integer> lst, HashMap<Integer, String> hm){
	ArrayList<String> commonValues=new ArrayList<String>();
	
		for (int i = 0; i < lst.size(); i++) {
	  String x=hm.get(lst.get(i));
	  if(x!=null) {
		  commonValues.add(x);
		  
	  }
	}
	
	
	return commonValues;
	
	
	
}
}
