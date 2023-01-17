package ua.hillel.tests.restTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.rest.PetController;
import ua.hillel.rest.entities.Pet;
import ua.hillel.rest.entities.User;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PetRestTest {
  @Test
  public void petRestTest() throws IOException {
    PetController petController = new PetController();
//    petController.findByStatus("available");


    int code = petController.createNewPet();
    Assert.assertEquals(code, 200);


    String newId = petController.createNewPetWithJson("JsonPet");
    Assert.assertTrue(newId != null && !newId.isEmpty());


    Pet pet = new Pet();
    pet.setId(111222);
    pet.setName("GsonPet");
    pet.setStatus("pending");

    Pet newPet = petController.createNewPetWithGSON(pet);

    Assert.assertTrue(newPet.equals(pet));

  }
}
