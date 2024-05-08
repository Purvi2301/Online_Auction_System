import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
    private JPanel auctionPanel;
    private JButton CUSTOMERButton;
    private JButton ADMINButton;

    JFrame auctionF = new JFrame();
    public MainScreen(){

        auctionF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        auctionF.setContentPane(auctionPanel);
        auctionF.pack();
        auctionF.setVisible(true);

        CUSTOMERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Customer();
            }
        });
        ADMINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Admin();
            }
        });
    }
}

