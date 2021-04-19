package br.edu.ifsp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.operations.Division;
import br.edu.ifsp.operations.Mean;
import br.edu.ifsp.operations.Mutiplicator;
import br.edu.ifsp.operations.SquatrRoot;
import br.edu.ifsp.operations.Subtraction;
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
		Subtraction subtraction = new Subtraction();
		return subtraction.subtraction(nunberOne, nunberTow);
	}
	
	@RequestMapping(value = "/mutiplicator/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double mutiplicator( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Mutiplicator mutiplicator = new Mutiplicator();
		return mutiplicator.mutiplicator(nunberOne, nunberTow);
	}

	@RequestMapping(value = "/division/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double division( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Division division = new Division();
		return division.division(nunberOne, nunberTow);
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{nunberTow}", method=RequestMethod.GET)
	public Double mean( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		Mean mean = new Mean();
		return mean.mean(nunberOne, nunberTow);
	}
	
	
	@RequestMapping(value = "/squatrRoot/{numberOne}", method=RequestMethod.GET)
	public Double squatrRoot( @PathVariable("numberOne") String nunberOne, @PathVariable("nunberTow") String nunberTow ) throws Exception {
		SquatrRoot squatrRoot = new SquatrRoot();
		return squatrRoot.squatrRoot(nunberOne);
	}	
	
}
