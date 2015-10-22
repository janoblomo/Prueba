package javaapplication2;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Panel_Imagen extends javax.swing.JPanel{
    public Panel_Imagen(){    
        this.setSize(1440, 800);
        //setExtendedState( MAXIMIZED_BOTH )
    }
    
    @Override
    public void paint(Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/calculadora_grande.jpg"));        
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
        setOpaque(false);
        
    }
    
    
    
}
