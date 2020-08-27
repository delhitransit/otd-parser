/*
 * @author Tanmay Singal
 */

package com.delhitransit.otdparser.repository;

import com.delhitransit.otdparser.model.StopTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopTimeRepository extends JpaRepository<StopTime, Long> {

}