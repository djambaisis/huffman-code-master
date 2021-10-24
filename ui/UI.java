/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ppitbull
 */
public class UI extends JFrame
{
    JPanel graphZone,dictZone,encDecZone,infosZone,centerZone,bottomZone; 
    JButton encBtn,decBtn;
    JLabel msgEncodedLabel,msgDecodedLabel;
    JTextField inputTextToEncode,inputTextToDecode;
    
    UI()
    {
        Toolkit toultik=getToolkit();
        this.setSize(toultik.getScreenSize());
        this.setTitle("Huffman algorithm");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inputTextToDecode=new JTextField();
        decBtn=new JButton("Decrypt");
        
        inputTextToEncode=new JTextField();        
        encBtn=new JButton("Encrypt");
        
        graphZone=new JPanel();
        dictZone=new JPanel();
        encDecZone=new JPanel();
        encDecZone.setLayout(new GridLayout(3,3));
        encDecZone.add(new JLabel("Enter Text to Encrypted"));
        encDecZone.add(inputTextToDecode);
        encDecZone.add(decBtn);
        encDecZone.add(new JLabel("Enter Text to Decrypt"));
        
        
        
        infosZone=new JPanel();
        
        centerZone=new TreeUI();
        centerZone.setLayout(new BorderLayout());
        centerZone.add(graphZone,BorderLayout.CENTER);
        centerZone.add(dictZone,BorderLayout.EAST);
        
        bottomZone=new JPanel();
        bottomZone.setLayout(new BorderLayout());
        bottomZone.add(encDecZone,BorderLayout.WEST);
        bottomZone.add(infosZone,BorderLayout.EAST);
        
        //main layout
        this.setLayout(new BorderLayout());
        //top Layout
        this.getContentPane().add(centerZone,BorderLayout.CENTER);
        this.getContentPane().add(bottomZone,BorderLayout.SOUTH);
        
    }
}

