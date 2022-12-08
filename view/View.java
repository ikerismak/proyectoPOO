package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
// import javax.swing.JFileChooser;

import controller.Resize;

public class View extends JFrame {

    public JButton prev, next,  addImage, viewImages , imageLoaderButton;
    public static JLabel imagen, texto, test;
    public static ImageIcon icono;
    public JPanel panel1, panel2;
    // public JFileChooser imageLoader;

    Resize resize = new Resize();

    public View() {

        panel1 = new JPanel();
        panel1.setBackground(Color.lightGray);
        panel1.setBounds(10,50,1005,680);
        panel1.setVisible(true);

        panel2 = new JPanel();
        panel2.setBackground(Color.green);
        panel2.setBounds(10,50,1005,680);
        panel2.setVisible(false);

        addImage = new JButton("Add new image");
        addImage.setBounds(211, 1, 200, 50);

        viewImages = new JButton("View image");
        viewImages.setBounds(10, 1, 200, 50);


        config();

        loadPanelOneComponents();
        loadPanelTwoComponents();

        panel1.add(prev);
        panel1.add(imagen);
        panel1.add(next);
        panel1.add(texto);

        panel2.add(test);
        panel2.add(imageLoaderButton);

        add(panel1);
        add(panel2);
        add(viewImages);
        add(addImage);

    }

    private void loadPanelOneComponents(){

        imagen = new JLabel();

        imagen.setIcon(resize.resizeImage(new ImageIcon("imagen2.png")));
        imagen.setBounds(10, 20, 200, 200);

        texto = new JLabel("Texto de reporte");
        texto.setBounds(1, 1, 200, 1000);
        

        prev = new JButton("<");
        prev.setBounds(10, 369, 60, 30);

        next = new JButton(">");
        next.setBounds(1, 1, 60, 30);
        next.setBackground(Color.BLUE);





    }

    /**
     * 
     */
    private void loadPanelTwoComponents(){

        test = new JLabel("prueba");
        test.setBounds(50, 50, 300, 300);

        // imageLoader = new JFileChooser("cargar imagen");
        // imageLoader.setBounds(200,200,500,400);
      

        // FileNameExtensionFilter ImageFilter = new FileNameExtensionFilter("JPG,PNG, JPEG","JPG","PNG","JPEG");
        
        // imageLoader.setFileFilter(ImageFilter);



        imageLoaderButton = new JButton("cargar imagen");
        imageLoaderButton.setBounds(1,1,200,200);

    }

    private void config() {
        // Salir
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Titulo
        this.setTitle("Proyecto POO");

        // Tamano
        this.setSize(1024, 768);

        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(Color.white);

        this.setResizable(false);
        this.setEnabled(true);
        this.setLayout(null);
    }
}
