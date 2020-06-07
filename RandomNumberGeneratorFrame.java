import javax.swing.*;
import java.awt.*;

public class RandomNumberGeneratorFrame extends JFrame {
    JPanel panel1;
    JPanel panel2;
    JLabel text;
    public JLabel randomNumberText;
    public JLabel nameText;
    public JButton generateButton;
    RandomNumberGeneratorFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        panel1 = new JPanel();
        GridLayout grid = new GridLayout(4, 1, 10, 10);
        panel1.setLayout(grid);
        this.add(panel1);
        text = new JLabel();
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setFont(new Font("Serif", Font.PLAIN, 24));
        text.setText("Random Name Generator");
        panel1.add(text);
        randomNumberText = new JLabel();
        randomNumberText.setHorizontalAlignment(SwingConstants.CENTER);
        randomNumberText.setFont(new Font("Serif", Font.PLAIN, 18));
        randomNumberText.setText("Number: Default");
        panel1.add(randomNumberText);
        nameText = new JLabel();
        nameText.setHorizontalAlignment(SwingConstants.CENTER);
        nameText.setFont(new Font("Serif", Font.PLAIN, 18));
        nameText.setText("Name: Default");
        panel1.add(nameText);
        panel2 = new JPanel();
        GridBagLayout gridBag = new GridBagLayout();
        panel2.setLayout(gridBag);
        panel1.add(panel2);
        generateButton = new JButton("Generate Person");
        panel2.add(generateButton);
    }
}