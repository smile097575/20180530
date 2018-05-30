import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MFrame extends JFrame {
    Container cp ;
    private JLabel jlb = new JLabel("輸入框");
    private JTextField jtf = new JTextField();
    private JButton jbn = new JButton("加密");
    private JButton jbn2 = new JButton("解密");
    private JButton jbn3 = new JButton("EXIT");
    private JTextArea jta = new JTextArea();
    private JTextArea jta2 = new JTextArea();
    private String str;
    private JPanel jpnC = new JPanel(new GridLayout(5,1,3,3));
    private JPanel jpnR = new JPanel(new GridLayout(1,1,3,3));
    private JPanel jpnL = new JPanel(new GridLayout(1,1,3,3));

    public MFrame(){
        Ex1();
    }
    private void Ex1(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(300, 300,700,600 );
        cp=getContentPane();
        cp.add(jpnC,BorderLayout.CENTER);
        cp.add(jpnR,BorderLayout.WEST);
        cp.add(jpnL,BorderLayout.EAST);
        jpnC.add(jlb);
        jpnC.add(jtf);
        jpnC.add(jbn);
        jpnC.add(jbn2);
        jpnC.add(jbn3);
        jpnR.add(jta);
        jpnL.add(jta2);

        jpnR.setPreferredSize(new Dimension(300,400));
        jpnL.setPreferredSize(new Dimension(300,400));

        jbn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                str = Integer.parseInt(jta.getText());
            }
        });

        jbn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



    }
}
