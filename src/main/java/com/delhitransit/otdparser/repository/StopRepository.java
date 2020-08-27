/*
 * @author Tanmay Singal
 */

package com.delhitransit.otdparser.repository;

import com.delhitransit.otdparser.model.Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepository extends JpaRepository<Stop, Long> {

}
