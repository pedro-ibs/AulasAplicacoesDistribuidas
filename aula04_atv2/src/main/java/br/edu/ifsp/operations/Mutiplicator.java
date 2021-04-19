package br.edu.ifsp.operations;

import br.edu.ifsp.exception.UnsuportedMathOperationResponse;
import br.edu.ifsp.validation.Validation;

public class Mutiplicator extends Validation {
	public Double mutiplicator( String nunberOne, String nunberTow ) throws Exception {
		
		if(!this.isNumeric(nunberOne) || !this.isNumeric(nunberTow)) {
			throw new UnsuportedMathOperationResponse("Porvavor Entre com um valor numérico valido!");
		}
		
		Double mutiplicator = this.convertToDouble(nunberOne) * this.convertToDouble(nunberTow);
		return mutiplicator;
	}
}
