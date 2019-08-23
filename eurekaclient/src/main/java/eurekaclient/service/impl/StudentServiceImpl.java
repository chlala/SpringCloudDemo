package eurekaclient.service.impl;


import eurekaclient.entity.Student;
import eurekaclient.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    private static Map<Integer, Student> studentMap;

    static {
        studentMap=new HashMap<>();
        studentMap.put(1,new Student(1,"张三",20));
        studentMap.put(2,new Student(2,"李四",22));
        studentMap.put(3,new Student(3,"王五",45));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMap.remove(id);
    }
}
