package cop4331.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UICommand;
import javax.faces.component.UIForm;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;


import cop4331.model_classes.ListModel;


public class ControllerClass 
{
	// domain model related variables
	  private List<ListModel> ListModels;
	  private ListModel ListModel;

	  // JavaServerFaces related variables
	  private UIForm form;
	  private UIForm tableForm;
	  private UICommand addCommand;

	  //constructor
	  public ListModelController() 
	  {
	    ListModels = new ArrayList<ListModel>();
	    ListModels.add(new ListModel("Learn JFS", "Finish this article", 1));
	    ListModels.add(new ListModel("Stop drinking too much coffee", "Coffee is evil!", 3));
	  }

	  /**
	   * addNew method to add new item to list
	   * @precondition
	   * @postcondition
	   * @return
	   */
	  public String addNew() 
	  {
	    ListModel = new ListModel("", "", 3);
	    form.setRendered(true);
	    addCommand.setRendered(false);
	    return null;
	  }

	  /**
	   * save method to set data persistence in model
	   * @precondition
	   * @postcondition 
	   * @return
	   */
	  public String save() 
	  {
	    ListModels.add(ListModel);
	    form.setRendered(false);
	    addCommand.setRendered(true);
	    return null;
	  }

	  /**
	   * cancel method to set back changes
	   * @precondition
	   * @postcondition 
	   * @return null string
	   */
	  public String cancel() 
	  {
	    ListModel = null;
	    form.setRendered(false);
	    addCommand.setRendered(true);
	    return null;
	  }

	  /**
	   * delete method removes item from list
	   * @precondition
	   * @postcondition 
	   * @return null string
	   */
	  public String delete() 
	  {
	    ListModels.remove(ListModel);
	    return null;
	  }

	  /**
	   * displayTable method to draw item list
	   * @precondition
	   * @postcondition 
	   * @param event
	   */
	  public void displayTable(ActionEvent event) 
	  {
	    if (event.getComponent().getId().equalsIgnoreCase("hide")) {
	      tableForm.setRendered(false);
	    } else {
	      tableForm.setRendered(true);
	    }
	  }

	  /**
	   * getPriorities returns priority level for item
	   * @precondition
	   * @postcondition 
	   * @return
	   */
	  public List<SelectItem> getPriorities() 
	  {
	    List<SelectItem> list = new ArrayList<SelectItem>();
	    list.add(new SelectItem(1, "Urgent"));
	    list.add(new SelectItem(2, "Important"));
	    list.add(new SelectItem(3, "Low"));
	    return list;
	  }

	  /**
	   * getListModels returns actual List object??????????????????????
	   * @precondition
	   * @postcondition 
	   * @return list object
	   */
	  public List<ListModel> getListModels() 
	  {
	    return ListModels;
	  }

	  /**
	   * setListModels sets current list object?????????????????
	   * @precondition
	   * @postcondition 
	   * @param ListModels
	   */
	  public void setListModels(List<ListModel> ListModels) 
	  {
	    this.ListModels = ListModels;
	  }

	  /**
	   * getListModel returns list object 
	   * @precondition
	   * @postcondition 
	   * @return
	   */
	  public ListModel getListModel()
	  {
	    return ListModel;
	  }

	  /**
	   * setListModel sets current list object
	   * @precondition
	   * @postcondition 
	   * @param ListModel
	   */
	  public void setListModel(ListModel ListModel) 
	  {
	    this.ListModel = ListModel;
	  }

	  /**????????????????????????????????????????????????????
	   * @precondition
	   * @postcondition 
	   * @return
	   */
	  public UIForm getForm() 
	  {
	    return form;
	  }

	  /**
	   * @precondition
	   * @postcondition 
	   * @param form
	   */
	  public void setForm(UIForm form) 
	  {
	    this.form = form;
	  }

	  /**
	   * @precondition
	   * @postcondition 
	   * @return
	   */
	  public UICommand getAddCommand() 
	  {
	    return addCommand;
	  }

	  /**
	   * @precondition
	   * @postcondition 
	   * @param addCommand
	   */
	  public void setAddCommand(UICommand addCommand) 
	  {
	    this.addCommand = addCommand;
	  }

	  /**
	   * @precondition
	   * @postcondition 
	   * @return
	   */
	  public UIForm getTableForm()
	  {
	    return tableForm;
	  }

	  /**
	   * @precondition
	   * @postcondition 
	   * @param tableForm
	   */
	  public void setTableForm(UIForm tableForm) 
	  {
	    this.tableForm = tableForm;
	  }
 
}
