package CircleWar;

import java.awt.Color;
import java.awt.Graphics2D;

public class Player {
	public Player() {
		
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillRect(100, 100, 10, 10);
		System.out.println("hej player");
	}
}
