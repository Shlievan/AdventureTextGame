package game;

import java.util.Vector;

public class Location {
	
	// Member Variables
	private String m_roomTitle;
	private String m_roomDescription;
	private Vector m_vecExits;
	
	// Returns location title
	public String getTitle(){
		return m_roomTitle;
	}
	
	// Assigns location title
	public void setTitle(String roomTitle){
		m_roomTitle = roomTitle;
	}
	
	public String getDescription(){
		return m_roomDescription;
	}
	
	public void setDescription(String desc){
		m_roomDescription = desc;
	}
	
	//Add an exit to this location
	public void addExit(Exit exit){
		m_vecExits.addElement(exit);
	}
	
	// Removes an exit from this location
	public void removeExit(Exit exit){
		if(m_vecExits.contains(exit)){
			m_vecExits.removeElement(exit);
		}
	}
	
	// Returns a vector of exits
	public Vector getExits(){
		
		// Return a clone, as we don't want an external
		// object to modify our original vector.
		return (Vector) m_vecExits.clone();
	}
	
	
	
}
