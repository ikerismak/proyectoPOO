package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import controller.Resize;

public class View extends JFrame {

    public JButton prev, next;
    public static JLabel imagen;
    public static ImageIcon icono;

    Resize resize = new Resize();

    public View() {

        config();
        prev = new JButton("<");
        prev.setBounds(10, 135, 60, 30);

        imagen = new JLabel();

        imagen.setIcon(resize.resizeImage(new ImageIcon("imagen2.png")));

        imagen.setBounds(80, 50, 200, 200);

        next = new JButton(">");
        next.setBounds(290, 135, 60, 30);

        add(prev);
        add(imagen);
        add(next);

    }

    private void config() {
        // Salir
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Titulo
        this.setTitle("Proyecto POO");

        // Tamano
        this.setSize(360, 300);

        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(Color.white);

        this.setResizable(false);
        this.setEnabled(true);
        this.setLayout(null);
    }
}
