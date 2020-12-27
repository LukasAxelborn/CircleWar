package CircleWar;

import javax.swing.JFrame;


public class Main{
	
	int width = 800;
	int height = 600;
	
	
	public Main() {
		JFrame frame = new JFrame("Maze algoritm");
		GamePlay game = new GamePlay();
		frame.setSize(width+16,height+38);
	
		//frame.setBounds(10, 10, width, height);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	
		frame.add(game);
		
		//game.repaint();
		
	}
	

	

	public static void main(String[] args) {
		new Main();

		
	}

}
