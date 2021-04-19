package br.edu.ifsp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.exception.UnsuportedMathOperationResponse;

@RestController
public class MathController {	
	@RequestMapping(value = "/sum/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double sum( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse(" Porvavor Entre com um valor numérico valido!");
		}
		
		Double sum = this.convertToDouble(nunberOne) + this.convertToDouble(nunberTow);
		return sum;
	}

	@RequestMapping(value = "/subtraction/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double subtraction( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse(" Porvavor Entre com um valor numérico valido!");
		}
		
		Double sum = this.convertToDouble(nunberOne) - this.convertToDouble(nunberTow);
		return sum;
	}
	
	@RequestMapping(value = "/mutiplicator/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double mutiplicator( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse(" Porvavor Entre com um valor numérico valido!");
		}
		
		Double sum = this.convertToDouble(nunberOne) * this.convertToDouble(nunberTow);
		return sum;
	}

	@RequestMapping(value = "/division/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double division( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse(" Porvavor Entre com um valor numérico valido!");
		}
		
		Double sum = this.convertToDouble(nunberOne) / this.convertToDouble(nunberTow);
		return sum;
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double mean( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse(" Porvavor Entre com um valor numérico valido!");
		}
		
		Double sum = (this.convertToDouble(nunberOne) + this.convertToDouble(nunberTow)/2);
		return sum;
	}	
	
	
	@RequestMapping(value = "/squatrRoot/{numberOne}", method=RequestMethod.GET)
	public Double squatrRoot(@PathVariable("nunberOne") String nunberOne ) throws Exception {
		
		if(!this.isNumeric(nunberOne)) {
			throw new UnsuportedMathOperationResponse(" Porvavor Entre com um valor numérico valido!");
		}
		Double sum = Math.sqrt(this.convertToDouble(nunberOne));
		return sum;
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
