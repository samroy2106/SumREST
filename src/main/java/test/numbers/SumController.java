package test.numbers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import test.numbers.SumResponse;
import test.numbers.SumRequest;
import test.numbers.SumService;

@RestController
class SumController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/add")
	public List<SumResponse> getSums(){
		
		SumService re = new SumService();
		
		return re.getAllSums();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/add/{id}")
	public SumResponse getOneSum(@PathVariable long id){
		
		SumService re = new SumService();
		
		return re.getSum(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public SumResponse calculate(@RequestBody SumRequest request){
		
		SumResponse response = new SumResponse();
		SumService service = new SumService();
		
		long n1 = request.getN1();
		long n2 = request.getN2();
		
		long sum = n1+n2;
		
		response.setSum(sum);
		
		return service.addSum(response);
	}
}
