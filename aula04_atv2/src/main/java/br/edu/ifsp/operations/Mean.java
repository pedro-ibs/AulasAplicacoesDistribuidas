package br.edu.ifsp.operations;

import br.edu.ifsp.exception.UnsuportedMathOperationResponse;
import br.edu.ifsp.validation.Validation;

public class Mean extends Validation {
	public Double mean( String nunberOne, String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse("Porvavor Entre com um valor numérico valido!");
		}
		
		Double mean = (this.convertToDouble(nunberOne) + this.convertToDouble(nunberTow))/2;
		return mean;
	}
}
