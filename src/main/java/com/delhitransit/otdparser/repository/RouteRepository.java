/*
 * @author Tanmay Singal
 */

package com.delhitransit.otdparser.repository;

import com.delhitransit.otdparser.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

    List<Route> findAllByRouteId(long routeId);

    List<Route> findAllByShortName(String name);

    List<Route> findAllByLongName(String name);

    List<Route> findAllByType(int type);

    List<Route> findAllByAgencyId(String agencyId);

}
