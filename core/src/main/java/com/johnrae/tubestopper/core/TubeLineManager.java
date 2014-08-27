package com.johnrae.tubestopper.core;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class TubeLineManager {

    private final List<String> lines;

    public TubeLineManager() {
        try {
            lines = Files.readAllLines(Paths.get(getClass().getResource("lines.csv").toURI()));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public Set<TubeLine> getTubeLines(){
        final HashSet<TubeLine> tubeLines = new HashSet<TubeLine>();
        final String[] headers = lines.get(0).split(",");
        verifyHeaders(headers);
        lines.remove(0);
        for (String line : lines) {

            final String[] field = line.split(",");
            tubeLines.add(new TubeLine(Integer.valueOf(field[0]),field[1],Color.getColor(field[2])));
        }
        return tubeLines;

    }

    private void verifyHeaders(final String[] headers) {
        String[] expectedHeaders = new String[]{"line","name","colour","stripe"};
        for (int i = 0; i < expectedHeaders.length; i++) {
            if(!expectedHeaders[i].equals(headers[i])) {
                System.out.println(headers);
                throw new RuntimeException(expectedHeaders[i]+" header not present:");
            }

        }

    }
}
