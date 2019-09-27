package test;

import java.util.ArrayList;

public class ContestCalculator {    
ArrayList<Double> calculateWinner(ArrayList<Double> WyateErpsNuggets, ArrayList<Double> ButchCassidaysNuggets) {
	double sum=0;
	double summ=0;
		for (int i = 0; i < ButchCassidaysNuggets.size(); i++) {
			sum+=ButchCassidaysNuggets.get(i);
			
		}	
			
			for (int j = 0; j < WyateErpsNuggets.size(); j++) {
				summ+=WyateErpsNuggets.get(j);
		                                                                              
		}
		if(sum>summ) {
			return ButchCassidaysNuggets;
		}else {
			 return WyateErpsNuggets;
		}
		
		
		
}
}
