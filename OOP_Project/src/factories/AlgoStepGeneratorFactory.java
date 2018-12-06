package factories;
import crossover_operator.Crossover;
import mutation_operator.Mutation;
import selection_operator.Selection;

public interface AlgoStepGeneratorFactory{

	public Selection generateRouletteSelection();
	public Selection generateElitistSelection();
	public Crossover generateMultiPointCrossover();
	public Crossover generateSinglePointCrossover();
	public Mutation generateScrambleMutation();
	public Mutation generateBitFlipMutation();
	
}