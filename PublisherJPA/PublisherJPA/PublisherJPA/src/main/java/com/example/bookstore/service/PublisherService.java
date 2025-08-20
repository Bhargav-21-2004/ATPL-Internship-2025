package com.example.bookstore.service;

import com.example.bookstore.model.Publisher;
import com.example.bookstore.repository.PublisherRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public Publisher createPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    public Publisher updatePublisher(Long id, String name) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow();
        publisher.setName(name);
        return publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id) {
        publisherRepository.deleteById(id);
    }
}
