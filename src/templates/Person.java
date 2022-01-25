package templates;

import java.time.LocalDate;

/**
 *
 * @author onlyb
 */
public class Person {
    
    private int document;
    private int uniqueLaborIdentificationCode;
    private String lastName;
    private String firtName;
    private String nationality;
    private String residence;
    private LocalDate dateOfBirth;
    private char sex;

    public Person() {
        this.document = 0;
        this.uniqueLaborIdentificationCode = 0;
        this.lastName = "";
        this.firtName = "";
        this.nationality = "";
        this.residence = "";
        this.dateOfBirth = null;
        this.sex = ' ';
    }

    public Person(int document, int uniqueLaborIdentificationCode, String lastName, String firtName, String nationality, String residence, LocalDate dateOfBirth, char sex) {
        this.document = document;
        this.uniqueLaborIdentificationCode = uniqueLaborIdentificationCode;
        this.lastName = lastName;
        this.firtName = firtName;
        this.nationality = nationality;
        this.residence = residence;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public int getUniqueLaborIdentificationCode() {
        return uniqueLaborIdentificationCode;
    }

    public void setUniqueLaborIdentificationCode(int uniqueLaborIdentificationCode) {
        this.uniqueLaborIdentificationCode = uniqueLaborIdentificationCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "\tInformacion Personal\n"
                + "DNI:" + document + "n"
                + "CUIL:" + uniqueLaborIdentificationCode + "\n"
                + "Apellido y Nombre:" + lastName + " " + firtName + "\n"
                + "Nacionalidad:" + nationality + "\n"
                + "Residencia:" + residence + "\n"
                + "Fecha de Nacimiento:" + dateOfBirth.toString() + "\n"
                + "Sexo:" + sex + "\n";
        
    }
    
}
