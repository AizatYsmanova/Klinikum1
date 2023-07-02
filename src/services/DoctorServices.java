package services;

import db.Database;
import models.Doctor;

import java.util.List;

public interface DoctorServices {

    /**
     * Doctor getDoctorById(Long id);//Stream//////////////////////////////////////////
     * List<Doctor> filterByGender(String gender);//Stream ////////////////////////////
     **/

    Database dataBase = new Database();

    void addDoctors(List<Doctor> doctors);

    List<Doctor> filterByGender(String gender);

    List<Doctor> getDoctorById(Long id);

}
