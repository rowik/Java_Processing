package processing;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageEditor {

public static BufferedImage editImage(BufferedImage image,int val){
for (int x = 0; x < image.getWidth(); x++) {
    for (int y = 0; y < image.getHeight(); y++) 
        {
        Color color = new Color(image.getRGB(x, y));

        int r, g, b;
        r = checkColorRange(color.getRed() + val);
        g = checkColorRange(color.getGreen() + val);
        b = checkColorRange(color.getBlue() + val);

        color = new Color(r, g, b);
        image.setRGB(x, y, color.getRGB());
        }
    }
	image.flush();
	return image;
}
private static int checkColorRange(int newColor){
    if(newColor > 255){
        newColor = 255;
    } else if (newColor < 0) {
        newColor = 0;
    }
    return newColor;
}
}