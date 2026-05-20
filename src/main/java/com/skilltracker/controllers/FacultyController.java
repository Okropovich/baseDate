package com.skilltracker.controllers;

import com.skilltracker.models.Faculty;
import com.skilltracker.services.FacultyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.saveFaculty(faculty);
    }

    @GetMapping("/{id}")
    public Optional<Faculty> getFacultyById(@PathVariable Long id) {
        return facultyService.findFacultyById(id);
    }

    @GetMapping
    public List<Faculty> getAllFaculties() {
        return facultyService.findAllFaculties();
    }

    @PutMapping("/{id}")
    public Faculty updateFaculty(@PathVariable Long id, @RequestBody Faculty faculty) {
        faculty.setId(id);
        return facultyService.saveFaculty(faculty);
    }

    @DeleteMapping("/{id}")
    public void deleteFaculty(@PathVariable Long id) {
        facultyService.deleteFacultyById(id);
    }
}