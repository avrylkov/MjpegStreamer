package com.home;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class SourceFile implements JpegImageSource {

    private final String imageFilePath;

    public SourceFile(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public byte[] getImage() {
        BufferedImage img;
        try {
            img = ImageIO.read(new File(imageFilePath));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "JPEG", baos);
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

}
