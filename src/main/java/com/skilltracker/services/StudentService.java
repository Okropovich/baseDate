package com.skilltracker.services;

import com.skilltracker.models.Student;
import com.skilltracker.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    // Внедрение через конструктор
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Создать или обновить студента
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Найти студента по ID
    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Найти всех студентов
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    // Удалить студента по ID
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}