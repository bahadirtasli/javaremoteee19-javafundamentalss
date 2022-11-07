import generics.*;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //GENERIC TYPE
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("Green");
        fruit.setPrice(BigDecimal.valueOf(1.99)); //converting a double to BigDecimal


        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);
        System.out.println(genericFoodWithFruit.getItem());

        String str = "I'm a great developer";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I'm a good person!");
        System.out.println(genericFoodWithString.getItem());

        //Generic type extends
        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());

        //Generic type - interface
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(3);
        System.out.println("Snack 1 is better than Snack 2 : " + snack1.isBetter(snack2));


        //LIST

        List<String> animalList = new ArrayList<>();
        animalList.add("Lion"); //0
        animalList.add("Tiger"); //1
        animalList.add("Dog"); //2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Panda");


        System.out.println(animalList.get(1)); //prints tiger

        animalList.remove(1); // tiger will be deleted
        animalList.remove("Dog");


        for (String animal : animalList) {
            System.out.println(animal);
        }

        Iterator<String> stringIterator = animalList.listIterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + ",");
        }

        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);

        for (String animal : animalList) {
            System.out.println(animal);
        }

        //SET

        Set<String> countrySet = new HashSet<>(); //Non-sorted, randomly stored
        countrySet.add("Eesti");
        countrySet.add("Saksamaa");
        countrySet.add("Poola");
        countrySet.add("Rootsi");
        // countrySet.add("Eesti"); -> Duplicate not allowed!

        for (String country : countrySet){
            System.out.println(country);
        }

        System.out.println("Before sorting : " + countrySet);
        TreeSet<String> countryTreeSet = new TreeSet(countrySet); // Stored as Sorted
        System.out.println("After sorting : " + countryTreeSet);


        //MAP
        Map<String,String> fullName = new HashMap<>(); // Not stored as sorted
        fullName.put("Bahadir", "Tasli");
        fullName.put("Martti","Triksberg");
        fullName.put("Marko", "Piir");
        //fullName.put("Marko", "Ennuste"); - > not possible as one key assign to one value. duplicate key not allowed.
        System.out.println(fullName);

        System.out.println(fullName.get("Bahadir"));
        System.out.println(fullName.remove("Marko"));
        System.out.println(fullName);

        Map<String, Integer > ageMap = new HashMap<>();
        ageMap.put("Bahadir", 15);
        ageMap.put("Marko", 15);

        //Map of List
        Map<String, List<String>> friendsMap = new HashMap<>();
        List<String> bahadirFriendList = List.of("Tony","Mark","Antony");
        List<String> mariaFriendList = List.of("Angelin,", "Aivi", "Eva");
        friendsMap.put("Bahadir",bahadirFriendList);
        friendsMap.put("Maria",mariaFriendList);

        //Map of map
        Map<String , Map<String, String>> detailsMap = new HashMap<>();
        Map<String,String> bahadirInfoMap = new HashMap<>();
        bahadirInfoMap.put("age","15");
        bahadirInfoMap.put("birthPlace", "Turkey");
        bahadirInfoMap.put("residence","Estonia");
        bahadirInfoMap.put("phone","123456");
        detailsMap.put("Bahadir",bahadirInfoMap);

        //I/O

        File absolutFile = new File("C:\\Users\\Ceyda\\IdeaProjects\\java-advanced\\src\\resources\\myText.txt");
        File relativeFile = new File("myText.txt");

        //File Reading
        try {
            FileReader fileReader = new FileReader(absolutFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine; //To store the line of text from the file

            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter(absolutFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String fileLine = "\n I can write an error-less Java code :D" ;
            bufferedWriter.write(fileLine);
            bufferedWriter.flush();
            bufferedWriter.close();


        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Serialization : Writing an object to a file

        String fileName = "file.ser";

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);

            outputStream.writeObject(fruit);
            outputStream.close();
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Deserialization : To get/read an object from a file.
        Fruit deserializedFruit = null;
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream inputStream = new ObjectInputStream(file);

            deserializedFruit = (Fruit) inputStream.readObject();

            inputStream.close();
            file.close();

            System.out.println(deserializedFruit.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //New I/0
        Path absolutePath = Paths.get("C:\\Users\\Ceyda\\IdeaProjects\\java-advanced\\src\\resources\\myText.txt");
        Path relativePath = Paths.get("myText.txt");

        try {
            //File Reading
            List<String> fileLines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);
            for (String fileLine : fileLines) {
                System.out.println(fileLine);
            }

            //File writing
            List<String> fileLinesToWrite = List.of("I love Java", "Estonia is my country!");
            Files.write(absolutePath, fileLinesToWrite, StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}