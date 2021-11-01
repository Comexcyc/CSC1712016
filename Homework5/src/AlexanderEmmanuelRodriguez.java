/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:5
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

public class AlexanderEmmanuelRodriguez {
String name;
	int bats;
	int hits;
	int runs;
	int average;
	int games;
	int average2;
	public  AlexanderEmmanuelRodriguez(String e,int a,int b,int c,int d,int g,int f) 
	{name=e;
	 bats=a;
	 hits=b;
	 runs=c;
	 average=d;
	 games=g;
	 average2=f;}
	public void getaverage(int a,int b,int c,int d)
	{bats=a;
		hits=b;
	runs=c;
	games=d;
	
		
		average=b/a;
	average2=c/d;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBats() {
		return bats;
	}
	public void setBats(int bats) {
		this.bats = bats;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int getGames() {
		return games;
	}
	public void setGames(int games) {
		this.games = games;
	}
	public int getAverage2() {
		return average2;
	}
	public void setAverage2(int average2) {
		this.average2 = average2;
	}
	}
	
