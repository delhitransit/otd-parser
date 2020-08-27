/*
 * @author Tanmay Singal
 */

package com.delhitransit.otdparser.repository;

import com.delhitransit.otdparser.model.ShapePoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShapePointRepository extends JpaRepository<ShapePoint, Long> {

}
