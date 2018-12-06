package genetic_algorithm;
import crossover_operator.Crossover;
import factories.AlgoStepGeneratorFactory;
import mutation_operator.Mutation;
import selection_operator.Selection;

public abstract class Algorithm{
	Algorithm alg,alg2, resAlg;	
	AlgoStepGeneratorFactory asgf,asgf2;
	String name,type;
	Selection selection;
	Mutation mutation;
	Crossover crossover;

	public abstract void gaStructure();

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n---- " + name + " ----\n");
		if (selection != null) {
			result.append(selection);
			result.append("\n");
		}
		if (crossover != null) {
			result.append(crossover);
			result.append("\n");
		}
		result.append("Will we see any mutation on our chromosome? There's a small chance....\n");
		if (mutation != null) {
			result.append("\n"+mutation);
			result.append("\n");
		}
		else if(mutation == null){
			result.append("\nNo mutation this time!");
		}
	
		return result.toString();
	}

}