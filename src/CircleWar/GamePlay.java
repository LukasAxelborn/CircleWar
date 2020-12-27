package CircleWar;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GamePlay extends JPanel{
	
	static final int FPS = 60;
	
	Player p;
		
	public GamePlay() {
		
		p = new Player();

	}

	
	
	// game loop
	public void paint(Graphics2D g) {
		
		p.draw(g);
		System.out.println("hej GamePlay");
		
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


	

