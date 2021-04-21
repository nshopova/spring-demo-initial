package bg.proxiad.demo.spring.model;

public class Student {
	private String name;
	private Double assesment;
	private boolean courseProject;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAssesment() {
		return assesment;
	}

	public void setAssesment(Double assesment) {
		this.assesment = assesment;
	}

	public boolean isCourseProject() {
		return courseProject;
	}

	public void setCourseProject(boolean courseProject) {
		this.courseProject = courseProject;
	}
}
