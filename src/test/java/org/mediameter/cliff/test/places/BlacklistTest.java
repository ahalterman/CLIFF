package org.mediameter.cliff.test.places;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mediameter.cliff.ParseManager;

import com.bericotech.clavin.resolver.ResolvedLocation;

public class BlacklistTest {

    @Test
    public void testReddit() {
        List<ResolvedLocation> results = ParseManager.extractAndResolve("This is about Reddit the website.").getResolvedLocations();
        assertEquals("Found "+results.size()+" places, should have been none!",0,results.size());
    }
    
}
