import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;


class ImagePanel extends JPanel {

  private int numberStops;
  private String[] stopName;

  public ImagePanel(){
    super();

    this.setPreferredSize(new Dimension(500,300));
    this.setBackground(Color.WHITE);

    this.numberStops = 0;
    this.stopName = new String[12];
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(5));
    g2.setColor(new Color(255, 63, 149));
    g2.drawRoundRect(45, 60, 400, 200, 30, 30);

    switch (this.numberStops) {
      case 12:
        g2.fillOval(30,100,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[11],65,120);
        g2.setColor(new Color(255, 63, 149));
      case 11:
        g2.fillOval(30,180,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[10],65,200);
        g2.setColor(new Color(255, 63, 149));
      case 10:
        g2.fillOval(100,244,30,30); //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[9],100,235);
        g2.setColor(new Color(255, 63, 149));
      case 9:
        g2.fillOval(186,244,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[8],186,235);
        g2.setColor(new Color(255, 63, 149));
      case 8:
        g2.fillOval(273,244,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[7],273,235);
        g2.setColor(new Color(255, 63, 149));
      case 7:
        g2.fillOval(360,244,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[6],360,235);
        g2.setColor(new Color(255, 63, 149));
      case 6:
        g2.fillOval(430,180,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[5],400,200);
        g2.setColor(new Color(255, 63, 149));
      case 5:
        g2.fillOval(430,100,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[4],400,120);
        g2.setColor(new Color(255, 63, 149));
      case 4:
        g2.fillOval(360,45,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[3],360,100);
        g2.setColor(new Color(255, 63, 149));
      case 3:
        g2.fillOval(273,45,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[2],273,100);
        g2.setColor(new Color(255, 63, 149));
      case 2:
        g2.fillOval(186,45,30,30);  //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[1],186,100);
        g2.setColor(new Color(255, 63, 149));
      case 1:
        g2.fillOval(100,45,30,30); //x,-y,width,height
        g2.setColor(Color.BLACK);
        g2.drawString(this.stopName[0],100,100);
        g2.setColor(new Color(255, 63, 149));
    }

  }

  public void updateStops(int numberStops){
    this.numberStops = numberStops;
    this.repaint();
  }

  public void updateNames(int stopNumber, String stopName){
    this.stopName[stopNumber] = stopName;
    this.repaint();
  }

  public String getNames(int stopNumber){
    return this.stopName[stopNumber];
  }

}
