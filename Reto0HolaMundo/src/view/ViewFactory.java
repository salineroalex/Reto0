/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


/**
 *
 * @author alexs
 */
public class ViewFactory {
    private static View view;
    public static View getView(String type) {
        switch (type) {
            case "1":
                view = new TextViewImplementation();
                break;
            case "2":
                view = new WindowViewImplementation();
                break;
        }
        return view;
    }
}
