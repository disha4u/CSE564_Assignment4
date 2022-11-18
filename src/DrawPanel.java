import java.util.*;
import java.util.List;
import java.util.Queue;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements Observable,ActionListener{
	private List<Observer> observers=new ArrayList<Observer>();
	
	/**
	* Notifies Observers the current state
	*/
	public void Notify()
	{
		for(Observer o: observers)
		{
			//o.Update();
		}
		
	}
	
	/**
	* adds Observer to the list of observers
	* @param Observer object
	*/
	public void addObservers(Observer o)
	{
		observers.add(o);
	}
	
	/**
	* removes Observer from the list of observers
	* @param Observer object
	*/
	public void removeObservers(Observer o)
	{
		observers.remove(o);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
