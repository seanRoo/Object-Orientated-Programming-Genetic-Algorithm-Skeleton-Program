package population;

/*Our Singleton Population class*/
public class Population{
	String name;
		
		Population() {
		}
		
		/*The Bill Pugh Singleton method creates the Singleton class using an inner static helper class. 
		 * When the singleton class is loaded, SingletonHelper class is not loaded into memory and only 
		 * when someone calls the getInstance method, this class gets loaded and creates the Singleton class 
		 * instance */
		private static class SingletonHelper{
			private static final Population INSTANCE = new Population();
		}

		public static Population instance(){
			System.out.println("-----------------------------------------------\nLoading Population....");
			return  SingletonHelper.INSTANCE;
		}
		/*Methods for setting and getting the name of the population*/
		/**
		 * @param name
		 */
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
}

/*Sources
 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 * */
 