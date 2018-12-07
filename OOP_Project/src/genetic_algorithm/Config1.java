/*Necessary packages*/
package genetic_algorithm;
import java.util.Random;
import factories.AlgoStepGeneratorFactory;

/*Extends our abstract Algorithm class, meaning we can use all methods and variables declared in the Algorithm class*/
public class Config1 extends Algorithm{
	
	/*Simple random number generator which returns a number in range 1-3, if it returns a 1 we generate a form of mutation on the chromosome, else no mutation*/
	Random rand = new Random();
	int num = rand.nextInt((3-1)+1)+1;

	public Config1(AlgoStepGeneratorFactory asgf, String selection, String crossover, String mutation){
		/*Retrieve and set our variables for operators and algorithm step factory*/
		this.asgf = asgf;
		this.selectionStr = selection;
		this.crossoverStr = crossover;
		this.mutationStr = mutation;
	}
	/*Creating the structure for our genetic algorithm, it reads in the operators given by the user and uses the algorithm step factory to instantiate those operators*/
	public void gaStructure(){
		System.out.println("------------------------------------------------\nGenerating the set implementations for the steps of this Genetic Algorithm");
		if(this.selectionStr.equals("Roulette")){
			selection = asgf.generateRouletteSelection();
		}
		else if(this.selectionStr.equals("Elitist")){
			selection = asgf.generateElitistSelection();
		}
		if(this.crossoverStr.equals("Single Point")){
			crossover = asgf.generateSinglePointCrossover();
		}
		else if(this.crossoverStr.equals("Multi Point")){
			crossover = asgf.generateMultiPointCrossover();
		}
		/*Mutation is dependent on returned random number*/
		if(this.mutationStr.equals("Scramble")){
			if(num == 1){
				mutation = asgf.generateScrambleMutation();
			}
		}
		else if(this.mutationStr.equals("Bit Flip")){
			if(num == 1){
				mutation = asgf.generateBitFlipMutation();
			}
		}
	}
}