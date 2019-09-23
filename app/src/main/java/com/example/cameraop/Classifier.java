package com.example.cameraop;

public interface Classifier {

    String name();

    Classification recognize(final float[] pixels);
}
