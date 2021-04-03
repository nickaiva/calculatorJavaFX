 
    package shapes632020;

    import javafx.application.Application;
    import javafx.event.EventHandler;
    import javafx.scene.Group;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.ChoiceBox;
    import javafx.scene.control.TextField;
    import javafx.scene.input.MouseEvent;
    import javafx.stage.Stage;

    public class Calculator extends Application {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            launch(args);
        }

        @Override
        public void start(Stage stage) throws Exception {
            // TODO Auto-generated method stub

                    
            Button playButton = new Button("Play");
            playButton.setLayoutX(370);
            playButton.setLayoutY(50);
            
            
            ChoiceBox c = new ChoiceBox<>();
            c.getItems().addAll("+","-","*","/");
            c.setLayoutX(300);
            c.setLayoutY(50);
            
            TextField t1 = new TextField();
            TextField t2 = new TextField();
            TextField t3 = new TextField();
            
            t1.setLayoutX(100);
            t1.setLayoutY(50);
            
            t2.setLayoutX(400);
            t2.setLayoutY(50);
            
            t3.setLayoutX(600);
            t3.setLayoutY(50);
            
            playButton.setOnMouseClicked((new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    // TODO Auto-generated method stub
                    String s1,s2,s3,t;
                    double x,y,z;
                    s1= t1.getText();
                    s2= t2.getText();
                    s3= t3.getText();
                    
                    x = Double.parseDouble(s1);
                    y = Double.parseDouble(s2);
                    z = Double.parseDouble(s3);
                    
                    t = c.getSelectionModel().getSelectedItem().toString();
                    switch(t) {
                    case "+":
                        z = x + y;
                        s3=String.valueOf(z);
                        t3.setText(s3);
                        break;
                    case "-":
                        z = x - y;
                        s3=String.valueOf(z);
                        t3.setText(s3);
                        break;
                    case "*":
                        z = x * y;
                        s3=String.valueOf(z);
                        t3.setText(s3);
                        break;
                    case "/":
                        z = x / y;
                        s3=String.valueOf(z);
                        t3.setText(s3);
                       break;    
                    default:
                        
                    }
                    
                    
                }

            }));

                
            // Creating a Group object
            Group root = new Group(playButton,t1,t2,t3);

            // Creating a scene object
            Scene scene = new Scene(root, 600, 300);

            // Setting title to the Stage
            stage.setTitle("Translate transition example");

            // Adding scene to the stage
            stage.setScene(scene);

            // Displaying the contents of the stage
            stage.show();
        }

    }


