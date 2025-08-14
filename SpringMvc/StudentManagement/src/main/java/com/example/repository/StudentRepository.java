package com.example.repository;
import com.example.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class StudentRepository {
    private final Map<Long, Student> store = new LinkedHashMap<>();
    private final AtomicLong idGen = new AtomicLong(1);

    public List<Student> findAll() {
        return new ArrayList<>(store.values());
    }
    public Optional<Student> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
    public Student save(Student s) {
        if (s.getId() == null) {
            s.setId(idGen.getAndIncrement());
        }
        store.put(s.getId(), s);
        return s;
    }
    public void deleteById(Long id) {
        store.remove(id);
    }
}
