package factories;
import crossover_operator.Crossover;
import crossover_operator.MultiPointCrossover;
import crossover_operator.SinglePointCrossover;
import mutation_operator.BitFlipMutation;
import mutation_operator.Mutation;
import mutation_operator.ScrambleMutation;
import selection_operator.ElitistSelection;
import selection_operator.RouletteSelection;
import selection_operator.Selection;

class Config2AlgoStepFactory implements AlgoStepGeneratorFactory{

	public Selection generateRouletteSelection(){
		return new RouletteSelection();
	}
	public Selection generateElitistSelection(){
		return new ElitistSelection();
	}

	public Crossover generateSinglePointCrossover(){
		return new SinglePointCrossover();
	}

	public Crossover generateMultiPointCrossover(){
		return new MultiPointCrossover();
	}

	public Mutation generateScrambleMutation(){
		return new ScrambleMutation();
	}

	public Mutation generateBitFlipMutation(){
		return new BitFlipMutation();
	}
}