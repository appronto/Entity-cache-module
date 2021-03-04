// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import communitycommons.Misc;

/**
 * Takes the top n items of a given list and returns the resulting list.
 */
public class ListTop extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.util.List<IMendixObject> ObjectList;
	private java.lang.Long Top;

	public ListTop(IContext context, java.util.List<IMendixObject> ObjectList, java.lang.Long Top)
	{
		super(context);
		this.ObjectList = ObjectList;
		this.Top = Top;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Misc.listTop(ObjectList, Top.intValue());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ListTop";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}