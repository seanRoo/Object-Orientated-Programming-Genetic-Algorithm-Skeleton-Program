/*Required package and imports*/
package factories;

import genetic_algorithm.Algorithm;
import genetic_algorithm.Config1;
import population.Population;

/*This class extends the abstract factory class GA_AbstractFactory and is responsible for defining the generateAlgorithm method which instantiates an AlgorithmStepGeneratorFactory which will deal with the creation
 * of our concrete Genetic Algorithm operators */
public class GA_Factory extends GA_AbstractFactory {
	Algorithm alg;

	/* The method responsible for instantiating our Algorithm and Operators */
	/* (non-Javadoc)
	 * @see factories.GA_AbstractFactory#generateAlgorithm(population.Population, java.lang.String, java.lang.String, java.lang.String)
	 */
	protected Algorithm generateAlgorithm(Population pop, String selection, String crossover, String mutation) {
		pop.setName("Population with Object Reference ====> " + pop.hashCode()); // set name of factory and print hash
																					// code to prove it is a singleton
		/* initialize the factory responsible for generating operators */
		asgf = new Config1AlgoStepFactory();

		/*
		 * send the genetic operators, along with the Algorithm Step Factory to Config1
		 * where the operators can be instantiated
		 */
		alg = new Config1(asgf, selection, crossover, mutation);

		// return our algorithm
		return alg;

	}

}
