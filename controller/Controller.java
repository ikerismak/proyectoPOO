package controller;

import java.util.ArrayList;
import java.util.List;

import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.event.MouseInputListener;

import view.View;

public class Controller implements MouseInputListener{

    private View view;

    private int contador = 0;
    private Resize resize = new Resize();
    private List<String> imagenesMostrar = new ArrayList<String>();

    public Controller(View view) {
        this.view = view;
        view.setVisible(true);
        listeners();

        String folderPath = ".";
        File folder = new File(folderPath);

        File[] files = folder.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                String[] extension = (file.getName()).split("\\.");
                if (extension[1].equals("png")) {
                    for (File file2 : files) {
                        if (file2.isFile()) {
                            String[] extension2 = (file2.getName()).split("\\.");
                            if (extension2[1].equals("txt") && extension[0].equals(extension2[0])) {
                                imagenesMostrar.add(extension[0]);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(imagenesMostrar);
  
    }

    /**
     * 
     */
    private void listeners() {

        view.next.addMouseListener(this);
        view.prev.addMouseListener(this);
        view.addImage.addMouseListener(this);
        view.viewImages.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == view.next) {

            if (contador >= imagenesMostrar.size() - 1) {
                contador = 0;
            } else {
                contador++;
            }
        }

        if (e.getSource() == view.prev) {
            if (contador <= 0) {
                contador = imagenesMostrar.size() - 1;
            } else {
                contador--;
            }
        }

        System.out.println(contador);

        View.imagen.setIcon(resize.resizeImage(new ImageIcon( imagenesMostrar.get(contador) + ".png")));

        if(e.getSource() == view.addImage){

            view.panel1.setVisible(false);
            view.panel2.setVisible(true);

        }

        if(e.getSource() == view.viewImages){

            view.panel1.setVisible(true);
            view.panel2.setVisible(false);

        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
