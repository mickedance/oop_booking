package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class BookingTime {
    private final String id;
    private LocalDateTime dateTime;
    private double price;
    private String administrator;
    private String vaccineId;
    private boolean vacant;
    private Patient patient;
    private Premises premises;

    public BookingTime(LocalDateTime dateTime, double price, String administrator, String vaccineId, boolean vacant, Patient patient, Premises premises) {

        this.id = UUID.randomUUID().toString();
        setPrice(price);
        setDateTime(dateTime);
        setAdministrator(administrator);
        setVaccineId(vaccineId);
        setPatient(patient);
        setPremises(premises);
    }

    public String getId() {
        return id;
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        if (dateTime == null) throw new IllegalArgumentException("Param: dateTime cannot be null");
        this.dateTime = dateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        if (administrator == null || administrator.equals(""))
            throw new IllegalArgumentException("Param: administrator cannot be null");

        this.administrator = administrator;
    }

    public String getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(String vaccineId) {
        if (vaccineId == null || vaccineId.equals(""))
            throw new IllegalArgumentException("Param: vaccineId cannot be null");
        this.vaccineId = vaccineId;
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        setVacant(patient == null);
        this.patient = patient;
    }

    public Premises getPremises() {
        return premises;
    }

    @Override
    public String toString() {
        return "BookingTime{" +
                "id='" + id + '\'' +
                ", dateTime=" + dateTime +
                ", price=" + price +
                ", administrator='" + administrator + '\'' +
                ", vaccineId='" + vaccineId + '\'' +
                ", vacant=" + vacant +
                ", patient=" + patient +
                ", premises=" + premises +
                '}';
    }

    public void setPremises(Premises premises) {
        if (premises == null) throw new IllegalArgumentException("Param: premises cannot be null");
        this.premises = premises;
    }
}
