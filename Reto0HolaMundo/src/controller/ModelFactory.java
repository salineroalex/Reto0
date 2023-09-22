package controller;

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
    private static Model model;

    public static Model getModel(String type) {
        switch (type) {
            case "1":
                model = new FileModelImplementation();
                break;
            case "2":
                model = new DBModelImplementation();
                break;
        }
        return model;
    }
}
