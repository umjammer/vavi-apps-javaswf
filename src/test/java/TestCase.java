/*
 * Copyright (c) 2007 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.anotherbigidea.flash.movie.Frame;
import com.anotherbigidea.flash.movie.Instance;
import com.anotherbigidea.flash.movie.Movie;
import com.anotherbigidea.flash.movie.MovieClip;
import com.anotherbigidea.flash.movie.Shape;
import com.anotherbigidea.flash.movie.Transform;
import com.anotherbigidea.flash.structs.AlphaColor;
import com.anotherbigidea.flash.structs.Color;
import vavi.util.Debug;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * TestCase.
 *
 * @author <a href="mailto:vavivavi@yahoo.co.jp">Naohide Sano</a> (nsano)
 * @version 0.00 070618 nsano initial version <br>
 */
public class TestCase {

    @BeforeAll
    static void setupAll() throws Exception {
        Path tmp = Path.of("tmp");
        if (!Files.exists(tmp)) Files.createDirectory(tmp);
    }

    public static void main(String[] args) throws Exception {

        final int width = 400;
        final int height = 300;

        // border
        Shape border = new Shape();
        border.defineLineStyle(5, new Color(0, 255, 0));
        border.setLineStyle(1);
        border.move(0, 0);
        border.line(width, 0);
        border.line(width, height);
        border.line(0, height);

        // text
        Shape text = new Shape();
        text.defineLineStyle(1, null);
        text.setLineStyle(1);
        Font font = Font.decode(null).deriveFont(30.0f);
        GryphOut.PathDrawer drawer = new GryphOut.SwfPathDrawer(text);
        GryphOut go = new GryphOut();
        go.setFont(font);
        go.draw("キタ━━━━(゜∀゜)━━━━!!", 0, 0, drawer);

        // Set the text to the animation object.
        MovieClip clip = new MovieClip();
        Frame clipFrame = clip.appendFrame();
        Instance inst = clipFrame.placeSymbol(text, 0, 0);

        // Text animation settings
        for (int i = 0; i < 360; i += 3) {
            //Transform matrix = new Transform(i * Math.PI / 180.0, 0.0, 0.0);
            Transform matrix = new Transform(i * Math.PI / 180.0, i / 50.0, i / 50.0, 0.0, 0.0);
            Frame frame = clip.appendFrame();
            frame.alter(inst, matrix, null);
        }

        // Main SWF environment setup
        Movie movie = new Movie();
        movie.setWidth(width);
        movie.setHeight(height);
        movie.setBackColor(new AlphaColor(255, 255, 255, 0));
        Frame movieFrame = movie.appendFrame();
        // Set the border
        movieFrame.placeSymbol(border, 0, 0);
        // Set the animation object
        movieFrame.placeSymbol(clip, 100, 100);

        movie.write("tmp/sample3.swf");
Debug.print("done");
    }

    @Test
    void test1() throws Exception {
        main(new String[] {});
    }
}
