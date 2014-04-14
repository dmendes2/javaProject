/**
 * Class to hold model data (actual to do list items)
 */

package cop4331.model_classes;

//import java.util.Calendar;

public class ListModel 
{
	//class variables for list
	private String id;
	private String listItem;
	private String itemNote;
	private int priority;
	  
	//Constructor
	  public ListModel(String listItem, String itemNote, int priority) 
	  {
	    this.listItem = listItem;
	    this.itemNote = itemNote;
	    this.priority = priority;
	  }
	  
	  /**
	   * getId returns item id
	   * @precondition 
	   * @postcondition
	   * @return
	   */
	  public String getId() 
	  {
	    return id;
	  }
	  
	  /**
	   * setId setter method for item id
	   * @precondition
	   * @postcondition
	   * @param id
	   */
	  public void setId(String id) 
	  {
	    this.id = id;
	  }
	  
	  /**
	   * getListItem to return actual item
	   * @precondition
	   * @postcondition
	   * @return list item
	   */
	  public String getlistItem() 
	  {
	    return listItem;
	  }
	  
	  /**
	   * setListItem setter method for list item
	   * @precondition
	   * @postcondition
	   * @param listItem
	   */
	  public void setlistItem(String listItem) 
	  {
	    this.listItem = listItem;
	  }
	  
	  /**
	   * getItemNote to return string of detailed note for item
	   * @precondition
	   * @postcondition 
	   * @return
	   */
	  public String getItemNote() 
	  {
	    return itemNote;
	  }
	  
	  /**
	   * setItemNote sets string note for item
	   * @precondition
	   * @postcondition 
	   * @param itemNote
	   */
	  public void setItemNote(String itemNote) 
	  {
	    this.itemNote = itemNote;
	  }
	  
	  /**
	   * getPriority returns priority status of item
	   * @precondition
	   * @postcondition 
	   * @return
	   */
	  public int getPriority() 
	  {
	    return priority;
	  }
	
	  /**
	   * setPriority sets item's priority
	   * @precondition
	   * @postcondition 
	   * @param priority
	   */
	  public void setPriority(int priority) 
	  {
	    this.priority = priority;
	  } 
} 