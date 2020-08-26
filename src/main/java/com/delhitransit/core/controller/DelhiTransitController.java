package com.delhitransit.core.controller;

import com.delhitransit.core.model.Route;
import com.delhitransit.core.model.ShapePoint;
import com.delhitransit.core.model.Stop;
import com.delhitransit.core.model.StopTime;
import com.delhitransit.core.model.Trip;
import com.delhitransit.core.repository.RouteRepository;
import com.delhitransit.core.repository.ShapePointRepository;
import com.delhitransit.core.repository.StopRepository;
import com.delhitransit.core.repository.StopTimeRepository;
import com.delhitransit.core.repository.TripRepository;
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
