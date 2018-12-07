package factories;//factories package

/*importing genetic algorithm operator types and their interfaces*/
import crossover_operator.Crossover;
import crossover_operator.MultiPointCrossover;
import crossover_operator.SinglePointCrossover;
import mutation_operator.BitFlipMutation;
import mutation_operator.Mutation;
import mutation_operator.ScrambleMutation;
import selection_operator.ElitistSelection;
import selection_operator.RouletteSelection;
import selection_operator.Selection;

/**
 * This factory generates the variations of our genetic operators depending on
 * user specifications The factory implements the interface for all genetic
 * operator factories
 **/

class Config1AlgoStepFactory implements AlgoStepGeneratorFactory {

	public Selection generateRouletteSelection() {
		return new RouletteSelection();
	}

	public Selection generateElitistSelection() {
		return new ElitistSelection();
	}

	public Crossover generateSinglePointCrossover() {
		return new SinglePointCrossover();
	}

	public Crossover generateMultiPointCrossover() {
		return new MultiPointCrossover();
	}

	public Mutation generateScrambleMutation() {
		return new ScrambleMutation();
	}

	public Mutation generateBitFlipMutation() {
		return new BitFlipMutation();
	}
}

/*
 * Sources
 * 
 * Head First Design Patterns Chapter 4
 * 
 **/