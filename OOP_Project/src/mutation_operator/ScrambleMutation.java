
package mutation_operator;
/*ScrambleMutation class implementing the Mutation interface*/
public class ScrambleMutation implements Mutation{
	
	/*Returns a string to be displayed by the string buffer*/
	public String toString(){
		return "Some Scramble Mutation!\nSelecting a random subset of genes to shuffle...\nShuffling values...\nComplete!";
	}
}