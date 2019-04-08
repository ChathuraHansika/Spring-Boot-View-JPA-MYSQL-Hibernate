package springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import springboot.model.pencil;

/**
 * Created by Chathura on 4/8/2019.
 */
@Repository
public interface PencilDao extends JpaRepository<pencil,Integer> {

    @Query(value = "select student.studentName from student join bags on bags.studentId=student.studentId join pencil on pencil.bagId=bags.bagId where pencil.PID=2  ",nativeQuery = true)
    public String findPencilByStudentID();
}
