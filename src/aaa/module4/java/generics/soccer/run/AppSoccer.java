package aaa.module4.java.generics.soccer.run;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import aaa.module4.java.generics.soccer.Player;
import aaa.module4.java.generics.soccer.Team;

public class AppSoccer {

	private static final int MAX_NUMBER = 100;
	private static final String FIELD_NUMBER = "number";
	private static final String FIELD_NAME = "name";
	
	public AppSoccer() {
		super();
	}

	public static void main(String[] args) {
		
		Team <Player> team = new Team <Player>();
		
		Player p = null;
		Random r = new Random(UUID.randomUUID().getMostSignificantBits());
		
		p = new Player (Integer.valueOf(r.nextInt(AppSoccer.MAX_NUMBER)), "Niño");
		team.addMember(p);
		
		p = new Player (Integer.valueOf(r.nextInt(AppSoccer.MAX_NUMBER)), "Willem");
		team.addMember(p);
		
		p = new Player (Integer.valueOf(r.nextInt(AppSoccer.MAX_NUMBER)), "Santon");
		team.addMember(p);
		
		p = new Player (Integer.valueOf(r.nextInt(AppSoccer.MAX_NUMBER)), "Vicen");
		team.addMember(p);
		
		p = new Player (Integer.valueOf(r.nextInt(AppSoccer.MAX_NUMBER)), "Mat");
		team.addMember(p);
		
		List <Player> players = team.getMembersByFieldReverse(AppSoccer.FIELD_NAME);
		
		System.out.println("Players Reverse Sorted by: " + AppSoccer.FIELD_NAME + "...");
		
		for (Player player : players)
		{
			System.out.println(player.toString());
		}
		
		System.out.println("Players Reverse Sorted by: " + AppSoccer.FIELD_NUMBER + "...");
		
		players = team.getMembersByFieldReverse(AppSoccer.FIELD_NUMBER);
		
		for (Player player : players)
		{
			System.out.println(player.toString());
		}
	}
}
