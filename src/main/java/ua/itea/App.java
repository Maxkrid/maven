package ua.itea;

import java.awt.HeadlessException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import group.Pudge;

/**
 * Hello world!
 *
 */
public class App extends JFrame
{
	
    public App() throws HeadlessException {
		super();
		setSize(300,300);
		URL url = this.getClass().getResource("/pudge.jpg");
		JLabel jlabelImage02 = new JLabel(new ImageIcon(url));
		add(jlabelImage02);
				setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main( String[] args )
    {
	new App();
        System.out.println( "Hello World!" );
        Pudge pudge = new Pudge();
        System.out.println(pudge.getUltimate());
        
    }
}
