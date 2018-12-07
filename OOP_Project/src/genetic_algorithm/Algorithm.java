
package genetic_algorithm;
import crossover_operator.Crossover;
import factories.AlgoStepGeneratorFactory;
import mutation_operator.Mutation;
import selection_operator.Selection;

/**
 * @author Sean Rooney
 *
 */
public abstract class Algorithm{
	/*We can declare variables here that can be assigned values in subclasses that inherit this abstract class*/
	AlgoStepGeneratorFactory asgf;
	Selection selection;
	Mutation mutation;
	Crossover crossover;
	/*Declaring operator strings that will be given the values passed through Config1 constructor*/
	String selectionStr, crossoverStr, mutationStr;
	
	/*Method responsible for evaluating the user input and generating the associated operators through an Algorithm step factory
	 * It is implemented in Config1 which extends this class
	 */
	public abstract void gaStructure();
	
	/*String buffer printing out our genetic algorithm operators*/
	public String toString() {
		StringBuffer result = new StringBuffer();
		if (selection != null) {
			result.append(selection);
			result.append("\n");
		}
		if (crossover != null) {
			result.append(crossover);
			result.append("\n");
		}
		result.append("\nWill we see any mutation on our chromosome? There's a small chance....\n");
		if (mutation != null) {
			result.append("\n"+mutation);
			result.append("\n");
		}
		else if(mutation == null){
			result.append("\nNo mutation this time!\n");
		}
	
		return result.toString();
	}

}
/*Sources
 * Head First Design Patterns Chapter 4
*/