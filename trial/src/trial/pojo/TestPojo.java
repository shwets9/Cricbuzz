package trial.pojo;

public class TestPojo {
	int ID;
	String Title;
	
	public TestPojo() {
		super();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	@Override
	public String toString() {
		return "" + Title;
	}

	public TestPojo(int iD, String title) {
		super();
		ID = iD;
		Title = title;
	}
	
	
	

}
