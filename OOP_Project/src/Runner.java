
/*Required imports*/
import factories.GA_AbstractFactory;
import factories.GA_Factory;
import genetic_algorithm.Algorithm;
import population.Population;

class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GA_AbstractFactory gaAF = new GA_Factory();// initialize genetic algorithm factory
		Algorithm alg1, alg2, alg3; // declare our two algorithms
		/* Getting our singleton Population instance */
		Population pop = Population.instance();
		/*
		 * We are telling our factory to use another factory to make a genetic algorithm
		 * with these parameters and assign it to this algorithm object We are also
		 * passing in our population Singleton object which will be given a name and
		 * will display its hash code at compile time
		 */
		alg1 = gaAF.runAlgorithm(pop, "Elitist", "Single Point", "Scramble");// These can be run with different
																				// configurations
		System.out.println(pop.getName());
		System.out.println(alg1);

		Population pop2 = Population.instance();
		alg2 = gaAF.runAlgorithm(pop2, "Roulette", "Single Point", "Scramble");
		System.out.println(pop2.getName());
		System.out.println(alg2);

		Population pop3 = Population.instance();
		alg3 = gaAF.runAlgorithm(pop3, "Roulette", "Single Point", "Scramble");
		System.out.println(pop3.getName());
		System.out.println(alg3);

	}

}
