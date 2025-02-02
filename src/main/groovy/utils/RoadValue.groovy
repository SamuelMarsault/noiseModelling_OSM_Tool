/**
 * NoiseModelling is an open-source tool designed to produce environmental noise maps on very large urban areas. It can be used as a Java library or be controlled through a user friendly web interface.
 *
 * This version is developed by the DECIDE team from the Lab-STICC (CNRS) and by the Mixt Research Unit in Environmental Acoustics (Université Gustave Eiffel).
 * <http://noise-planet.org/noisemodelling.html>
 *
 * NoiseModelling is distributed under GPL 3 license. You can read a copy of this License in the file LICENCE provided with this software.
 *
 * Contact: contact@noise-planet.org
 *
 */

/**
 * @Author Samuel Marsault
 */

package utils

/**
 * Enumeration that allows you to take the names of properties present
 * in the road_traffic file and modify them more easily.
 */
enum RoadValue {
    ID_ROAD("ID_ROAD","PK"),
    ID_SOURCE("ID_SOURCE","ID_SOURCE"),
    ROAD_TYPE("ROAD_TYPE","ROAD_TYPE"),
    SOURCE_ROAD_TYPE("SOURCE_ROAD_TYPE","SOURCE_ROAD_TYPE"),
    SURFACE("SURFACE","SURFACE"),
    SLOPE("SLOPE","SLOPE"),
    DAY_LV_HOUR("DAY_LV_HOUR","LV_D"),
    EV_LV_HOUR("EV_LV_HOUR","LV_E"),
    NIGHT_LV_HOUR("NIGHT_LV_HOUR","LV_N"),
    DAY_LV_SPEED("DAY_LV_SPEED","LV_SPD_D"),
    EV_LV_SPEED("EV_LV_SPEED","LV_SPD_E"),
    NIGHT_LV_SPEED("NIGHT_LV_SPEED","LV_SPD_N"),
    DAY_HV_HOUR("DAY_HV_HOUR","HGV_D"),
    EV_HV_HOUR("EV_HV_HOUR","HGV_E"),
    NIGHT_HV_HOUR("NIGHT_HV_HOUR","HGV_N"),
    DAY_HV_SPEED("DAY_HV_SPEED","HGV_SPD_D"),
    EV_HV_SPEED("EV_HV_SPEED","HGV_SPD_E"),
    NIGHT_HV_SPEED("NIGHT_HV_SPEED","HGV_SPD_N"),
    PAVEMENT("PAVEMENT","PVMT"),
    DIRECTION("DIRECTION","WAY");

    private final gcProperties
    private final nmProperties

    /**
     * RoadValue constructor
     * @param gcProperty : Value use in geoClimate
     * @param nmProperty : value use in noiseModelling
     */
    private RoadValue(gcProperty,nmProperty){
        this.gcProperties = gcProperty
        this.nmProperties = nmProperty
    }

    /**
     * Getter of gcProperties
     * @return gcProperties
     */
    public Object getGcProperty(){
        return gcProperties
    }

    /**
     * Getter of gcProperties
     * @return nmProperties
     */
    public Object getNmProperty(){
        return nmProperties
    }


}