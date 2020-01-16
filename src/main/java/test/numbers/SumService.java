package test.numbers;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class SumService {

	private Map<Long, SumResponse> sums = DatabaseClass.getSumMap();
	
	public List<SumResponse> getAllSums(){
		return new ArrayList<SumResponse>(sums.values());	
	}
	
	public SumResponse getSum(long id){
		return sums.get(id);
	}
	
	public SumResponse addSum(SumResponse resp){
		
		resp.setId(sums.size()+1);
		sums.put(resp.getId(), resp);
		return resp;
	}
}
