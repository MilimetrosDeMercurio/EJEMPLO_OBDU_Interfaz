/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author UCA
 */
public class Gui extends JFrame {
    
    private JButton boton1;
    private JTextField caja1;
    private JLabel label;
    private Container container;

    public Gui() {
        super("Titulo de la ventana");
        initComponents();
    }
    
    public void initComponents()
    {
        setSize(600,600); // tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        container = getContentPane();
        
        boton1 = new JButton("Click");
        boton1.setBounds(10,10,130, 30);
        
        caja1 = new JTextField();
        caja1.setBounds(10,50,130,30);
        
        label = new JLabel("soy un label");
        label.setBounds(10,90,130,30);
        
        container.add(boton1);
        container.add(caja1);
        container.add(label);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //JOptionPane.showMessageDialog(null, "Hola mundo");
                String contenido = caja1.getText();
                label.setText(contenido);
            }
        });
        
        
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new Gui().setVisible(true);
            }
        });
    }
}
