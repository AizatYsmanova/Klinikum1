package models;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

 /**   Hospital классынын свойствалары: id, name, address, List<Doctor>doctors, List<Patient>patients*/

 private Long id;
 private String name;
 private String address;
 private List<Doctor> doctors;


    public Hospital(Long id, String name, String address, List<Doctor> doctors) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.doctors = doctors;

    }

    public Long getId() {
       return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

//
    @Override
    public String toString() {
        return "Hospital{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", address='" + address + '\'' +
               ", doctors=" + doctors +

               '}';
    }
}
