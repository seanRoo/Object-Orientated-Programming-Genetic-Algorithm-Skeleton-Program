package genetic_algorithm;
import java.util.Random;
import factories.AlgoStepGeneratorFactory;
public class Config2 extends Algorithm{
	
	Random rand = new Random();
	String selectionStr, crossoverStr, mutationStr;
	int num = rand.nextInt((3-1)+1)+1;

	public Config2(AlgoStepGeneratorFactory asgf, String selection, String crossover, String mutation){
		this.asgf2 = asgf;
		this.selectionStr = selection;
		this.crossoverStr = crossover;
		this.mutationStr = mutation;
	}

	public void gaStructure(){
		System.out.println("Generating the set implementations for the steps of this Genetic Algorithm");
		if(this.selectionStr.equals("Roulette")){
			selection = asgf2.generateRouletteSelection();
		}
		else if(this.selectionStr.equals("Elitist")){
			selection = asgf2.generateElitistSelection();
		}
		if(this.crossoverStr.equals("Single Point")){
			crossover = asgf2.generateSinglePointCrossover();
		}
		else if(this.crossoverStr.equals("Multi Point")){
			crossover = asgf2.generateMultiPointCrossover();
		}
		if(this.mutationStr.equals("Scramble")){
			if(num == 1){
				mutation = asgf2.generateScrambleMutation();
			}
		}
		else if(this.mutationStr.equals("Bit Flip")){
			if(num == 1){
				mutation = asgf2.generateBitFlipMutation();
			}
		}
	}
}