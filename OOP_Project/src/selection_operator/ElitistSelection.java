package selection_operator;

/*Elitist class implementing the selection interface*/
public class ElitistSelection implements Selection{

	/*toString method returning a string that will be displayed by the string buffer if instantiated*/
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Some Elitist Selection!\nSelecting some of our fittest candidates...\nCopying to the next generation...\nSelection Complete!";
	}
}
