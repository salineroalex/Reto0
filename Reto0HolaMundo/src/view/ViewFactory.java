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
    public static View getView(String type) {
        switch (type) {
            case "1":
                return new TextViewImplementation();
            case "2":
                return new WindowViewImplementation();
               
        }
        return null;
    }
}
