package factories;//factories package

/*importing the interfaces for each process*/
import crossover_operator.Crossover;
import mutation_operator.Mutation;
import selection_operator.Selection;

/**
 * @author Sean Rooney
 *
 */
public interface AlgoStepGeneratorFactory { // defining an interface to be implemented by a configuration of an
											// algorithm
											// which will deal with generating the different forms of our genetic
											// algorithm
											// operators depending on that algorithms behavior, no need to use abstract
											// keyword as interfaces are implicitly abstract

	/*
	 * methods in an interface are also implicitly public and abstract, so no need
	 * to declare public or abstract
	 */
	Selection generateRouletteSelection();

	Selection generateElitistSelection();

	Crossover generateMultiPointCrossover();

	Crossover generateSinglePointCrossover();

	Mutation generateScrambleMutation();

	Mutation generateBitFlipMutation();

}

/* Sources */
/*
 * https://www.tutorialspoint.com/java/java_interfaces.htm Head First Design
 * Patterns book Chapter 4
 */