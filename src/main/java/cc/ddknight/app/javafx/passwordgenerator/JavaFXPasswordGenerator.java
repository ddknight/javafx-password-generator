package cc.ddknight.app.javafx.passwordgenerator;

import cc.ddknight.app.javafx.passwordgenerator.string.StringResource;
import cc.ddknight.app.javafx.passwordgenerator.utils.Password;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * <p>
 * 
 * </p>
 * <font size=0.25>Copyright (C) 2016 Ouyeel. All Rights Reserved.</font>
 * @author Chao.CHEN (Create on:2016年11月18日)
 * @version 1.0
 * @fileName JavaFXPasswordGenerator.java
 */
public class JavaFXPasswordGenerator extends Application {

    private static final String TITLE = StringResource.PRI_STAGE_TITLE + "    Designed By:" + StringResource.AUTH + "    V" + StringResource.VERSION_MAX + "." + StringResource.VERSION_MID + "." + StringResource.VERSION_MIN;

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        //设置布局
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));
        //增加一个现实密码的Label
        Label label = new Label(StringResource.PASSWORD_MESSAGE + Password.genRandomNum(8));
        label.setFont(new Font(52));
        grid.add(label, 0, 1);
        //增加一个刷新按钮
        Button button = new Button();
        button.setText(StringResource.BTN_PASSWORD_REFRESH);
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                String newPassword = Password.genRandomNum(8);
                System.out.println("刷新随机密码：" + newPassword);
                label.setText(StringResource.PASSWORD_MESSAGE + newPassword);
                //                primaryStage.centerOnScreen();
            }
        });
        grid.add(button, 1, 1);
        Scene scene = new Scene(grid, 600, 100);
        //        Scene scene = new Scene(primaryStage);
        primaryStage.setScene(scene);
        primaryStage.setTitle(TITLE);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
