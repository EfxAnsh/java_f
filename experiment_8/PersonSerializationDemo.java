package experiment_8;
import java.io.*;

class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PersonSerializationDemo {
    public static void main(String[] args) {
        Person person = new Person("John", 25);

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(person);
            System.out.println("Person object serialized.");
        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person:");
            System.out.println("Name: " + deserializedPerson.name);
            System.out.println("Age: " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization.");
        }
    }
}
