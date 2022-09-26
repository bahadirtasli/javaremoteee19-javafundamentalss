package examples.objects;

public class ObjectExample {
    public String name;
    public int a;

    //Non-paranterized constructor or Normal constructor
    public ObjectExample() {
        System.out.println("Constructing Object Example..");
        name = "Bahadir Tasli";
        a = 6;
    }
        //Parameterized Constructor
        public ObjectExample2(int age, String name) {
            System.out.println(age);
            System.out.println(name);

    }
}