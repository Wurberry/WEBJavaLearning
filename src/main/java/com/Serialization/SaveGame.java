package com.Serialization;

import java.io.Serializable;
import java.util.Arrays;

public class SaveGame implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] airportsInfo;
    private String[] resourcesInfo;
    private String[] diplomacyInfo;

    public SaveGame(String[] airportsInfo, String[] resourcesInfo, String[] diplomacyInfo){
        this.airportsInfo = airportsInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public String[] getAirportsInfo() {
        return airportsInfo;
    }

    public void setTerritoriesInfo(String[] territoriesInfo) {
        this.airportsInfo = territoriesInfo;
    }

    public String[] getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(String[] resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public String[] getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(String[] diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "territoriesInfo=" + Arrays.toString(airportsInfo) +
                ", resourcesInfo=" + Arrays.toString(resourcesInfo) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfo) +
                '}';
    }
}