package com.johnrae.tubestop.app;

import com.johnrae.tubestopper.core.TubeLine;
import com.johnrae.tubestopper.core.TubeLineManager;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Created by jrae on 24/06/2014.
 */
public class TubeLineManagerTest {

    private TubeLineManager underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new TubeLineManager();


    }

    @Test
    public void getTubeLinesShouldReturnASetContainingAtLeastOneLine() {
        final Set<TubeLine> tubeLines = underTest.getTubeLines();
        assertTrue(tubeLines.size() > 0);
    }

    @Test
    public void Should() {
        final Set<TubeLine> tubeLines = underTest.getTubeLines();
        final Color brown = Color.getColor("ab6612");
        assertTrue(tubeLines.contains(new TubeLine(1,"Bakerloo Line", brown)));


    }
}
