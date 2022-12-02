package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;


public class View extends JFrame{

    public JButton prev, next;
    public static JLabel imagen;
    public static ImageIcon icono;


    public View(){

        config();
        prev = new JButton("<");
        prev.setBounds(10, 135, 60, 30);


        imagen = new JLabel();
        icono = new ImageIcon("imagen1.png");

        Image imagenIcono = icono.getImage();

        Image imagenModificada = imagenIcono.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        icono = new ImageIcon(imagenModificada);


        imagen.setIcon(icono);
        imagen.setBounds(80, 50, 200, 200);

        next = new JButton(">");
        next.setBounds(290, 135, 60, 30);

        add(prev);
        add(imagen);
        add(next);

    }

    private void config(){
        //Salir
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Titulo
        this.setTitle("Proyecto POO");

        //Tamano
        this.setSize(360, 300);

        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(Color.white);

        this.setResizable(false);
        this.setEnabled(true);
        this.setLayout(null); 
    }
}
