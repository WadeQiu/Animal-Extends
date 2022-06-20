public class Animal {
    public String name;
    public int age;
    public String weight;

    public Animal(String name, int age, String weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void run(){
        System.out.println("I can run !");
    }

    public void eat(){
        System.out.println("I can eat !");
    }
}
