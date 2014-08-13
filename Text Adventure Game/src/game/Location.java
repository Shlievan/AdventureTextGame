
package game;

import java.util.Vector;
/**
 * The Location Class
 * Assigns locations/exits
 */

public class Location {
	
	// Member Variables
	/**
	 * Name of the room
	 */
	private String m_roomTitle;
	/**
	 * Description of the room
	 */
	private String m_roomDescription;
	/**
	 * Vector list of exits
	 */
	private Vector m_vecExits;
	/**
	 * getTitle
	 * @return m_roomTitle
	 */
	// Returns location title
	public String getTitle(){
		return m_roomTitle;
	}
	/**
	 * setTitle
	 * @param String roomTitle
	 * sets m_roomTitle to roomTitle
	 */
	// Assigns location title
	public void setTitle(String roomTitle){
		m_roomTitle = roomTitle;
	}
	/**
	 * getDescription
	 * @return m_roomDescription
	 */
	public String getDescription(){
		return m_roomDescription;
	}
	/**
	 * setDescription
	 * @param String desc
	 * sets m_roomDescription to desc
	 */
	public void setDescription(String desc){
		m_roomDescription = desc;
	}
	/**
	 * public void addExit
	 * @param Exit exit
	 * Adds an element "exit" to the vector m_vecExits
	 */
	//Add an exit to this location
	public void addExit(Exit exit){
		m_vecExits.addElement(exit);
	}
	/**
	 * removeExit
	 * @param exit
	 * If m_vecExits contains exit, remove it
	 */
	// Removes an exit from this location
	public void removeExit(Exit exit){
		if(m_vecExits.contains(exit)){
			m_vecExits.removeElement(exit);
		}
	}
	/**
	 * getExists
	 * Returns a vector list of the exits
	 */
	// Returns a vector of exits
	public Vector getExits(){
		
		// Return a clone, as we don't want an external
		// object to modify our original vector.
				//Good job jay. ^
		return (Vector) m_vecExits.clone();
	}
	
	
	
}
