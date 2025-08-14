package com.example.service;
import com.example.exception.StudentNotFoundException;
import com.example.model.Student;
import com.example.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private static final Long Long = null;
	private final StudentRepository repo;
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
    	return repo.findAll();
    	}

    public Student getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }

    public Student create(Student s) {
        s.setId(Long); 
        return repo.save(s);
    }

    public Student update(Long id, Student s) {
        Student existing = getById(id);
        existing.setName(s.getName());
        existing.setEmail(s.getEmail());
        existing.setCourse(s.getCourse());
        return repo.save(existing);
    }

    public void delete(Long id) {
        if (!repo.findById(id).isPresent()) throw new StudentNotFoundException(id);
        repo.deleteById(id);
    }
}
