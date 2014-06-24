package com.johnrae.tubestopper.core;

import java.awt.*;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jrae on 24/06/2014.
 */
public class TubeLineManager {
    public TubeLineManager() {
        final String file = getClass().getResource("lines.csv").getFile();
        final boolean exists = new File(file).exists();
        System.out.println(exists);
//        final File file = new File("/Users/jrae/blah.txt");
//        final boolean exists = file.exists();

    }
    public Set<TubeLine> getTubeLines(){
        final HashSet<TubeLine> tubeLines = new HashSet<TubeLine>();
        tubeLines.add(new TubeLine(1, "northern", Color.BLACK));
        return tubeLines;

    }
}
