package package1;

public class Person {
   private String name;
   private String post;
   private String placeWork;
   private int age;
   private  int money;

    public Person(){}

    private Person(int money, int age, String placeWork, String post, String name) {
        this.money = money;
        this.age = age;
        this.placeWork = placeWork;
        this.post = post;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPost(String post){}
    public String getPost(){
        return post;
    }

    public void setPlaceWork(String PlaceWrok){}
    public String getPlaceWork(){
        return placeWork;
    }

    public void setAge(int age){}
    public int getAge(){
        return age;
    }

    public void setMoney(int money){}
    public int getMoney(){
        return money;
    }

    public void print(){
        System.out.println(name);
    }
}
