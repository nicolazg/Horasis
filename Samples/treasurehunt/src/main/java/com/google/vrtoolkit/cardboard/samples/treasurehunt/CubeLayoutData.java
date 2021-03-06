package com.google.vrtoolkit.cardboard.samples.treasurehunt;

/**
 * Created by Quentin on 14/05/2016.
 */
public class CubeLayoutData {

    public static final float[] CUBE_COORDS = new float[] {

            //6 points par face
            //--> 2 triangles par face (2 points communs)
            //x,y,z

            // Front face
            -2.0f, 0.2f, 1.0f,
            -2.0f, -0.2f, 1.0f,
            2.0f, 0.2f, 1.0f,
            -2.0f, -0.2f, 1.0f,
            2.0f, -0.2f, 1.0f,
            2.0f, 0.2f, 1.0f,

            // Right face
            2.0f, 0.2f, 1.0f,
            2.0f, -0.2f, 1.0f,
            2.0f, 0.2f, -1.0f,
            2.0f, -0.2f, 1.0f,
            2.0f, -0.2f, -1.0f,
            2.0f, 0.2f, -1.0f,

            // Back face
            2.0f, 0.2f, -1.0f,
            2.0f, -0.2f, -1.0f,
            -2.0f, 0.2f, -1.0f,
            2.0f, -0.2f, -1.0f,
            -2.0f, -0.2f, -1.0f,
            -2.0f, 0.2f, -1.0f,

            // Left face
            -2.0f, 0.2f, -1.0f,
            -2.0f, -0.2f, -1.0f,
            -2.0f, 0.2f, 1.0f,
            -2.0f, -0.2f, -1.0f,
            -2.0f, -0.2f, 1.0f,
            -2.0f, 0.2f, 1.0f,

            // Top face
            -2.0f, 0.2f, -1.0f,
            -2.0f, 0.2f, 1.0f,
            2.0f, 0.2f, -1.0f,
            -2.0f, 0.2f, 1.0f,
            2.0f, 0.2f, 1.0f,
            2.0f, 0.2f, -1.0f,

            // Bottom face
            2.0f, -0.2f, -1.0f,
            2.0f, -0.2f, 1.0f,
            -2.0f, -0.2f, -1.0f,
            2.0f, -0.2f, 1.0f,
            -2.0f, -0.2f, 1.0f,
            -2.0f, -0.2f, -1.0f,

            // Left foot / Front face
            -2.0f, -0.2f, 1.0f,
            -2.0f, -2.2f, 1.0f,
            -1.5f, -0.2f, 1.0f,
            -2.0f, -2.2f, 1.0f,
            -1.5f, -2.2f, 1.0f,
            -1.5f, -0.2f, 1.0f,

            // Left foot / Right face
            -1.5f, -0.2f, 1.0f,
            -1.5f, -2.2f, 1.0f,
            -1.5f, -0.2f, 0.0f,
            -1.5f, -2.2f, 1.0f,
            -1.5f, -2.2f, 0.0f,
            -1.5f, -0.2f, 0.0f,

            // Right foot / Front face
            2.0f, -0.2f, 1.0f,
            2.0f, -2.2f, 1.0f,
            1.5f, -0.2f, 1.0f,
            2.0f, -2.2f, 1.0f,
            1.5f, -2.2f, 1.0f,
            1.5f, -0.2f, 1.0f,

            // Right foot / Left face
            1.5f, -0.2f, 1.0f,
            1.5f, -2.2f, 1.0f,
            1.5f, -0.2f, 0.0f,
            1.5f, -2.2f, 1.0f,
            1.5f, -2.2f, 0.0f,
            1.5f, -0.2f, 0.0f,
    };

    public static final float[] CUBE_COLORS = new float[] {

            //6 points par face
            //--> 2 striangles par face
            //R,G,B,transparence

            // front, gray
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,

            // right, gray
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,

            // back, gray
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,

            // left, gray
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,
            0.412f, 0.412f, 0.412f, 1.0f,

            // top, gray
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,

            // bottom, gray
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,

            // left foot front, gray
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,

            // left foot right, gray
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,

            // right foot front, gray
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,

            // right foot left, gray
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
            0.412f,  0.412f,  0.412f, 1.0f,
    };

    public static final float[] CUBE_FOUND_COLORS = new float[] {
            // front, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // right, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // back, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // left, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // top, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // bottom, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // left foot front, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // left foot right, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // right foot front, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,

            // right foot left, yellow
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
            1.0f,  0.6523f, 0.0f, 1.0f,
    };

    public static final float[] CUBE_NORMALS = new float[] {

            //6 points par face
            //--> 2 triangles par face
            //x,y,z
            //On sait pas trop encore à quoi ça correspond mais
            //on pense que ce sont les ombres

            // Front face
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,

            // Right face
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,
            1.0f, 0.0f, 0.0f,

            // Back face
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,
            0.0f, 0.0f, -1.0f,

            // Left face
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,
            -1.0f, 0.0f, 0.0f,

            // Top face
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,
            0.0f, 1.0f, 0.0f,

            // Bottom face
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,

            // Left foot / Front face
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,

            // Left foot / Right face
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,

            // Right foot / Front face
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,

            // Right foot / Left face
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f,
            0.0f, -1.0f, 0.0f
    };

}
