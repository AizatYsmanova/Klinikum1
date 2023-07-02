package models;

import enums.Specialty;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    /**
     * Doctor классынын свойствалары: id, firstName,lastName, email, List<Patient>patients,gender
     */


    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Patient> patients;
    private String gender;
    private Specialty specialty;

    public Doctor() {

    }

    public Doctor(Long id, String firstName, String lastName, String email, List<Patient> patients, String gender, Specialty specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.patients = patients;
        this.gender = gender;
        this.specialty = specialty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor{" +
               "id='" + id + '\'' +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", email='" + email + '\'' +
               ", patient='" + patients +
               ", gender='" + gender +
               "specialty" + specialty +
               '}';
    }
}
