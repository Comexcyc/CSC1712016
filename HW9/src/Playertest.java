/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:9
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/ 

import my.players.saxophonePlayers;
import my.players.soccerPlayers;
import my.players.MP3Players;
public class Playertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
saxophonePlayers a=new saxophonePlayers(78,"Japanese","Yamazaki");
	System.out.println("Name of player:"+" "+a.name+" "+"Nationality of the Player: "+a.nationality+" age of the Player: "+a.age);
	MP3Players d=new MP3Players(699,"Sony",89);
	System.out.println("Brand: "+d.Brand+" Price: "+d.price+" Weight: "+d.weight);
	soccerPlayers h=new soccerPlayers(23,"Italian","dgdg","king");
	System.out.println("Name of player:"+" "+h.name+" "+"Nationality of the Player: "+h.nationality+" age of the Player: "+h.age+" teamname: "+h.teamname);
	}

}
