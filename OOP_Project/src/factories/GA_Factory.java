package factories;
import genetic_algorithm.Algorithm;
import genetic_algorithm.Config1;
import genetic_algorithm.Config2;

public class GA_Factory extends GA_AbstractFactory{
	Algorithm alg, alg2, resAlg, returnedAlg;

	protected Algorithm generateAlgorithm(String type, String selection, String crossover, String mutation){
		//asgf = new AlgoStepGeneratorFactory();
		asgf1 = new Config1AlgoStepFactory();
		asgf2 = new Config2AlgoStepFactory();
		if(type.equals("1")){
			returnedAlg = getInstance1(selection, crossover, mutation);
		}
		if(type.equals("2")){
			returnedAlg = getInstance2(selection, crossover, mutation);
		}
		
		return returnedAlg;

	}
	public Algorithm getInstance1(String selection,String crossover, String mutation){
			if(alg == null){
				synchronized(Config1.class){
					if(alg == null){
						alg = new Config1(asgf1,selection, crossover, mutation);
						alg.setName("Configuration 1 Algorithm");
						//resAlg = alg;
					}
				}
			}
			return alg;
		}
		public Algorithm getInstance2(String selection,String crossover, String mutation){
			if(alg2 == null){
				synchronized(Config2.class){
					if(alg2 == null){
						alg2 = new Config2(asgf2,selection, crossover, mutation);
						alg2.setName("Configuration 2 Algorithm");
					}
				}
			}
			return alg2;
		}
	}

