package CircleWar;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePlay extends JPanel{
	
	static final int FPS = 60;
	
	Player p;
		
	public GamePlay() {
		
		p = new Player();

	}

	
	
	// game loop
	public void paint(Graphics g) {
		
		p.draw(g);
		
		//dont tutch its for the update
		g.dispose();	
		repaint();
		
		
		try {
			Thread.sleep(1000/FPS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
}


	

