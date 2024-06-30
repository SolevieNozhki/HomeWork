public class Duck {
    String name;
    int age;
    String color;

    static int  footCount;

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void fly(){
        System.out.println(color+" утка по кличке "+name+" улетела в теплые края c "+footCount+" ногой(ами)");
    }
    static void fly(int footCount){
        Duck.footCount = footCount;
    }
}

