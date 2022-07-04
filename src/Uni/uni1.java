package Uni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class uni1 extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public uni1 () {
        JFrame frame;
        JTextField textField;
        final int[] currentIndex = new int[ 1 ];
        Random randomGenerator;

        frame = new JFrame();
        frame.setBounds(100, 100, 400, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        String[][] source = {
                { "C:\\Users\\jump\\Downloads\\7enwj.png",
                        "C:\\Users\\jump\\Downloads\\95inb.png",
                        "C:\\Users\\jump\\Downloads\\cijJX.png",
                       // "d:/pictures/fs9md.png",
                        //"d:/pictures/ndtf9.png",
                       // "d:/pictures/Thpkh.png",
                        "C:\\Users\\jump\\Downloads\\tza3P.png" },
                { "7enwj",
                        "95inb",
                        "cijJX",
                       // "fs9md",
                        //"ndtf9",
                        //"Thpkh",
                        "tza3P" }
        };
        randomGenerator = new Random();
        currentIndex[ 0 ] = randomGenerator.nextInt(7);
        // Image
        JLabel lblNewLabel = new JLabel(new ImageIcon(source[0][ currentIndex[ 0 ] ]));
        lblNewLabel.setBounds(40, 40, 150, 40);
        frame.getContentPane().add(lblNewLabel);
// User input
        textField = new JTextField();
        textField.setFont(new Font ("Tahoma", Font.PLAIN, 20));
        textField.setBounds(40, 110, 150, 40);
        textField.setHorizontalAlignment(JTextField.CENTER);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
// Generate new image
        JButton btnNewImage = new JButton("New image");
        btnNewImage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentIndex[ 0 ] = randomGenerator.nextInt(7);
                lblNewLabel.setIcon(new ImageIcon(source[0][ currentIndex[ 0 ] ]));
            }
        });
        btnNewImage.setBounds(255, 45, 100, 30);
        frame.getContentPane().add(btnNewImage);
// Check user input
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(255, 115, 100, 30);
        frame.getContentPane().add(btnSubmit);


        setContentPane ( contentPane );
        setModal ( true );
        getRootPane ( ).setDefaultButton ( buttonOK );

        buttonOK.addActionListener ( new ActionListener ( ) {
            public void actionPerformed ( ActionEvent e ) {
                onOK ( );
            }
        } );

        buttonCancel.addActionListener ( new ActionListener ( ) {
            public void actionPerformed ( ActionEvent e ) {
                onCancel ( );
            }
        } );

        // call onCancel() when cross is clicked
        setDefaultCloseOperation ( DO_NOTHING_ON_CLOSE );
        addWindowListener ( new WindowAdapter ( ) {
            public void windowClosing ( WindowEvent e ) {
                onCancel ( );
            }
        } );

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction ( new ActionListener ( ) {
            public void actionPerformed ( ActionEvent e ) {
                onCancel ( );
            }
        } , KeyStroke.getKeyStroke ( KeyEvent.VK_ESCAPE , 0 ) , JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT );
    }

    private void onOK () {
        // add your code here
        dispose ( );
    }

    private void onCancel () {
        // add your code here if necessary
        dispose ( );
    }

    public static void main ( String[] args ) {
        uni1 dialog = new uni1 ( );
        dialog.pack ( );
        dialog.setVisible ( true );
        System.exit ( 0 );
    }
}
