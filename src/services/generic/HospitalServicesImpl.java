package services.generic;

import db.Database;
import models.Doctor;
import models.Hospital;
import services.GenericServices;
import services.HospitalServices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalServicesImpl implements HospitalServices {

    Database database = new Database();


    @Override
    public void addHospitals(List<Hospital> hospitals) {
        database.getHospitals().addAll(hospitals);
    }

    @Override
    public List<Hospital> getHospitalById(Long id) {
        return (List<Hospital>) database.getHospitals()
                .stream()
                .filter(hospital -> hospital.getId().equals(id)).toList();
    }


    @Override
    public List<Hospital> updateHospital(Long id, Hospital hospital) {
        return null;
    }    ////////////Эмне метод экенин кантип чыгарышты тушунбой койдум...

    @Override
    public List<Hospital> sortHospitalByName() {
        return database.getHospitals()
                .stream()
                .sorted(new Comparator<Hospital>() {
                    @Override
                    public int compare(Hospital o1, Hospital o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                }).toList();
    }
}