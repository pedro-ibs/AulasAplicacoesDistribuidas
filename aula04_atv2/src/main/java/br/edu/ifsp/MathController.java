package br.edu.ifsp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.operations.Sum;

@RestController
public class MathController {	
	@RequestMapping(value = "/sum/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double sum( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Sum sum = new Sum();
		return sum.sum(nunberOne, nunberTow);
	}

	@RequestMapping(value = "/subtraction/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double subtraction( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Sum sum = new Sum();
		return sum.sum(nunberOne, nunberTow);
	}
	
	@RequestMapping(value = "/mutiplicator/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double mutiplicator( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Sum sum = new Sum();
		return sum.sum(nunberOne, nunberTow);
	}

	@RequestMapping(value = "/division/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double division( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Sum sum = new Sum();
		return sum.sum(nunberOne, nunberTow);
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double mean( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Sum sum = new Sum();
		return sum.sum(nunberOne, nunberTow);
	}
	
	
	@RequestMapping(value = "/squatrRoot/{numberOne}", method=RequestMethod.GET)
	public Double squatrRoot( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Sum sum = new Sum();
		return sum.sum(nunberOne, nunberTow);
	}	
	
	
	/**
	 * @note esses metodos vão vicar uma classe de validação 
	 */
	private Double convertToDouble(String strNumber) {
		if(strNumber == null ) return 0D;
		String number = strNumber.replace(",", ".");
		if(this .isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}
	
	private boolean isNumeric(String strNumber) {
		if(strNumber == null ) return false;
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
