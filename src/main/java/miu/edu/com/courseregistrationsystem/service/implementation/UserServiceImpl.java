package miu.edu.com.courseregistrationsystem.service.implementation;

import miu.edu.com.courseregistrationsystem.domain.Admin;
import miu.edu.com.courseregistrationsystem.domain.Faculty;
import miu.edu.com.courseregistrationsystem.domain.Student;
import miu.edu.com.courseregistrationsystem.repository.AdminRepository;
import miu.edu.com.courseregistrationsystem.repository.FacultyRepository;
import miu.edu.com.courseregistrationsystem.repository.StudentRepository;
import miu.edu.com.courseregistrationsystem.repository.UserRepository;
import miu.edu.com.courseregistrationsystem.service.AdminService;
import miu.edu.com.courseregistrationsystem.service.FacultyService;
import miu.edu.com.courseregistrationsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements StudentService, FacultyService, AdminService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    FacultyRepository facultyRepository;
    @Override
    public Admin save(Admin admin) {
        return userRepository.save(admin);
    }


    @Override
    public Faculty save(Faculty faculty) {
        return  userRepository.save(faculty);

    }

    @Override
    public List<Faculty> getAllFaculty() {
        return facultyRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Admin> all() {
        return adminRepository.findAll();
    }

//    @Override
//    public Student findById(int id) {
//        return studentRepository.findById(id);
//    }

}
