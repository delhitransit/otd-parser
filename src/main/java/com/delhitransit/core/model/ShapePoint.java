/*
 * @author Tanmay Singal
 */

package com.delhitransit.core.model;

/**
 * For more information see https://developers.google.com/transit/gtfs/reference/#shapestxt
 */
public class ShapePoint {

    /**
     * Identifies a shape.
     */
    private int shapeId;

    /**
     * Latitude of a shape point. Each record in shapes.txt represents a shape point used to define the shape.
     */
    private double latitude;

    /**
     * Longitude of a shape point.
     */
    private double longitude;

    /**
     * Sequence in which the shape points connect to form the shape. Values must increase along the trip but do not
     * need to be consecutive.Example: If the shape "A_shp" has three points in its definition, the shapes.txt file
     * might contain these records to define the shape:
     * shape_id,shape_pt_lat,shape_pt_lon,shape_pt_sequence
     * A_shp,37.61956,-122.48161,0
     * A_shp,37.64430,-122.41070,6
     * A_shp,37.65863,-122.30839,11
     */
    private int sequence;

    public int getShapeId() {
        return shapeId;
    }

    public ShapePoint setShapeId(int shapeId) {
        this.shapeId = shapeId;
        return this;
    }

    public double getLatitude() {
        return latitude;
    }

    public ShapePoint setLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public double getLongitude() {
        return longitude;
    }

    public ShapePoint setLongitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public int getSequence() {
        return sequence;
    }

    public ShapePoint setSequence(int sequence) {
        this.sequence = sequence;
        return this;
    }
}
