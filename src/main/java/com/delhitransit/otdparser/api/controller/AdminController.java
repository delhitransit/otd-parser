package com.delhitransit.otdparser.api.controller;

import com.delhitransit.otdparser.CoreApplication;
import com.delhitransit.otdparser.model.Route;
import com.delhitransit.otdparser.model.ShapePoint;
import com.delhitransit.otdparser.model.Stop;
import com.delhitransit.otdparser.model.StopTime;
import com.delhitransit.otdparser.model.Trip;
import com.delhitransit.otdparser.reader.RouteReader;
import com.delhitransit.otdparser.reader.ShapePointReader;
import com.delhitransit.otdparser.reader.StopReader;
import com.delhitransit.otdparser.reader.StopTimeReader;
import com.delhitransit.otdparser.reader.TripReader;
import com.delhitransit.otdparser.repository.RouteRepository;
import com.delhitransit.otdparser.repository.ShapePointRepository;
import com.delhitransit.otdparser.repository.StopRepository;
import com.delhitransit.otdparser.repository.StopTimeRepository;
import com.delhitransit.otdparser.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("v1/admin")
public class AdminController {

    RouteRepository routeRepository;

    StopRepository stopRepository;

    StopTimeRepository stopTimeRepository;

    TripRepository tripRepository;

    ShapePointRepository shapePointRepository;

    @Autowired
    public AdminController(RouteRepository routeRepository, StopRepository stopRepository,
                           StopTimeRepository stopTimeRepository,
                           TripRepository tripRepository,
                           ShapePointRepository shapePointRepository) {
        this.routeRepository = routeRepository;
        this.stopRepository = stopRepository;
        this.stopTimeRepository = stopTimeRepository;
        this.tripRepository = tripRepository;
        this.shapePointRepository = shapePointRepository;
    }

    @GetMapping("init/status")
    public boolean applicationInitializationStatus() {
        return CoreApplication.isApplicationInitialized;
    }

    @GetMapping("init")
    public void initializeDatabase() throws IOException {

        List<Route> routes = new RouteReader().read("src/main/resources/dataset/mini/static/routes.txt");
        routeRepository.saveAll(routes);

        List<Stop> stops = new StopReader().read("src/main/resources/dataset/mini/static/stops.txt");
        stopRepository.saveAll(stops);

        List<StopTime> stopTimes = new StopTimeReader().read("src/main/resources/dataset/mini/static/stop_times.txt");
        stopTimeRepository.saveAll(stopTimes);

        List<Trip> trips = new TripReader().read("src/main/resources/dataset/mini/static/trips.txt");
        tripRepository.saveAll(trips);

        List<ShapePoint> shapePoints = new ShapePointReader().read("src/main/resources/dataset/mini/static/shapes.txt");
        shapePointRepository.saveAll(shapePoints);

        CoreApplication.isApplicationInitialized = true;
    }

}
