package db;

import models.Doctor;
import models.Hospital;
import models.Patient;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Doctor> doctors;
    private List<Patient> patients;

    private List<Hospital> hospitals;


    public Database() {

        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        hospitals=new ArrayList<>();

    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    @Override
    public String toString() {
        return "Database{" +
               ", doctors=" + doctors +
               ", patients=" + patients +
               '}';
    }
}





