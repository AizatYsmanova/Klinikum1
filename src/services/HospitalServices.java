package services;

import models.Hospital;

import java.util.List;

public interface HospitalServices {
    /**
     * List<Hospital>addHospitals(List<Hospital> hospitals);        ///////////////////////////////////////////////
     * Hospital getHospitalById(Long id);                              //////////////////////////////////////////////
     * void updateHospital(Long id, Hospital hospital);????????????????????????????????????????????????????????
     * List<Hospital>sortHospitalByName(String sort);//Stream menen
     **////////////////////////

    void addHospitals(List<Hospital> hospitals);

    List<Hospital> getHospitalById(Long id);

    List<Hospital> updateHospital(Long id, Hospital hospital);

    List<Hospital> sortHospitalByName();

}
