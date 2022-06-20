public class Main {

    public static void main(String[] args){
        Tiger tiger = new Tiger("老虎",6,"6KG");
        System.out.println("name:" + tiger.name);
        System.out.println("age:" + tiger.age);
        System.out.println("weight:" + tiger.weight);
        tiger.run();
        tiger.eat();
        tiger.cry();
    }
}
