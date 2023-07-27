package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

public class DogHandler {
    private DogsRepository itsDogRepo;
    public DogHandler(DogsRepository repo) {
        itsDogRepo = repo;
    }

    public long addDog(Dog theDog) {
        return itsDogRepo.save(theDog);
    }

    public long getNoOfDogs() {
        return itsDogRepo.count();
    }
    public boolean removeDog(long id){
        boolean res = false;
        Dog theDog = itsDogRepo.findById(id);
        if (theDog != null){
            res = itsDogRepo.delete(theDog);
        }
        return res;
    }

    public Dog getDogByName(String name) {
        Dog dog = new Dog();
        dog.setName(name);
        return itsDogRepo.findByName(dog).get(0);
    }

    public Dog getDogById(long id) { return itsDogRepo.findById(id); }
}
