package eurekaclient.service;

import eurekaclient.entity.Student;

import java.util.Collection;

public interface StudentService {

    Collection<Student> findAll();

    Student findById(Integer id);

    void saveOrUpdate(Student student);

    void deleteById(Integer id);


}
