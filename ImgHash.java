/*
  ______ __  __          __  __ ________   _____   ___
 |  ____|  \/  |   /\   |  \/  |  ____\ \ / / _ \ / _ \
 | |__  | \  / |  /  \  | \  / | |__   \ V / (_) | (_) |
 |  __| | |\/| | / /\ \ | |\/| |  __|   > < \__, |> _ <
 | |____| |  | |/ ____ \| |  | | |____ / . \  / /| (_) |
 |______|_|  |_/_/    \_\_|  |_|______/_/ \_\/_/  \___/

Emanuel Estrada Larios - A01633605
*/

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.io.*;
import javax.imageio.*;
import java.net.*;

class ImgHash{

  public int imgKeyGen (File img) {

    BufferedImage originalImg = null;
    int pxAvobe = 0, pxBelow = 0;

    try {
      originalImg = ImageIO.read(img);

      Image thumbnail = originalImg.getScaledInstance(8, 8, Image.SCALE_SMOOTH);

      BufferedImage bufferedThumbnail = new BufferedImage(thumbnail.getWidth(null), thumbnail.getHeight(null), BufferedImage.TYPE_BYTE_GRAY);

      bufferedThumbnail.getGraphics().drawImage(thumbnail, 0, 0, null);
      ImageIO.write(bufferedThumbnail, "jpeg", new File("result.jpg"));

      int[] pixels = bufferedThumbnail.getRGB(0, 0, 8, 8, null, 0, 8);
      int colourAverage = 0;

      for (int i=0; i<pixels.length; i++) {
        colourAverage += pixels[i];
      }

      colourAverage = colourAverage / 64;
      // System.out.println(colourAverage);

      for (int i=0; i<pixels.length; i++) {
        if(pixels[i] <= colourAverage)
          pxBelow++;
        else
          pxAvobe++;
      }

      // System.out.println("Bellow: " + pxBelow);
      // System.out.println("Above: " + pxAvobe);

    }
    catch (IOException e) {  System.out.println("Error"); }

    return Integer.parseInt("" + pxBelow + pxAvobe) % 100;

  }

  public static void main(String[] args) {
    ImgHash ih = new ImgHash();
    System.out.println("Key Img1: " + ih.imgKeyGen(new File("img1.jpeg")));
    System.out.println("Key Img4: " + ih.imgKeyGen(new File("img4.jpeg")));
    System.out.println("Key Img5: " + ih.imgKeyGen(new File("img5.jpeg")));
    System.out.println("Key Img6: " + ih.imgKeyGen(new File("img6.jpeg")));

    System.out.println("Key vsi1: " + ih.imgKeyGen(new File("vsi1.jpeg")));
    System.out.println("Key vsi2: " + ih.imgKeyGen(new File("vsi2.jpeg")));
  }

}
