package com.tnsif.Assignment1;

public class Developer extends Employee
{
	private String currentProject;
    private String programmingLanguage;
    
    public Developer(String name, int employeeId, double salary, 
	         String currentProject, String programmingLanguage) {
super(name, employeeId, salary);
this.currentProject = currentProject;
this.programmingLanguage = programmingLanguage;
}

	public String getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
    
    

}
