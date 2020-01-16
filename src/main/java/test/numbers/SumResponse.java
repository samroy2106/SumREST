package test.numbers;

public class SumResponse{
	
	private long id;
	private long sum;
	
	public SumResponse(){
		
	}
	
	public SumResponse(long id, long sum){
		
		this.id = id;
		this.sum = sum;
	}
	
	public long getSum(){
		return sum;
	}
	
	public void setSum(long sum){
		
		this.sum = sum;
	}
	
	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
}