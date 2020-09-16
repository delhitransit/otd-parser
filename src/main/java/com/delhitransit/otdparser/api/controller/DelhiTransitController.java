package com.delhitransit.otdparser.api.controller;

import com.delhitransit.otdparser.model.Route;
import com.delhitransit.otdparser.model.ShapePoint;
import com.delhitransit.otdparser.model.Stop;
import com.delhitransit.otdparser.model.StopTime;
import com.delhitransit.otdparser.model.Trip;
import com.delhitransit.otdparser.repository.RouteRepository;
import com.delhitransit.otdparser.repository.ShapePointRepository;
import com.delhitransit.otdparser.repository.StopRepository;
import com.delhitransit.otdparser.repository.StopTimeRepository;
import com.delhitransit.otdparser.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class DelhiTransitController {

    RouteRepository routeRepository;

    StopRepository stopRepository;

    StopTimeRepository stopTimeRepository;

    TripRepository tripRepository;

    ShapePointRepository shapePointRepository;

    @Autowired
    public DelhiTransitController(RouteRepository routeRepository,
                                  StopRepository stopRepository,
                                  StopTimeRepository stopTimeRepository,
                                  TripRepository tripRepository,
                                  ShapePointRepository shapePointRepository) {
        this.routeRepository = routeRepository;
        this.stopRepository = stopRepository;
        this.stopTimeRepository = stopTimeRepository;
        this.tripRepository = tripRepository;
        this.shapePointRepository = shapePointRepository;
    }

    @GetMapping("routes")
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @GetMapping("trips")
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    @GetMapping("shapePoints")
    public List<ShapePoint> getAllShapePoints() {
        return shapePointRepository.findAll();
    }

    @GetMapping("stops")
    public List<Stop> getAllStops() {
        return stopRepository.findAll();
    }

    @GetMapping("stopTimes")
    public List<StopTime> getAllStopTimes() {
        return stopTimeRepository.findAll();
    }

}
