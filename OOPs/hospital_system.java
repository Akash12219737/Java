// To create a simple representation of a hospital system in Java, we can model entities like Doctor, Patient, and Appointment
package OOPs;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }
}

class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Appointment> appointments;

    public Hospital() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void scheduleAppointment(Doctor doctor, Patient patient, String date) {
        Appointment appointment = new Appointment(doctor, patient, date);
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}

public class hospital_system {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Pediatrician");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        Patient patient1 = new Patient("Alice", 30);
        Patient patient2 = new Patient("Bob", 25);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        hospital.scheduleAppointment(doctor1, patient1, "2024-04-18");
        hospital.scheduleAppointment(doctor2, patient2, "2024-04-20");

        System.out.println("Appointments:");
        List<Appointment> appointments = hospital.getAppointments();
        for (Appointment appointment : appointments) {
            System.out.println("Date: " + appointment.getDate() +
                               ", Doctor: " + appointment.getDoctor().getName() +
                               ", Patient: " + appointment.getPatient().getName());
        }
    }
}

