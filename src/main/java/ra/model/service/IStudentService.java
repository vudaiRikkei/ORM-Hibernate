package ra.model.service;

import ra.model.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student findById(Long id);

    void deleteById(Long id);

    void save(Student s);
    void  update(Student s);

}
