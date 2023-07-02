package services;

import models.Patient;

import java.util.List;

public interface PatientServices {

    /**
     * PatientService
     * - List<Patient>addPatient(List<Patient>patients);/////////////////////////////////////////////////////
     * Patient getPatientByfirstName(String  name);//stream /////////////////////////////////////////////////
     * - void groupingByGender();//Stream///////////////////////////////////////////////////////////////////
     * List<Patient>filterByAge();//30 dan oido pasientter chyksyn
     *////////////////////////////////////////


    void addPatients(List<Patient> patient);

    List<Patient> getPatientByFirstName(String firstname);

    List<Patient> groupingByGender(String gender);

    List<Patient> filterByAge(Integer age);
}
