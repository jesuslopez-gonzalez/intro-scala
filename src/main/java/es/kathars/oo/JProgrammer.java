package es.kathars.oo;

import java.util.List;

public class JProgrammer extends JPerson {
    
    private List<String> skills;

    public JProgrammer(String name, Integer age, List<String> skills) {
	super(name, age);
	this.skills = skills;
    }

    public List<String> getSkills() {
	return this.skills;
    }

    public void setSkills(List<String> skills) {
	this.skills = skills;
    }
}
