package factories;
import genetic_algorithm.Algorithm;

public abstract class GA_AbstractFactory{
	AlgoStepGeneratorFactory asgf1;
	AlgoStepGeneratorFactory asgf2;

	public Algorithm runAlgorithm(String type,String selection,String crossover, String mutation){
		Algorithm alg = generateAlgorithm(type, selection, crossover, mutation);
		System.out.println("----------------------------------------------\nGenerating a " + alg.getName());
		alg.gaStructure();
		return alg;
	}

	protected abstract Algorithm generateAlgorithm(String type, String selection, String crossover, String mutation);
}