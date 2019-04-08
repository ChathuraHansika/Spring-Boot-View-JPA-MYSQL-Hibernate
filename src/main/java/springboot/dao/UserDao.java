package springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springboot.model.student;


import java.util.List;

/**
 * Created by Chathura on 4/7/2019.
 */
@Repository
@Transactional

public interface UserDao extends JpaRepository<student,Integer>{

//    @Transactional
//    @Modifying
//    @Query(value = "delete from springboot where Id=:id",nativeQuery = true)
//    public int allCustomer(@Param("id") int n);




}
