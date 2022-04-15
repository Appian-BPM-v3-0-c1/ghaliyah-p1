package Main.Java.com.Revature.Store.services;

import Main.Java.com.Revature.Store.daos.LocationDAO;

public class LocationService {

        private final LocationDAO locationDAO;

        public LocationService(LocationDAO locationDAO) {
            this.locationDAO = locationDAO;
        }

        public LocationDAO getLocationDAO(){
            return locationDAO;
        }
    }


