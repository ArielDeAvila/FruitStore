package Models;

import java.util.Date;

/**
 * Clase que define a una persona
 * @author Ariel De avila
 */
public class Person {
    //Campos
    protected String name;
    protected String lastName1;
    protected String lastName2;
    protected Date dateBirth;

    /**
     * Constructor para la clase persona
     * @param name Paramentro que establece el nombre de la persona
     * @param lastName1 Parametro que establece el primer apellido de la persona
     * @param lastName2 Parametro que establece el segundo apellido de la persona
     * @param dateBirth Parametro que establece el día de nacimiento de la persona
     */
    public Person(String name,String lastName1,String lastName2,Date dateBirth){
        this.name=name;
        this.lastName1=lastName1;
        this.lastName2=lastName2;
        this.dateBirth = dateBirth;

    }

    /**
     * Metodo que permite modificar el nombre de la persona
     * @param name Parametro con el nuevo de la persona
     */
    public void modifyName(String name) {
        this.name = name;
    }

    /**
     * Metodo que permite obtener el nombre de la persona
     * @return Nombre de la persona
     */
    public String getName() {
        return name;
    }
}
