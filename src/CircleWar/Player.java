package CircleWar;

import java.awt.Color;
import java.awt.Graphics;


public class Player {
	
	int x = 100;
	int y = 100;
	
	
	
	public Player() {
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, 100, 100, 100);
	}
}
