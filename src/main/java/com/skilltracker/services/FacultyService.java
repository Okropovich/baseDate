package com.skilltracker.services;

import com.skilltracker.models.Faculty;
import com.skilltracker.repositories.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Optional<Faculty> findFacultyById(Long id) {
        return facultyRepository.findById(id);
    }

    public List<Faculty> findAllFaculties() {
        return facultyRepository.findAll();
    }

    public void deleteFacultyById(Long id) {
        facultyRepository.deleteById(id);
    }
}