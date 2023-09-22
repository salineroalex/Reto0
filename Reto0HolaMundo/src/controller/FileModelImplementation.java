package controller;
import java.util.ResourceBundle;

/**
 *
 * @author alexs, iratig
 */


public class FileModelImplementation implements Model {
    private ResourceBundle configFile;
    
    /**
     * Calls for message string form config file.
     * @return      returns the string found in the config file.
     */
    @Override
    public String getGreeting() {
        configFile = ResourceBundle.getBundle("controller.Config");
        return configFile.getString("MESSAGE");
        
        /*Single line:
        return ResourceBundle.getBundle("Controller.Config").getString("MESSAGE");
        */
    }
    
}
