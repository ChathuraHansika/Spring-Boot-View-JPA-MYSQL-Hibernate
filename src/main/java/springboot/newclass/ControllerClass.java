package springboot.newclass;

import org.hibernate.mapping.Bag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.dao.BagDao;
import springboot.dao.PencilDao;
import springboot.dao.UserDao;
import springboot.model.bags;
import springboot.model.pencil;
import springboot.model.student;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chathura on 4/7/2019.
 */
@RestController
public class ControllerClass {

    @Autowired
    UserDao userDao;

    @Autowired
    BagDao bagDao;

    @Autowired
    PencilDao pencilDao;

    @RequestMapping(value = "/get")
    public  String getName(){
        return "Hello Spring Boot Bro,What's Up?";
    }

    @RequestMapping(value = "/all")
    public  String all(){



        return "Hello Spring Boot Bro,What's Up?";
    }

    @RequestMapping(value = "/view")
    public String getView(){
        return "index";
    }

    @RequestMapping(value = "/ss")
    public @ResponseBody  List<String>  ss(){
        System.out.println("ssssssssssssssssssssssssssss");
        List<String> strings=new ArrayList<String>();
        strings.add("1");
        strings.add("1");
        strings.add("1");
        strings.add("1");
        return strings;
    }

    @RequestMapping(value = "/save")
    public String saveUser(){
        student student=new student();

        student.setStudentId(15);
        student.setStudentName("Springbobbbbbbbbbbbbbbbbbbbbbbbbbbot");

        userDao.save(student);

        bags bagss=new bags();
        bagss.setBagId(6);
        bagss.setBagName("springbag");
        bagss.setStudent(student);



        bagDao.save(bagss);

        pencil pencil=new pencil();
        pencil.setPID(3);
        pencil.setPencilName("homren");
        pencil.setBags(bagss);

        pencilDao.save(pencil);




        List<springboot.model.student> all = userDao.findAll();
        for (student s:
             all) {
            System.out.println("s.getStudentName() = " + s.getStudentName());
        }

        return "UserSaved";
    }

    @RequestMapping(value = "/find")
    public String find(){

        String pencilByStudentID = pencilDao.findPencilByStudentID();
        System.out.println("pencilByStudentID = " + pencilByStudentID);


        bags bagByStudentID = bagDao.findBagByStudentID(5);
        System.out.println("bagByStudentID.getBagId() = " + bagByStudentID.getBagId());


        springboot.model.pencil one = pencilDao.findOne(3);
        pencil one1 = pencilDao.findOne(3);
        bags one2 = bagDao.findOne(one1.getBags().getBagId());
        student one3 = userDao.findOne(one2.getStudent().getStudentId());
        return "STUDENT NAME : "+one3.getStudentName();


        
                        

    }

    @RequestMapping(value = "/delete")
    public String delete(){
        userDao.delete(2);
        return "User deleted";

    }


}
