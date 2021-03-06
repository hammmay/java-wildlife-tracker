import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class EndangeredAnimalTest {
  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void endangeredAnimal_instantiatesCorrectly_true() {
    EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    assertEquals(true, testEndangeredAnimal instanceof EndangeredAnimal);
  }

//new
  @Test
  public void getName_endangeredAnimalInstantiatesWithName_Fox() {
    EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    assertEquals("Fox", testEndangeredAnimal.getName());
  }

//new
  @Test
  public void getAge_endangeredAnimalInstantiatesWithAge_Young() {
    EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    assertEquals("Young", testEndangeredAnimal.getAge());
  }

//new
  @Test
  public void equals_returnsTrueIfNameIsTheSame() {
    EndangeredAnimal firstEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    EndangeredAnimal anotherEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    assertTrue(firstEndangeredAnimal.equals(anotherEndangeredAnimal));
  }

  @Test
  public void getHealth_returnsHealthAttribute_true() {
    EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    assertEquals("Healthy", testEndangeredAnimal.getHealth());
  }

  @Test
  public void save_assignsIdAndSavesObjectToDatabase_true() {
    EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    testEndangeredAnimal.save();
    EndangeredAnimal savedEndangeredAnimal = (EndangeredAnimal) EndangeredAnimal.all().get(0);
    assertEquals(testEndangeredAnimal.getId(), savedEndangeredAnimal.getId());
  }

  @Test
  public void all_returnsAllInstancesOfEndangeredAnimal_true() {
    EndangeredAnimal firstEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    firstEndangeredAnimal.save();
    EndangeredAnimal secondEndangeredAnimal = new EndangeredAnimal("Badger", "Okay", "Adult");
    secondEndangeredAnimal.save();
    assertEquals(true, EndangeredAnimal.all().get(0).equals(firstEndangeredAnimal));
    assertEquals(true, EndangeredAnimal.all().get(1).equals(secondEndangeredAnimal));
  }

  @Test
  public void find_returnsAnimalWithSameId_secondAnimal() {
    EndangeredAnimal firstEndangeredAnimal = new EndangeredAnimal("Fox", "Healthy", "Young");
    firstEndangeredAnimal.save();
    EndangeredAnimal secondEndangeredAnimal = new EndangeredAnimal("Badger", "Okay", "Adult");
    secondEndangeredAnimal.save();
    assertEquals(EndangeredAnimal.find(secondEndangeredAnimal.getId()), secondEndangeredAnimal);
  }

}
