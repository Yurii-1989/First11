
package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

    public class Controller {
        @FXML
        private TextField XBox;
        @FXML
        private TextField ABox;
        @FXML
        private TextField BBox;
        @FXML
        private TextField ResultBox;
        @FXML
        private Button Result;
        @FXML
        private Button Exit;
        @FXML
        private Button Clear;
        @FXML
        private Stage primaryStage;

        @FXML
        public void onClickResult(){
            System.out.println("Button Clicked!");

String sstr;
double s=0;

            String xst = XBox.getText();
            String ast = ABox.getText();
            String bst = BBox.getText();
            double x = Double.parseDouble(xst);
            double a = Double.parseDouble(ast);
            double b = Double.parseDouble(bst);
if (x<=7&&a==0&&b==0){
    ResultBox.setText("Недопустимые значения");
}
else if (x<=7) {
    s=(x+4)/(Math.pow(a,2)+Math.pow(b,2));
    sstr=Double. toString(s);
    ResultBox.setText(sstr);
}
else {
    s=(x*(Math.pow(a+b,2)));
    sstr=Double. toString(s);
    ResultBox.setText(sstr);
}



        }
        @FXML
        public void ClearText(){
            System.out.println("Clear Clicked!");

            XBox.clear();
            ABox.clear();
            BBox.clear();
            ResultBox.clear();
        }
        @FXML
        public void onClickExit(){
            System.out.println("Exit Clicked!");
           Stage primaryStage = (Stage) Exit.getScene().getWindow();
            primaryStage.close();
        }
    }


