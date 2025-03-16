import java.time.OffsetDateTime;

public class Person {
    private final String name;
    private int age;

    private int lastYearAgeIncs = OffsetDateTime.now().getYear();

    public Person(String name){
        this.name = name;
        this.age = 1;
    }

    public String getName(){
        return this.name;
    }
    // public void setName(String name){
    //     this.name = name;
    // }

    public int getAge(){
        return this.age;
    }   
    public void setAge(int age){
        this.age = age;
    }

    public void incAge(){
        if(this.lastYearAgeIncs >= OffsetDateTime.now().getYear()) return;
        //return encerra a execução do método
        this.age++;
        this.lastYearAgeIncs = OffsetDateTime.now().getYear();
    }
}
