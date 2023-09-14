
package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    double num1,num2;
    int op;
    @Override
    public void start(Stage primaryStage) {

    TextField t =new TextField("   ");
    Button add =new Button("+"); 
    Button substract =new Button("-");
    Button mul =new Button("*");
    Button divide =new Button("/");
    Button d0 =new Button("0");
    Button d1 =new Button("1");
    Button d2 =new Button("2");
    Button d3 =new Button("3");
    Button d4 =new Button("4");
    Button d5 =new Button("5");
    Button d6 =new Button("6");
    Button d7 =new Button("7");
    Button d8 =new Button("8");
    Button d9 =new Button("9");
   Button equal =new Button("=");
    Button clear =new Button("C");
 
     HBox h= new HBox(10);   
     HBox h1= new HBox(10);
     HBox h2= new HBox(10);
     HBox h3= new HBox(10);
     HBox h4= new HBox(10);
     
     VBox v1= new VBox(5);
     h.getChildren().addAll( t);
     h1.getChildren().addAll( d1,d2,d3,add);
     h2.getChildren().addAll( d4,d5,d6,substract);
     h3.getChildren().addAll( d7,d8,d9,mul);
     h4.getChildren().addAll( d0,equal,clear,divide);
     v1.getChildren().addAll(h,h1,h2,h3,h4);

     v1.setPadding( new Insets( 10, 10, 10,10));

     
    d1.setOnAction(e->{
    t.setText(t.getText()+"1");
    });
    d2.setOnAction(e->{
    t.setText(t.getText()+"2");
    });
    d3.setOnAction(e->{
    t.setText(t.getText()+"3");
    });
    d4.setOnAction(e->{
    t.setText(t.getText()+"4");
    });
    d5.setOnAction(e->{
    t.setText(t.getText()+"5");
    });      
    d6.setOnAction(e->{
    t.setText(t.getText()+"6");
    });
    d7.setOnAction(e->{
    t.setText(t.getText()+"7");
    }); 
    d8.setOnAction(e->{
    t.setText(t.getText()+"8");
    }); 
    d9.setOnAction(e->{
    t.setText(t.getText()+"9");
    }); 
    d0.setOnAction(e->{
    t.setText(t.getText()+"0");
    }); 
    add.setOnAction(e->{
        String string = t.getText();
    num1= Double.parseDouble(string);
     op=1;
     t.setText(" ");
    }); 
    substract.setOnAction(e->{
        String string = t.getText();
    num1= Double.parseDouble(string);
     op=2;
     t.setText(" ");
    });
    mul.setOnAction(e->{
     String string = t.getText();
    num1= Double.parseDouble(string);
     op=3;
     t.setText(" ");
    }); 
    divide.setOnAction(e->{
      String string = t.getText();
    num1= Double.parseDouble(string);
     op=4;
     t.setText(" ");
    }); 
    clear.setOnAction(e->{
     t.setText(" ");
    }); 
    equal.setOnAction(e->{
        switch (op) {
            case 1:
                {
                    String string = t.getText();
                    num2= Double.parseDouble(string);
                    t.setText(String.valueOf(num1+num2));
                    break;
                }
            case 2:
                {
                    String string = t.getText();
                    num2= Double.parseDouble(string);
                    t.setText(String.valueOf(num1-num2));
                    break;
                }
            case 3:
                {
                    String string = t.getText();
                    num2= Double.parseDouble(string);
                    t.setText(String.valueOf(num1*num2));
                    break;
                }
            case 4:
                {
                    String string = t.getText();
                    num2= Double.parseDouble(string);
                    t.setText(String.valueOf(num1/num2));
                    break;
                }
            default:
                break;
        }
    }); 
      Scene scene = new Scene(v1, 300, 250);  
        primaryStage.setTitle("calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
