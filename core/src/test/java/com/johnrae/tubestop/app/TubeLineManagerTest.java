package com.johnrae.tubestop.app;

import com.johnrae.tubestopper.core.TubeLine;
import com.johnrae.tubestopper.core.TubeLineManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
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
        assertThat(tubeLines.size(),equalTo(13));
    }

    @Test
    public void dataShouldContainBakerlooLine() {
        final Set<TubeLine> tubeLines = underTest.getTubeLines();
        final Color brown = Color.getColor("ab6612");
        assertThat(new TubeLine(1, "Bakerloo Line", brown), equalTo(new TubeLine(1, "Bakerloo Line", brown)));
        assertThat(tubeLines, hasItem(new TubeLine(1, "Bakerloo Line", brown)));

    }
}
