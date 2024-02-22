package ru.fafurin.lambda;

import java.util.Random;

public class ImageFilter {

    public static int[] grayScale(int[] rgb) {
        int average = (rgb[0] + rgb[1] + rgb[2]) / 3;
        rgb[0] = rgb[1] = rgb[2] = average;
        return rgb;
    }

    public static int[] noise(int[] rgb) {
        rgb[0] += new Random().nextFloat(80);
        rgb[1] += new Random().nextFloat(80);
        rgb[2] += new Random().nextFloat(80);
        if (rgb[0] > 255) rgb[0] = 255;
        if (rgb[1] > 255) rgb[1] = 255;
        if (rgb[2] > 255) rgb[2] = 255;
        return rgb;
    }

    public static int[] sepia(int[] rgb) {
        int average = (rgb[0] + rgb[1] + rgb[2]) / 3;
        int depth = 20;
        int intensity = 30;

        rgb[0] = average + (depth * 2);
        rgb[1] = average + depth;
        rgb[2] = average - intensity;

        if (rgb[0] > 255) rgb[0] = 255;
        if (rgb[1] > 255) rgb[1] = 255;
        if (rgb[2] > 255) rgb[2] = 255;
        if (rgb[2] < 0) rgb[2] = 0;
        return rgb;
    }
}
