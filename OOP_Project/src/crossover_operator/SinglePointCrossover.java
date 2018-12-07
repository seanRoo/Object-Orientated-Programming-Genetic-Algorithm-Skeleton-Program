
package crossover_operator;//crossover package

public class SinglePointCrossover implements Crossover {// implements crossover interface

	public String toString() {// toString simulating Single Point Crossover process
		return "Some Single Point Crossover!\nSelecting random crossover point...\nSwapping tails of the two parents to create new offspring...\nCompleted!";
	}
}