import factories.GA_AbstractFactory;
import factories.GA_Factory;
import genetic_algorithm.Algorithm;

class Runner {
 
	public static void main(String[] args) {
		GA_AbstractFactory gaAF = new GA_Factory();
 
		Algorithm alg1, alg2; 
		alg1 = gaAF.runAlgorithm("1","Elitist", "Single Point", "Scramble");
		System.out.println("Steps Being Done on an Algorithm with Object Ref ==> " + alg1.hashCode() + "\n" + alg1);

		alg1 = gaAF.runAlgorithm("1","Roulette", "Multi Point", "Scramble");
		System.out.println("Algorithm is a Singleton, so we have the same Object Ref ==> " + alg1.hashCode() + "\n" + alg1);

		alg2 = gaAF.runAlgorithm("2","Roulette", "Multi Point", "Bit Flip");
		System.out.println("Steps Being Done on an Algorithm with Object Ref ==> " + alg2.hashCode() + "\n" + alg2);

		alg2 = gaAF.runAlgorithm("2","Roulette", "Multi Point", "Bit Flip");
		System.out.println("Algorithm is a Singleton, so we have the same Object Ref ==> " + alg2.hashCode() + "\n" + alg2);

	}


}

