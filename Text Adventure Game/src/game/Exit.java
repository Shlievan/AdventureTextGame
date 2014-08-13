package game;

import game.Exit;
import game.Location;
/**
 * The Exit Class
 * Deals with direction details
 */
public class Exit {
	
	public static final int UNDEFINED = 0;
	public static final int NORTH = 1;
	public static final int SOUTH = 2;
	public static final int EAST = 3;
	public static final int WEST = 4;
	public static final int UP = 5;
	public static final int DOWN = 6;
	public static final int NORTHEAST = 7;
	public static final int NORTHWEST = 8;
	public static final int SOUTHEAST = 9;
	public static final int SOUTHWEST = 10;
	public static final int IN = 11;
	public static final int OUT = 12;
	/**
	 * String[] dirName
	 * Array of Direction Names
	 * @return null
	 */
	// String codes
	public static final String[] dirName = {
		"UNDEFINED",
		"NORTH",
		"SOUTH",
		"EAST",
		"WEST",
		"UP",
		"DOWN",
		"NORTHEAST",
		"NORTHWEST",
		"SOUTHEAST",
		"SOUTHWEST",
		"IN",
		"OUT"
	};
	/**
	 * String[] shortDirName
	 * Array of shortened direction names
	 * @return null
	 */
	public static final String[] shortDirName = 
	{
		"NULL",
		"N",
		"S",
		"E",
		"W",
		"U",
		"D",
		"NE",
		"NW",
		"SE",
		"SW",
		"I",
		"O"
	};
	
	/**
	 * private Location m_leadsTo
	 */

	private Location m_leadsTo = null;
	/**
	 *private int m_direction
	 */
	private int m_direction;
	/**
	 * private String m_directionName
	 * Full name of the direction
	 */

	private String m_directionName;
	/**
	 * private String m_shortDirectionName
	 * Short version of the direction
	 */

	private String m_shortDirectionName;
	
	/**
	 * Default Constructor
	 */

	public Exit(){
		m_direction = Exit.UNDEFINED;
		m_leadsTo = null;
		m_directionName = dirName[UNDEFINED];
		m_shortDirectionName = shortDirName[UNDEFINED];
	}
	/**
	 * Full Constructor
	 * This constructor assigns direction and shorthand direction
	 * m_leadsTo is set to leadsTo
	 * @param int direction
	 * @param Location leadsTo
	 * 
	 */
	public Exit(int direction, Location leadsTo){
		m_direction = direction;
		
		
		// Assign direction Names
		if(direction <= dirName.length)
			m_directionName = dirName[m_direction];
		if(direction <= shortDirName.length)
			m_shortDirectionName = shortDirName[m_direction];
		
		// Assign location
		m_leadsTo = leadsTo;
	}
	/**
	 * public String toString
	 * @return m_directionName
	 */
	// toString Method
	public String toString(){
		return "Direction: " + getDirectionName();//Changed from m_directionName to
												  //getDirectionName()
	}
	/**
	 * setDirectionName
	 * * Sets m_directionName to dirname
	 * @param String dirname	 
	 */
	// Assigns direction Name
	public void setDirectionName(String dirname){
		m_directionName = dirname;
	}
	/**
	 * public String getDirectionName
	 * @return m_directionName
	 */
	// Returns direction name
	public String getDirectionName(){
		return m_directionName;
	}
	/**
	 * setShortDirectionName
	 * sets m_shortDirectionName to shortName
	 * @param String shortName
	 *
	 */
	// Assigns short direction name
	public void setShortDirectionName(String shortName){
		m_shortDirectionName = shortName;
	}
	/**
	 * getShortDirectionName
	 * @return m_shortDirectionName
	 */
	// Returns short direction name
	public String getShortDirectionName(){
		return m_shortDirectionName;
	}
	/**
	 * setLeadsTo
	 * @param Location leadsTo
	 * sets m_leadsTo to leadsTo
	 */
	// Assigns location
	public void setLeadsTo(Location leadsTo){
		m_leadsTo = leadsTo;
	}
	/**
	 * getLeadsTo
	 * @return m_leadsTo
	 */
	// Returns location
	public Location getLeadsTo(){
		return m_leadsTo;
	}
}
