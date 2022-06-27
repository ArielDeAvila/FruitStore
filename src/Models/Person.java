package Models;

import java.util.Date;

public class Person {
    protected String name;
    protected String lastName1;
    protected String lastName2;
    protected Date dateBirth;

    public Person(String name,String lastName1,String lastName2,Date dateBirth){
        this.name=name;
        this.lastName1=lastName1;
        this.lastName2=lastName2;
        this.dateBirth = dateBirth;

    }

    public void modifyName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
