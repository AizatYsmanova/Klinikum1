package services.generic;

import db.Database;
import models.Doctor;
import services.DoctorServices;


import java.util.List;


public class DoctorServicesImpl implements DoctorServices {

    Database database = new Database();

    @Override
    public void addDoctors(List<Doctor> doctors) {
        database.getDoctors().addAll(doctors);
    }

    @Override
    public List<Doctor> filterByGender(String gender) {

        return database.getDoctors()
                .stream()
                .filter(doctor -> doctor.getGender().equals(gender))
                .toList();

    }

    @Override
    public List<Doctor> getDoctorById(Long id) {
        return database.getDoctors()
                .stream()
                .filter(doctor -> doctor.getId().equals(id))
                .toList();
    }
}
