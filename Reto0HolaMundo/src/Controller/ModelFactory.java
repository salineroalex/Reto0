package Controller;


/**
 *
 * @author alexs, iratig
 */
public class ModelFactory {

    /**
     * Instances the model.
     *
     * @return returns the file implementation.
     */
    public static Model getModel() {

        return new FileModelImplementation();

    }
}
