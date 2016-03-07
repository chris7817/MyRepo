package directoryLister;

/**
 *
 * @author Christopher Myung <Chris.Myung@gmail.com>
 */

public class Driver
{
	public static void main(String[] args)
	{
		GUI gui = new GUI();
		DirectoryLister dl = new DirectoryLister(gui);
		gui.registerModel(dl);
	}
	
}