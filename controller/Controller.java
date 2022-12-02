package controller;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.event.MouseInputListener;

import view.View;

public class Controller implements MouseInputListener {

    private View view;

    private int contador = 0;

    public Controller(View view) {
        this.view = view;
        view.setVisible(true);

        listeners();
    }

    private void listeners() {
        view.next.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == view.next) {

            if (contador >= 2) {
                contador = 0;
            } else {
                contador++;
            }
            System.out.println(contador);
        }

        if (e.getSource() == view.prev) {

            if (contador <= 0) {
                contador = 2;
            } else {
                contador--;
            }
            System.out.println(contador);
        }

        view.icono = new ImageIcon("imagen"+contador+".png");
        view.imagen.setIcon(view.icono);

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
