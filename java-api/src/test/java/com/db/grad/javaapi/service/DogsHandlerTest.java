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
    public void makeSureRepoIsEmpty() {
        itsDogRepo.deleteAll();
    }

    @Test
    public void add_a_dog_return_number_of_dogs_in_repo_is_one() {
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog(theDog);

        int expectedResult = 1;

        long actualResult = cut.getNoOfDogs();

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void update_dog_details_returns_dog_id() {
        // arrange
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Uno");
        cut.addDog(theDog);

        theDog = new Dog();
        theDog.setName("Dos");
        long expectedResult = cut.addDog(theDog);

        Dog dogToUpdate = theDog;
        theDog = new Dog();
        theDog.setName("Tres");
        cut.addDog(theDog);

        // act
        dogToUpdate.setName("Cuatro");
        long actualResult = cut.updateDogDetails(dogToUpdate);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void joes_test() {
        //intuitive, I know
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog(theDog);
        assertEquals(theDog, cut.getDogByName("Bruno"));
    }

    @Test
    public void testGetDogById() {
        DogHandler handler = new DogHandler(itsDogRepo);
        Dog dog1 = new Dog();
        handler.addDog(dog1);

        Dog dog2 = new Dog();
        handler.addDog(dog2);

        dog1 = handler.getDogById(dog1.getId());
        dog2 = handler.getDogById(dog2.getId());

        assertEquals(dog1.getId(), 1);
        assertEquals(dog2.getId(), 2);
    }

    @Test
    public void removeDogTest() {
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog(theDog);

        boolean curStatus = cut.removeDog(theDog.getId());
        long curResult = cut.getNoOfDogs();

        assertEquals(true, curStatus);
        assertEquals(0, curResult);
    }
}