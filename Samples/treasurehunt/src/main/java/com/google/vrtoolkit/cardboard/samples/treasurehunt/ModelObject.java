package com.google.vrtoolkit.cardboard.samples.treasurehunt;

import com.google.vrtoolkit.cardboard.audio.CardboardAudioEngine;

import java.nio.FloatBuffer;

/**
 * Created by Quentin on 21/05/2016.
 */
public abstract class ModelObject {

    public static final float YAW_LIMIT = 0.12f;
    public static final float PITCH_LIMIT = 0.12f;

    public static final int COORDS_PER_VERTEX = 3;

    public FloatBuffer vertices;
    public FloatBuffer colors;
    public FloatBuffer normals;

    public int program;

    public int positionParam;
    public int normalParam;
    public int colorParam;
    public int modelParam;
    public int modelViewParam;
    public int modelViewProjectionParam;
    public int lightPosParam;

    public float[] model;

    /**
     * Constructor.
     */
    public ModelObject(){
        model = new float[16];
    }

    /**
     * Initializes the model coords.
     */
    public abstract void make();

    /**
     * Initializes the model program.
     */
    public abstract void program(int vertexShader, int passthroughShader);

    /**
     * Updates the model position.
     */
    public abstract void updateModelPosition(float[] modelPosition, int soundId, CardboardAudioEngine cardboardAudioEngine);

    /**
     * Draws the model.
     */
    public abstract void draw(float[] lightPosInEyeSpace, float[] modelView, float[] modelViewProjection, float[] headView);

    /**
     * Check if user is looking at object by calculating where the object is in eye-space.
     *
     * @return true if the user is looking at the object.
     */
    public abstract boolean isLookingAtObject(float[] modelView, float[] headView);
}
