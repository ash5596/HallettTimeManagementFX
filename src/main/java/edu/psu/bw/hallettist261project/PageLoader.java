/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.bw.hallettist261project;

import java.io.FileNotFoundException;
import java.net.URL;
import javafx.scene.layout.Pane;

/**
 *
 * @author Andrew
 */
public class PageLoader {

    private Pane view;

    public Pane getScreen(String fileName) throws FileNotFoundException {

        try {
            URL fileUrl = TimeManagement.class.getResource("/TimeManagement/" + fileName + ".fxml");
            if (fileUrl == null) {
                throw new java.io.FileNotFoundException("THIS IS NOT A REAL FILE");
            }
            view = new PageLoader().load(fileUrl);

        } catch (FileNotFoundException e) {
            System.out.print("-----ERROR----- " + fileName + " -----ERROR-----");
        }
        return view;
    }

    private Pane load(URL fileUrl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
