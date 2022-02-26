package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Raccourci;
import com.bezkoder.springjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RaccourciRepository extends JpaRepository<Raccourci,Integer> {

    @Query(value = "SELECT * FROM raccourci where projet_id=:id",nativeQuery = true)
    public List<Raccourci> findRaccourciByIdProject(@Param("id") Integer id);
}
