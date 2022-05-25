package com.learn.srpingboot.SPRING_AXYYA.repository;

import com.learn.srpingboot.SPRING_AXYYA.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
   //findByGender -- select * from passenger where pass_gender=:gender;
   //List<Passenger> findByGenderAndDestination(String gender,String dest);
   // List<Passenger> findByGender(String gender);
      //JPQL - select passenger from Passenger as passenger where gender='Male' and destination='pune'
    //@Query(value = "select * from passenger where pass_gender='Male' and pass_destination='pune'", nativeQuery = true)
    @Query(value = "select passenger from Passenger as passenger where gender=:gender and destination=:destination")
    List<Passenger> getCustomQuery(@Param("gender") String gender, @Param("destination") String destination);
   // List<Passenger> findByGenderOrderByNameDesc(String gender);
}
