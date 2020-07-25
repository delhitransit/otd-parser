/*
 * @author Tanmay Singal
 */

package com.delhitransit.core.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class TripEntity {

    @Getter
    @Setter
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "trip", cascade = CascadeType.ALL)
    List<StopTimeEntity> stopTimes;

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long key;

    @Getter
    @Setter
    private String tripId;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    private RouteEntity route;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    private ShapePointEntity shapePoint;

}