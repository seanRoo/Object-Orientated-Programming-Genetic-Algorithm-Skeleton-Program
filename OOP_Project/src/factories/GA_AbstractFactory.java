
package factories; //factories package

import genetic_algorithm.Algorithm; //importing our abstract algorithm class
import population.Population;

/*This abstract factory allows us to create families/different variations of a genetic algorithm without specifying their
 * concrete classes
 * */

/**
 * @author Sean Rooney
 *
 */
public abstract class GA_AbstractFactory {
	AlgoStepGeneratorFactory asgf;// declaring our factory for generating operators

	/*
	 * runAlgorithm method is called in Runner.java with user specifications as
	 * parameters, this method starts off the entire creation of the algorithm
	 */
	public Algorithm runAlgorithm(Population pop, String selection, String crossover, String mutation) {
		Algorithm alg = generateAlgorithm(pop, selection, crossover, mutation);
		alg.gaStructure();
		return alg;
	}

	/*
	 * All the responsibility for instantiating an Algorithm has been moved into
	 * this method which acts as a factory.
	 */
	protected abstract Algorithm generateAlgorithm(Population pop, String selection, String crossover, String mutation);
}

/*
 * Sources
 *
 * Head First Design Patterns Chapter 4
 * https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 */
