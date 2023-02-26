package com.home;

public interface JpegImageSource
{
    /**
     * Must be thread safe!
     * @return byte array of the jpeg image.
     */
    public byte[] getImage();
}