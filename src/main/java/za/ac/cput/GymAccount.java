package za.ac.cput;


/**
 *
 * @author Plamedie Bitota Bukasa 219260532
 */


public class GymAccount
{
    public int id;
    public String name;
    public String surname;
    public String contractType;

    public GymAccount(int od,String name,String surname,String contractType) {
        this.id = id;
        this.name=name;
        this.surname=surname;
        this.contractType=contractType;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GymAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType='" + contractType + '\'' +
                '}';
    }
}
