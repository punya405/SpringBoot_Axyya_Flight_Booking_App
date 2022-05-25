package com.learn.srpingboot.SPRING_AXYYA.model;

import javax.persistence.*;

@Entity
@Table(name = "Passenger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long passengerId;

    @Column(name = "pass_name")
    String name;

    @Column(name = "pass_age")
    String age;

    @Column(name = "pass_gender")
    String gender;

    @Column(name = "pass_source")
    String source;

    @Column(name = "pass_destination")
    String destination;

    //@OneToOne(mappedBy = "passenger")
   /* private Booking booking;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }*/

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /*
     * public Passenger(Integer passengerId, String name, String age, String gender,
     * String source, String destination) { super(); this.passengerId = passengerId;
     * this.name = name; this.age = age; this.gender = gender; this.source = source;
     * this.destination = destination; }
     */

    @Override
    public String toString() {
        return "Passenger [passengerId=" + passengerId + ", name=" + name + ", age=" + age + ", gender=" + gender
                + ", source=" + source + ", destination=" + destination + "]";
    }


}
