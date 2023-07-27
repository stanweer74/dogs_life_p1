package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DogsHandlerTest {
    private DogsRepository itsDogRepo = new DogsRepositoryStub();

    @BeforeEach
    public void makeSureRepoIsEmpty(){
        itsDogRepo.deleteAll();
    }
    @Test
    public void add_a_dog_return_number_of_dogs_in_repo_is_one(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );

        int expectedResult = 1;

        long actualResult = cut.getNoOfDogs();

        assertEquals( expectedResult, actualResult );

    }

    @Test
    void update_dog_details() {
        // arrange
        Dog oldDog = new Dog();
        oldDog.setId(1);
        oldDog.setName("Uno");

        DogsRepositoryStub cut = new DogsRepositoryStub();
        Dog theDog = new Dog();
        theDog.setName("Dos");
        cut.save(theDog);
        theDog = new Dog();
        theDog.setName("Tres");
        cut.save( theDog );

        // act
        cut.save(oldDog);
        Dog actualDog = cut.findById(1);

        // assert
        assertEquals(oldDog.getName(), actualDog.getName());
        assertEquals(oldDog.getId(), actualDog.getId());
    }

}


