/*
 * @author Tanmay Singal
 */

package com.delhitransit.otdparser.repository;

import com.delhitransit.otdparser.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

}
