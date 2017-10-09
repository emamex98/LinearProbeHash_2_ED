import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

import java.io.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.net.*;
import java.awt.Graphics;

class ImagePanel extends JPanel {

  private BufferedImage inputImg;

  public ImagePanel(){
    super();

    this.setPreferredSize(new Dimension(500,300));
    //this.setBackground(Color.WHI);

    this.inputImg = null;
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;

    if(this.inputImg != null)
      g2.drawImage(this.inputImg,5,5,240,290,null);

  }

  public void updatePanel(File img){
    try{
      this.inputImg = ImageIO.read(img);
      this.repaint();
    }
    catch (IOException e) {  System.out.println("Error"); }
  }

}
