package com.example.java_web_final_project;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatService {

    private final CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public void add(Cat cat) {
        catRepository.save(cat);
    }

    public boolean delete(int id) {
        catRepository.deleteById(id);
        return true;
    }

    public List<Cat> getAll() {
        return catRepository.findAll();
    }

    public void update(Cat cat1, int id) {
        Optional<Cat> cat = catRepository.findById(id);
        if(cat.isPresent()) {
            // retrieving that cat and assigning it as the value of catToUpdate
            Cat catToUpdate = cat.get();

            // updating the cat's instance fields and saving
            catToUpdate.setName(cat1.getName());
            catToUpdate.setBreed(cat1.getBreed());
            catRepository.save(catToUpdate);
        }
    }

//    public Cat findById(int catId) {
//        return catRepository.findById(catId);
//    }

    /*
    // public List<Cat> getAll() {
        return catRepository.findAll();
    }

    */
}
