package ru.fafurin.lambda;

import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        BufferedImage image = ImageUtils.getImage("images/image.jpg");
        RgbMaster master = new RgbMaster(image);

        master.changeImage(ImageFilter::sepia);
        ImageUtils.saveImage(master.getImage(), "images/sepiaImage.jpg");

        master.changeImage(ImageFilter::grayScale);
        ImageUtils.saveImage(master.getImage(), "images/grayScaleImage.jpg");

        master.changeImage(ImageFilter::noise);
        ImageUtils.saveImage(master.getImage(), "images/noiseImage.jpg");
    }
}
