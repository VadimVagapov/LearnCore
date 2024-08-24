package vagapov.core.block_six.model;

import java.util.List;
import java.util.Objects;

public class User {
    /**
     * Идентификатор пользователя
     */
    private Integer id;

    /**
     * Права пользователя
     */
    private List<String> rights;

    /**
     * Имя пользователя
     */
    private String name;

    /**
     * Название страны
     */
    private String country;

    /**
     * Название города
     */
    private String city;

    /**
     * Название улицы
     */
    private String street;

    /**
     * Номер дома
     */
    private Integer houseNumber;

    /**
     * Признак заблокированного пользователя
     */
    private Boolean locked;

    public User() {
    }

    public User(Integer id,
                List<String> rights,
                String name,
                String country,
                String city,
                String street,
                Integer houseNumber,
                Boolean locked) {
        this.id = id;
        this.rights = rights;
        this.name = name;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.locked = locked;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getRights() {
        return rights;
    }

    public void setRights(List<String> rights) {
        this.rights = rights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", rights=" + rights +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", locked=" + locked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(rights, user.rights) && Objects.equals(name, user.name) && Objects.equals(country, user.country) && Objects.equals(city, user.city) && Objects.equals(street, user.street) && Objects.equals(houseNumber, user.houseNumber) && Objects.equals(locked, user.locked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rights, name, country, city, street, houseNumber, locked);
    }
}
