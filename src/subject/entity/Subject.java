package subject.entity;

public class Subject {
	@Override
	public String toString() {
		return "Subject [name=" + name + ", classhour=" + classhour + ", majorid=" + majorid + "]";
	}
	private String name;
	private int classhour;
	private int majorid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClasshour() {
		return classhour;
	}
	public void setClasshour(int classhour) {
		this.classhour = classhour;
	}
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}


}
