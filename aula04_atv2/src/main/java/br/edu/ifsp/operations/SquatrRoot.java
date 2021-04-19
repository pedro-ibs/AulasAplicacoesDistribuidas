package br.edu.ifsp.operations;

import br.edu.ifsp.exception.UnsuportedMathOperationResponse;
import br.edu.ifsp.validation.Validation;

public class SquatrRoot extends Validation {
	public Double squatrRoot( String nunberOne ) throws Exception {
		
		if(!this.isNumeric(nunberOne)) {
			throw new UnsuportedMathOperationResponse("Porvavor Entre com um valor numérico valido!");
		}
		
		Double squatrRoot = Math.sqrt(this.convertToDouble(nunberOne));;
		return squatrRoot;
	}
}
