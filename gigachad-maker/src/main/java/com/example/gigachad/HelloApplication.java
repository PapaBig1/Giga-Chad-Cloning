package com.example.gigachad;

/*


Programmed by yours truly, Zachary Post
10/13/2022


 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import java.io.*;
import java.text.MessageFormat;

public class HelloApplication extends Application {
    private Spinner amount;
    public int times;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Giga Spammer");
        GridPane grid = new GridPane();
        VBox appContainer = new VBox(10);
        //appContainer.setPrefWidth(300);
        appContainer.setSpacing(20);
        appContainer.setPadding(new Insets(15,15,15,15));
        //pricetxt = new TextField();
        //grid.add(pricetxt, 1, 6);
        grid.add(new Label("Enter amount of Gigachads you wish for."),0,0);
        amount = new Spinner(1,500,1);
        grid.add(amount,0,1);
        Button submit = new Button("submit request");
        grid.add(submit,0,2);
        grid.add(new Label("(summoned gigachads are born in the gigachads folder)"),0,3);




        submit.setOnAction(event -> {
            try {
                submit();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        grid.setPadding(new Insets(10, 10, 0, 10));
        Scene scene = new Scene(grid, 225, 250);
        stage.setScene(scene);
        stage.show();
    }

    public void submit () throws IOException {
        int times = (int) amount.getValue();
        //System.out.println(times);

        //amount.getText();
        //int x = 5;
        // int name = 0;
        // System.out.println(times);
        for(int y = 0; y < times; y++) {
            String namez = MessageFormat.format("gigachad{0}.png", y);;
            //System.out.println(namez);


            //RANDOM
            Random rand = new Random();
            List<String> givenList = Arrays.asList("gigachad1.png",
                    "gigachad2.png",
                    "gigachad3.png",
                    "gigachad4.png",
                    "gigachad5.png",
                    "gigachad6.png",
                    "gigachad7.png",
                    "gigachad8.png",
                    "gigachad9.png",
                    "gigachad10.png",
                    "gigachad11.png",
                    "gigachad12.png",
                    "gigachad13.png",
                    "gigachad14.png",
                    "gigachad15.png",
                    "gigachad16.png",
                    "gigachad17.png",
                    "gigachad18.png");
            int randomIndex = rand.nextInt(givenList.size());
            String gigachoice = givenList.get(randomIndex);



            BufferedImage image = ImageIO.read(new File("GigaDNA/"+gigachoice));
            DataOutputStream file = new DataOutputStream((new BufferedOutputStream(new FileOutputStream("gigachads/"+namez))));
            ImageIO.write(image, "png", new File("gigachads/"+namez));

        }
        // System.out.println("done!");
        //System.out.println(image);
        System.exit(123);


    }



    public static void main(String[] args) throws IOException {
        launch();
    }
}