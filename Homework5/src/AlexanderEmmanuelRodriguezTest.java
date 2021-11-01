/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:5
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

public class AlexanderEmmanuelRodriguezTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlexanderEmmanuelRodriguez a= new AlexanderEmmanuelRodriguez("Alex Rodriguez",2,56,34,69,45,23);
		//a.setName("Peter");
		System.out.println("name: "+a.getName());
	System.out.println("bat: "+a.getBats());
	System.out.println("Hits: "+a.getHits());
	System.out.println("Runs: "+a.getRuns());
	System.out.println("Average hits per bat: "+a.getAverage());	
	System.out.println("Total number of games: "+a.getGames());
	System.out.println("Average2 runs per game: " +a.getAverage2());
	}

}
