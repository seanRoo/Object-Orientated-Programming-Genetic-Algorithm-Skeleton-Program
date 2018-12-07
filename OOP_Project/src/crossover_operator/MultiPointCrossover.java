
package crossover_operator; //crossover package

/**
 * @author Sean Rooney
 *
 */
public class MultiPointCrossover implements Crossover {// implements crossover interface

	public String toString() {// toString method simulating Multi Point Crossover process to be displayed by
								// the string buffer
		return "Some Multi Point Crossover!\nSelecting random alternating crossover points...\nSwapping points of the two parents to create new offspring...\nCompleted!";
	}
}