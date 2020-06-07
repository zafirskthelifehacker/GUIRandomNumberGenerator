import java.util.*;
import java.awt.event.*;

import javax.swing.JFrame;
public class RandomNumberGenerator {
    private static RandomNumberGeneratorFrame randomNumberGeneratorFrame;
    public static void main(String[] args) {
        randomNumberGeneratorFrame = new RandomNumberGeneratorFrame();
        randomNumberGeneratorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        randomNumberGeneratorFrame.setSize(350, 350);
        randomNumberGeneratorFrame.setVisible(true);
        randomNumberGeneratorFrame.generateButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                generatePerson(); 
            }  
        }); 
    }
    public static void generatePerson() {
        Random random = new Random();
        int min  = 1;
        int max = 7;
        int number = random.nextInt(max - min + 1) + min;
        System.out.println(number);
        if(number == 1) {
            randomNumberGeneratorFrame.randomNumberText.setText("Number: 1");
            randomNumberGeneratorFrame.nameText.setText("Name: Faizan");
            System.out.println("Faizan");
        } else if(number == 2){
            randomNumberGeneratorFrame.randomNumberText.setText("Number: 2");
            randomNumberGeneratorFrame.nameText.setText("Name: Rouwaida");
            System.out.println("Rouwaida");
        } else if(number == 3){
            randomNumberGeneratorFrame.randomNumberText.setText("Number: 3");
            randomNumberGeneratorFrame.nameText.setText("Name: Nabiil");
            System.out.println("Nabiil");
        } else if(number == 4){
            randomNumberGeneratorFrame.randomNumberText.setText("Number: 4");
            randomNumberGeneratorFrame.nameText.setText("Name: Shaista");
            System.out.println("Shaista");
        } else if(number == 5){
            randomNumberGeneratorFrame.randomNumberText.setText("Number: 5");
            randomNumberGeneratorFrame.nameText.setText("Name: Kauthar");
            System.out.println("Kauthar");
        } else if(number == 6){
            randomNumberGeneratorFrame.randomNumberText.setText("Number: 6");
            randomNumberGeneratorFrame.nameText.setText("Name: Ismail");
            System.out.println("Ismail");
        } else {
            randomNumberGeneratorFrame.randomNumberText.setText("Number: 7");
            randomNumberGeneratorFrame.nameText.setText("Name: Zafir");
            System.out.println("Zafir");
        }
    }
}