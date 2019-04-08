package springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import springboot.model.bags;

/**
 * Created by Chathura on 4/8/2019.
 */
@Repository
public interface BagDao extends JpaRepository<bags,Integer> {

    @Query( value = "select *  from bags where  studentId  =:id",nativeQuery = true)
    public bags findBagByStudentID(@Param("id") int studentID);
}
