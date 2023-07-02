import db.Database;
import enums.Gender;
import enums.Specialty;
import models.Doctor;
import models.Hospital;
import models.Patient;
import services.DoctorServices;
import services.HospitalServices;
import services.PatientServices;
import services.generic.DoctorServicesImpl;
import services.generic.HospitalServicesImpl;
import services.generic.PatientServicesIpml;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /**      жаны пакет тузунуз - model, service, dao, enums
         model пакетине класстарды тузунуз.
         Класстар: Hospital, Doctor, Patient
         Hospital классынын свойствалары: id, name, address, List<Doctor>doctors, List<Patient>patients
         Doctor классынын свойствалары: id, firstName,lastName, email, List<Patient>patients,gender
         Patient классынын свойствалары: id, firstName,lastName, phoneNumber,gender,age
         service пакетине ар бир класска тиешелуу жана бир generic интерфейс тузуп, томонку методдорду жазыныз:
         1. - GenericService:
         List<T>add(T t);
         List<T>getAll();
         - HospitalService:
         List<Hospital>addHospitals(List<Hospital> hospitals);
         Hospital getHospitalById(Long id);
         void updateHospital(Long id, Hospital hospital);
         List<Hospital>sortHospitalByName(String sort);//Stream menen
         3. - DoctorService:
         Doctor getDoctorById(Long id);//Stream
         List<Doctor> filterByGender(String gender);//Stream
         -PatientService
         - List<Patient>addPatient(List<Patient>patients);**************************************************************
         Patient getPatientByfirstName(String name);//stream***********************************************************
         - void groupingByGender();//Stream
         List<Patient>filterByAge();//30 dan oido pasientter chyksyn   ***********************************************
         Реализацияларын impl класстарда кылабыз.
         Методдорду озгортууго болбойт, условияда кандай берилсе ошол бойдон иштегиле!*/

//
        Database database = new Database();


        PatientServices patientServices = new PatientServicesIpml();
        DoctorServices doctorServices = new DoctorServicesImpl();
        HospitalServices hospitalServices = new HospitalServicesImpl();
        List<Patient> patients = database.getPatients();
        List<Doctor> doctors = database.getDoctors();
        List<Hospital> hospitals = database.getHospitals();


        Patient patient1 = new Patient(101L, "Alice", "Brown", "+4915763546376", "F", 20);//1 хирург 1 .1 ст 1. 1 дет 2 .2 дет 1
        Patient patient2 = new Patient(104L, "Michael", "Davis", "+4916987289137", "M", 28);
        Patient patient3 = new Patient(105L, "Tino", "Zimmermann", "+222222222", "M", 3);
        Patient patient4 = new Patient(106L, "Emily", "Davis", "+333333333", "F", 6);/*/*/
        Patient patient5 = new Patient(107L, "Ethan", "Young", "+789789789", "M", 7);

        Patient patient6 = new Patient(8L, "Anna", "Wilson", "+555555555", "F", 40);
        Patient patient7 = new Patient(9L, "James", "Taylor", "+666666666", "M", 38); //1 хирург 2. 1ст 2.1дет 1,2 дет 1
        Patient patient8 = new Patient(10L, "Sophia", "Anderson", "+777777777", "F", 12);/*/*/
        Patient patient9 = new Patient(11L, "Benjamin", "Martinez", "+888888888", "M", 22);
        Patient patient10 = new Patient(12L, "Hannah", "Thompson", "+999999999", "F", 7);
        Patient patient11 = new Patient(13L, "Liam", "Miller", "+123123123", "M", 2);


        Patient patient12 = new Patient(212L, "Mia", "Clark", "+456456456", "F", 79);//1 хирург 1 1 ст 1. 1 дет 1,2дет1
        Patient patient13 = new Patient(213L, "Erhan", "Young", "+789789789", "M", 7);
        Patient patient14 = new Patient(214L, "Ava", "Bernhard", "+111222333", "F", 8);
        Patient patient15 = new Patient(215L, "Melina", "Aman", "+456456456", "F", 3);


        List<Patient> patientList = new ArrayList<>(List.of(patient1, patient2, patient3, patient4, patient5, patient6, patient7, patient8, patient9
                , patient10, patient11, patient12, patient13, patient14, patient15));

        patientServices.addPatients(patientList);

        patientServices.getPatientByFirstName("Melina").forEach(System.out::println);

        patientServices.groupingByGender("F").forEach(System.out::println);

        patientServices.filterByAge(40).forEach(System.out::println);

        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);
        patients.add(patient6);
        patients.add(patient7);
        patients.add(patient8);
        patients.add(patient9);
        patients.add(patient10);
        patients.add(patient11);
        patients.add(patient12);
        patients.add(patient13);
        patients.add(patient14);
        patients.add(patient15);


        List<Patient> selectedPatients1 = new ArrayList<>();
        selectedPatients1.add(patients.get(0));

        List<Patient> selectedPatients2 = new ArrayList<>();
        selectedPatients2.add(patients.get(1));


        List<Patient> selectedPatients3 = new ArrayList<>();
        selectedPatients3.add(patients.get(2));
        selectedPatients3.add(patients.get(3));


        List<Patient> selectedPatients4 = new ArrayList<>();
        selectedPatients4.add(patients.get(4));


//
//        //////////////////////////////////////////////////////////////////
//
        List<Patient> selectedPatients5 = new ArrayList<>();
        selectedPatients5.add(patients.get(5));
        selectedPatients5.add(patients.get(6));


        List<Patient> selectedPatients6 = new ArrayList<>();
        selectedPatients6.add(patients.get(7));
        selectedPatients6.add(patients.get(8));


        List<Patient> selectedPatients7 = new ArrayList<>();
        selectedPatients7.add(patients.get(9));

        List<Patient> selectedPatients8 = new ArrayList<>();
        selectedPatients8.add(patients.get(10));
//
//
//        //////////////////////////////////////////////////////////////////
//
//
        List<Patient> selectedPatients9 = new ArrayList<>();
        selectedPatients9.add(patients.get(11));

        List<Patient> selectedPatients10 = new ArrayList<>();
        selectedPatients10.add(patients.get(12));

        List<Patient> selectedPatients11 = new ArrayList<>();
        selectedPatients11.add(patients.get(13));

        List<Patient> selectedPatients12 = new ArrayList<>();
        selectedPatients12.add(patients.get(14));

//
//        //1.Klinik 1 хирург 1. 1 стом 1. 1 дет.вр 2. 2 дет.вр 1
//        //2.Klinik 1 хирург 2. 1 стом 2. 1 дет.вр 1. 2 дет.вр 1
//        //3.klinik 1 хирург 1 .1 стом 1. 1 дет.вр 1, 2 дет.вр 1
//
        Doctor doctor1 = new Doctor(231L, "Emma", "Johnson", "emmajohnson@example.com", selectedPatients1, "F", Specialty.SURGEON);
        Doctor doctor2 = new Doctor(232L, "Michael", "Smith", "michaelsmith@example.com", selectedPatients2, "M", Specialty.DENTIST);
        Doctor doctor3 = new Doctor(233L, "Olivia", "Brown", "oliviabrown@example.com", selectedPatients3, "F", Specialty.PEDIATRICIAN);
        Doctor doctor4 = new Doctor(234L, "Daniel", "Lee", "daniellee@example.com", selectedPatients4, "M", Specialty.PEDIATRICIAN);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        Doctor doctor5 = new Doctor(321L, "James", "Miller", "jamesmiller@example.com", selectedPatients5, "M", Specialty.SURGEON);
        Doctor doctor6 = new Doctor(322L, "Isabella", "Taylor", "isabellataylor@example.com", selectedPatients6, "F", Specialty.DENTIST);
        Doctor doctor7 = new Doctor(323L, "Benjamin", "Anderson", "benjaminanderson@example.com", selectedPatients7, "M", Specialty.PEDIATRICIAN);
        Doctor doctor8 = new Doctor(324L, "Ava", "Harris", "avaharris@example.com", selectedPatients8, "F", Specialty.PEDIATRICIAN);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Doctor doctor9 = new Doctor(431L, "Daniel", "Lee", "daniellee@example.com", selectedPatients9, "M", Specialty.SURGEON);
        Doctor doctor10 = new Doctor(432L, "Sophia", "Wilson", "sophiawilson@example.com", selectedPatients10, "F", Specialty.DENTIST);
        Doctor doctor11 = new Doctor(434L, "James", "Miller", "jamesmiller@example.com", selectedPatients11, "M", Specialty.PEDIATRICIAN);
        Doctor doctor12 = new Doctor(435L, "Julia", "Bernhard", "julibern@example.com", selectedPatients12, "F", Specialty.PEDIATRICIAN);

        DoctorServices doctorService = new DoctorServicesImpl();

        List<Doctor> doctorList = new ArrayList<>(List.of(doctor1, doctor2, doctor3, doctor4, doctor5, doctor6, doctor7, doctor8, doctor9, doctor10
                , doctor11, doctor12));

        doctorService.addDoctors(doctorList);

        doctorService.filterByGender("F").forEach(System.out::println);


        doctorService.getDoctorById(432L).forEach(doctor -> {
            System.out.println("ID: " + doctor.getId());
            System.out.println("First Name: " + doctor.getFirstName());
            System.out.println("Last Name: " + doctor.getLastName());
            System.out.println("Email: " + doctor.getEmail());
            System.out.println("Gender: " + doctor.getGender());
            System.out.println("Specialty: " + doctor.getSpecialty());
        });


        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        doctors.add(doctor6);
        doctors.add(doctor7);
        doctors.add(doctor8);
        doctors.add(doctor9);
        doctors.add(doctor10);
        doctors.add(doctor11);
        doctors.add(doctor12);


        List<Doctor> selectedDoctor1 = new ArrayList<>();
        selectedDoctor1.add(doctors.get(0));
        selectedDoctor1.add(doctors.get(1));
        selectedDoctor1.add(doctors.get(2));
        selectedDoctor1.add(doctors.get(3));


        List<Doctor> selectedDoctor2 = new ArrayList<>();
        selectedDoctor2.add(doctors.get(4));
        selectedDoctor2.add(doctors.get(5));
        selectedDoctor2.add(doctors.get(6));
        selectedDoctor2.add(doctors.get(7));


        List<Doctor> selectedDoctor3 = new ArrayList<>();
        selectedDoctor3.add(doctors.get(8));
        selectedDoctor3.add(doctors.get(9));
        selectedDoctor3.add(doctors.get(10));
        selectedDoctor3.add(doctors.get(11));

//        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//

        Hospital hospital1 = new Hospital(21340L, "Solingen Munivipal Hospital", "Sarlahstr 34", selectedDoctor1);
        Hospital hospital2 = new Hospital(87283L, "Medical Center", "Im Sinnenhof 6", selectedDoctor2);
        Hospital hospital3 = new Hospital(13084L, "Charite ", "Bilendstr 12", selectedDoctor3);


        List<Hospital> hospitalList = new ArrayList<>(List.of(hospital1, hospital2, hospital3));

        hospitalServices.addHospitals(hospitalList);

        hospitalServices.getHospitalById(21340L).forEach(hospital -> {

            System.out.println("ID: " + hospital.getId());
            System.out.println("Name: " + hospital.getName());
            System.out.println("Address: " + hospital.getAddress());

        });


        hospitalServices.sortHospitalByName().forEach(System.out::println);
        hospitalServices.updateHospital(345L, hospital1);

//
//
//        List<Hospital> getHospitalById = hospitals.stream()
//                .filter(hospital -> hospital.getId().equals(21340L))
//                .collect(Collectors.toList());

//        database.getHospitals()
//                .stream()
//                .filter(h -> h.getId().equals(id))
//                .findFirst()
//                .ifPresent(existingHospital -> {
//                            existingHospital.setName(hospital.getName());
//                            existingHospital.setAddress(hospital.getAddress());
//                            existingHospital.setDoctors(hospital.getDoctors());
//                            existingHospital.setPatients(hospital.getPatients());
//                            System.out.println("Клиника успешно обновлена.");
//                        });

//        List<Hospital> sortHospitalByName = hospitals.stream()
//                .sorted(Comparator.comparing(Hospital::getName))
//                .collect(Collectors.toList());
//        hospitals.forEach(System.out::println);


//
//
//
//        DoctorServices doktorServices=new DoctorServicesImpl();
//
//        List<Doctor> doctors = List.of(
//                new Doctor(83278L, "Arina", "Adler", "aadler@fgg.de", patients, "F"),
//                new Doctor(83278L, "Arina", "Adler", "aadler@fgg.de", patients, "F"));
//
//
//        HospitalServices hospitalServices=new HospitalServicesImpl();
//
//        Hospital hospital=new Hospital(23445L,"Solingen Munivipal Hospital","Sarlahstr 34",doctors,patients);
//         hospitalServices.addDoctor(doctor1);


        //   services.addPatient(patients);
        //  services.filterByAge(18).forEach(System.out::println);

        // System.out.println(services.getPatientByfirstName("Aman"));


//        Doctor doctor1 = new Doctor(98657L, "Bretsch", "Weimer", "bretschw@smh.de", patients, "M");
//        Doctor doctor2 = new Doctor(87247L, "Steibert", "Artur", "steibertartur@jdl.de", patients, "M");
//        Doctor doctor3 = new Doctor(83278L, "Arina", "Adler", "aadler@fgg.de", patients, "F");
//        Doctor doctor4 = new Doctor(943-9L, "Hannah", "Wellenstein", "hannahwellenstein@kfh.de", patients, "F");
//        Doctor doctor5 = new Doctor(67320L, "Zimmermann", "Tino", "tino@schk.de", patients, "M");

//
//        doctorServices.filterByGender("F").forEach(System.out::println);
//        doctorServices.filterByGender("M").forEach(System.out::println);


//
//        HospitalServices hospitalServices = new HospitalServicesImpl();
//        Hospital hospital = new Hospital();
//        hospital.setName("Solingen Munivipal Hospital");
//        hospital.setAddress("Sarlahstr 34");


//
//        Hospital hospital1 = List.of(
//                new Hospital(21340L, "Solingen Munivipal Hospital", "Sarlahstr 34", doctors, patients),
//                new Hospital(21340L, "Medical Center", "Im Sinnenhof 6", doctors, patients),
//                new Hospital(21340L, "Charite ", "Bilendstr 12", doctors, patients),
//                new Hospital(21340L, "Solingen Munivipal Hospital", "Sarlahstr 34", doctors, patients));


        //List<Hospital> hospital = new ArrayList<>(List.of(hospital1, hospital2, hospital3, hospital4));
    }
}