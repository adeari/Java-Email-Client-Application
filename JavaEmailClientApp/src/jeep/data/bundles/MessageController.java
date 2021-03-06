package jeep.data.bundles;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class gives an easy access to the MessagesBundles.
 * 
 * @author Natacha Gabbamonte 0932340
 * 
 */
public class MessageController {

	ResourceBundle messages = null;

	/**
	 * Constructor that accepts the Locale of the app.
	 * 
	 * @param locale
	 *            The locale.
	 */
	public MessageController(Locale locale) {
		messages = ResourceBundle.getBundle("MessagesBundle", locale);
	}

	/**
	 * Returns the String associated with the name.
	 * 
	 * @param name
	 *            The name of the element.
	 * @return The string.
	 */
	public String getString(String name) {
		return messages.getString(name);
	}
}
