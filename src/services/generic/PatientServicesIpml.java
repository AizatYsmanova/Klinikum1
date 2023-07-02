package services.generic;

import db.Database;
import models.Patient;
import services.GenericServices;
import services.PatientServices;

import java.util.ArrayList;
import java.util.List;

public class PatientServicesIpml implements PatientServices {


    Database database = new Database();


    @Override
    public void addPatients(List<Patient> patients) {
        database.getPatients().addAll(patients);
    }

    @Override
    public List<Patient> getPatientByFirstName(String firstname) {
        return (List<Patient>) database.getPatients()
                .stream()
                .filter(patient -> patient.getFirstName().equals(firstname))
                .toList();
    }

    @Override
    public List<Patient> groupingByGender(String gender) {
        return database.getPatients()
                .stream()
                .filter(patient -> patient.getGender().equals(gender))
                .toList();
    }

    @Override
    public List<Patient> filterByAge(Integer age) {
        return database.getPatients()
                .stream()
                .filter(patient -> patient.getAge() >= age)
                .toList();
    }


}
