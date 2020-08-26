/*
 * @author Tanmay Singal
 */

package com.delhitransit.core.repository;

import com.delhitransit.core.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepository extends JpaRepository<Route, Long> {

}
