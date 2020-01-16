package test.numbers;

import java.util.HashMap;
import java.util.Map;

class DatabaseClass {

	private static Map<Long, SumResponse> Sums = new HashMap<>();
	
	public static Map<Long, SumResponse> getSumMap(){
		return Sums;
	}
}
