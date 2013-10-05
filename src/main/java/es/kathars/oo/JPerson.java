package es.kathars.oo;

public class JPerson {

    private String name;

    private Integer age;

    public JPerson(String name, Integer age) {
	this.name = name;
	this.age = age;
    }

    public String getName() {
	return this.name;
    }

    public Integer getAge() {
	return this.age;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setAge(Integer age) {
	this.age = age;
    }
}
