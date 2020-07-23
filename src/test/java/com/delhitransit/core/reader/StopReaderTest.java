/**
 * @author nitin-singla
 */

package com.delhitransit.core.reader;

import com.delhitransit.core.model.Route;
import com.delhitransit.core.model.Stop;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StopReaderTest {
    StopReader reader = new StopReader();

    @Test
    void readLine() {
        Stop stop = reader.readLine("0,Adarsh Nagar / Bharola Village,28.715917,77.170867");
        assertNotNull(stop);
        assertEquals(0, stop.getStopId());
        assertEquals("Adarsh Nagar / Bharola Village", stop.getName());
        assertEquals(28.715917, stop.getLatitude());
        assertEquals(77.170867, stop.getLongitude());
    }

    @Test
    void read() throws IOException {
        List<Stop> stops = reader.read("src/test/resources/static/stops_test.txt");
        assertNotNull(stops);
        assertEquals(2, stops.size());

        for (Stop stop : stops) {
            assertNotNull(stop);
            long stopId = stop.getStopId();
            assertTrue(stopId == 0 || stopId == 1);
            String name = stop.getName();
            assertTrue(name.equals("Adarsh Nagar / Bharola Village") || name.equals("British High Comission"));
            double latitude = stop.getLatitude();
            assertTrue(latitude == 28.715917 || latitude == 28.598533000000003);
            double longitude = stop.getLongitude();
            assertTrue(latitude == 77.170867 || latitude == 77.191383);
        }

    }
}







