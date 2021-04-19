package br.edu.ifsp.operations;

import br.edu.ifsp.exception.UnsuportedMathOperationResponse;
import br.edu.ifsp.validation.Validation;

public class Sum extends Validation {
	public Double sum( String nunberOne, String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse(" Porvavor Entre com um valor numérico valido!");
		}
		
		Double sum = this.convertToDouble(nunberOne) + this.convertToDouble(nunberTow);
		return sum;
	}
}
