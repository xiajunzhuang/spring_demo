package com.xiajunzhuang.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
    private String username;
    private String pwd;
    private Integer age;
    private Address address;
    private List<String> courses;
    private Set<String> cars;
    private Map<String,String> infos;
    private Properties properties;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", courses=" + courses +
                ", cars=" + cars +
                ", infos=" + infos +
                ", properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, String> getInfos() {
        return infos;
    }

    public void setInfos(Map<String, String> infos) {
        this.infos = infos;
    }

    public User() {
    }

    public User(String username, String pwd, Integer age, Address address, List<String> courses, Set<String> cars) {
        this.username = username;
        this.pwd = pwd;
        this.age = age;
        this.address = address;
        this.courses = courses;
        this.cars = cars;
    }

    public Set<String> getCars() {
        return cars;
    }

    public void setCars(Set<String> cars) {
        this.cars = cars;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
