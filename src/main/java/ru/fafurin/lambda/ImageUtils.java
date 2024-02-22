package ru.fafurin.lambda;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {

    public static BufferedImage getImage(String path) {
        BufferedImage image;
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return image;
    }

    public static void saveImage(BufferedImage image, String path) {
        try {
            ImageIO.write(image, "jpg", new File(path));
            System.out.printf("Image %s saved\n", path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int[] rgbPixelToArr(int pixel) {
        Color color = new Color(pixel);
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        int[] colorComponents = new int[3];
        colorComponents[0] = red;
        colorComponents[1] = green;
        colorComponents[2] = blue;

        return colorComponents;
    }

    public static int arrToRgbPixel(int[] colorComponents) {
        Color color;
        color = new Color(colorComponents[0], colorComponents[1], colorComponents[2]);
        return color.getRGB();
    }
}
