package br.edu.ifsp.operations;

import br.edu.ifsp.exception.UnsuportedMathOperationResponse;
import br.edu.ifsp.validation.Validation;

public class Subtraction extends Validation {
	public Double subtraction( String nunberOne, String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse("Porvavor Entre com um valor numérico valido!");
		}
		
		Double subtraction = this.convertToDouble(nunberOne) - this.convertToDouble(nunberTow);
		return subtraction;
	}
}
