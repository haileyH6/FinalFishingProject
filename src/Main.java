import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        JFrame frame = new JFrame();
        frame.setSize(700, 700);

        JPanel panel = new JPanel();
       panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(10, 102, 184));

        JLabel label = new JLabel("Welcom to Freddys Fishing Exchange! Catch the biggest fish!");
        JButton button = new JButton("Play");
        button.setBackground(new Color(11, 130, 184));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Fishing...");
            }
        });

        ImageIcon icon = new ImageIcon("src/workingBoat.png");
        icon.setImage(icon.getImage().getScaledInstance(80, 70, Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);

        JPanel spot = new JPanel();
        spot.setBackground(new Color(10, 102, 184));
        spot.add(picLabel);
        ////////////////////////////////////////////

        ImageIcon fish = new ImageIcon("src/fishie1.png");
        fish.setImage(fish.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton pictLabel = new JButton(fish);
pictLabel.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {pictLabel.setText("This fish weighs 52 pounds!");
    }
});
        JPanel boom = new JPanel();
        boom.setBackground(new Color(10,102,184));
        boom.add(pictLabel);
        pictLabel.setVisible(true);

        ///////////////////////////////////////////

        ImageIcon fish2 = new ImageIcon("src/fish2.png");
        fish2.setImage(fish2.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton dosLabel = new JButton(fish2);
        dosLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {dosLabel.setText("This fish weighs 73 pounds!");
            }
        });

        JPanel wow = new JPanel();
        wow.setBackground(new Color(10,102,184));
        wow.add(dosLabel);
        dosLabel.setVisible(true);

/////////////////////////////////////////////

        ImageIcon fish3 = new ImageIcon("src/fish3.png");
        fish3.setImage(fish3.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton tresLabel = new JButton(fish3);
        tresLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {tresLabel.setText("This fish weighs 105 pounds!!!");
            }
        });

        JPanel zam = new JPanel();
        zam.setBackground(new Color(10,102,184));
        zam.add(tresLabel);
        tresLabel.setVisible(true);

/////////////////////////////////////////////

        ImageIcon fish4 = new ImageIcon("src/fish4.png");
        fish4.setImage(fish4.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton cuatroLabel = new JButton(fish4);
        cuatroLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {cuatroLabel.setText("This fish weighs 33 pounds!");
            }
        });

        JPanel wam = new JPanel();
        wam.setBackground(new Color(10,102,184));
        wam.add(cuatroLabel);
        cuatroLabel.setVisible(true);

        ////////////////////////////////////

        ImageIcon fish5 = new ImageIcon("src/fish5.png");
        fish5.setImage(fish5.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton cincoLabel = new JButton(fish5);
        cincoLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {cincoLabel.setText("This fish weighs 73 pounds!");
            }
        });

        JPanel fisher = new JPanel();
        fisher.setBackground(new Color(10,102,184));
        fisher.add(cincoLabel);
        cincoLabel.setVisible(true);

        ////////////////////////////////////

        ImageIcon fish6 = new ImageIcon("src/fish6.png");
        fish6.setImage(fish6.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton seisLabel = new JButton(fish6);
        seisLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {seisLabel.setText("This fish weighs 95 pounds!");
            }
        });

        JPanel fishist = new JPanel();
        fishist.setBackground(new Color(10,102,184));
        fishist.add(seisLabel);
        seisLabel.setVisible(true);

        ////////////////////////////////////

        ImageIcon fish7 = new ImageIcon("src/fish7.png");
        fish7.setImage(fish7.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton sieteLabel = new JButton(fish7);
        sieteLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {sieteLabel.setText("This fish weighs 15 pounds!");
            }
        });

        JPanel pow = new JPanel();
        pow.setBackground(new Color(10,102,184));
        pow.add(sieteLabel);
        sieteLabel.setVisible(true);

        ////////////////////////////////////


        ImageIcon fish8 = new ImageIcon("src/fish8.png");
        fish8.setImage(fish8.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton ochoLabel = new JButton(fish8);
        ochoLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {ochoLabel.setText("This fish weighs 24 pounds!");
            }
        });

        JPanel power = new JPanel();
        power.setBackground(new Color(10,102,184));
        power.add(ochoLabel);
        ochoLabel.setVisible(true);

        ////////////////////////////////////


        ImageIcon fish9 = new ImageIcon("src/fish9.png");
        fish9.setImage(fish9.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton nueveLabel = new JButton(fish9);
        nueveLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {nueveLabel.setText("This fish weighs 56 pounds!");
            }
        });

        JPanel kazow = new JPanel();
        kazow.setBackground(new Color(10,102,184));
        kazow.add(nueveLabel);
        nueveLabel.setVisible(true);

        ////////////////////////////////////

        ImageIcon fish10 = new ImageIcon("src/fish10.png");
        fish10.setImage(fish10.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton diezLabel = new JButton(fish10);
        diezLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {diezLabel.setText("This fish weighs 56 pounds!");
            }
        });

        JPanel crash = new JPanel();
        crash.setBackground(new Color(10,102,184));
        crash.add(diezLabel);
        diezLabel.setVisible(true);

        ////////////////////////////////////

        ImageIcon shark = new ImageIcon("src/shark.png");
        shark.setImage(shark.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton sharkieLabel = new JButton(shark);
        sharkieLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {sharkieLabel.setText("The shark bit your boat!");
            }
        });

        JPanel slam = new JPanel();
        slam.setBackground(new Color(10,102,184));
        slam.add(sharkieLabel);
        sharkieLabel.setVisible(true);

        ////////////////////////////////////
        ImageIcon star = new ImageIcon("src/starFish.png");
        star.setImage(star.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton starieLabel = new JButton(star);
        starieLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {starieLabel.setText("You caught a rare starfish!");
            }
        });

        JPanel stash = new JPanel();
        stash.setBackground(new Color(10,102,184));
        stash.add(starieLabel);
        starieLabel.setVisible(true);

        ////////////////////////////////////

        ImageIcon log = new ImageIcon("src/log.png");
        log.setImage(log.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
        JButton logLabel = new JButton(log);
        logLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {logLabel.setText("Your hook broke!");
            }
        });

        JPanel loggie = new JPanel();
        loggie.setBackground(new Color(10,102,184));
        loggie.add(logLabel);
        logLabel.setVisible(true);

/////// Grid layout change

        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 1;
        gc.gridy = 1;
        panel.add(label,gc);

        gc.gridx = 1;
        gc.gridy = 2;
        panel.add(button,gc);

        gc.gridx = 2;
        gc.gridy = 5;
        panel.add(spot,gc);

        gc.gridx = 1;
        gc.gridy = 8;
        panel.add(boom,gc);

        gc.gridx = 1;
        gc.gridy = 6;
        panel.add(wow,gc);

        gc.gridx = 2;
        gc.gridy = 10;
        panel.add(zam,gc);

        gc.gridx = 2;
        gc.gridy = 3;
        panel.add(wam,gc);

        gc.gridx = 2;
        gc.gridy = 7;
        panel.add(loggie,gc);

        gc.gridx = 4;
        gc.gridy = 8;
        panel.add(fisher,gc);

        gc.gridx = 4;
        gc.gridy = 5;
        panel.add(fishist,gc);

        gc.gridx = 3;
        gc.gridy = 9;
        panel.add(pow,gc);

        gc.gridx = 3;
        gc.gridy = 3;
        panel.add(power,gc);

        gc.gridx = 1;
       gc.gridy = 3;
       panel.add(kazow,gc);

        gc.gridx = 2;
        gc.gridy = 4;
        panel.add(crash,gc);

        gc.gridx = 4;
        gc.gridy = 6;
        panel.add(slam,gc);

        gc.gridx = 5;
        gc.gridy =8;
        panel.add(stash,gc);


    ///    panel.add(label, BorderLayout.PAGE_START);
        //panel.add(check, BorderLayout.);
    ///    panel.add(button);
       /// panel.add(spot);
    ///    panel.add(boom);
    ///    panel.add(wow);
     ///   panel.add(zam);
   ///     panel.add(wam);
    ///    panel.add(loggie);

        frame.add(panel);
frame.setVisible(true);
    }
}