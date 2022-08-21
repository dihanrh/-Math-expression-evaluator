/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 Dear Students,
 Hope your exams are going well. As part of the course, you have to prepare a small project and submit the report on it on the day of your lab exam. This project will help you prepare well for the upcoming final exam.
 Please see the instructions below about the project.
 In the report,
 The first cover page will have your information like name, id, section, course code etc.
 Then in the following pages you will add the project description (like what the project does)
 After that add some screenshots of the project
 Finally add the complete code of the project
 You have to spiral the report and submit it (hardcopy) on the day of your final exam.

 Build a JavaFX application that,
 • Will take one string as an input
 • The input string will have a mathematical expression like (2+3/5)
 • Your program will evaluate the expression and show the result as output.(for example:
 the output of the expression above will be 2.6)
 • The program must have a variable denoted by your name.
 • The program must take a special string as an input that will show your id when it is
 evaluated (example: input: id. Output: 2320212)
 • For each input your program will show outputs without crashing. That means it must
 handle the IOExceptions as well as other Exceptions.
 • Your program must follow the rules of precedence. (Bracket first, then division, and so
 on)


 */
package lab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Dihan
 */
public class Lab extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculationLab.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // FormulME fme = new FormulME();
        launch(args);
    }

}
