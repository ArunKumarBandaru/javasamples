package BookMyShow.modal;

import java.util.List;


public class Theater {
	
	List<Screen> listofscreens;
	Region region;
	int theaterId;
	
	public List<Screen> getListofscreens() {
		return listofscreens;
	}
	public void setListofscreens(List<Screen> listofscreens) {
		this.listofscreens = listofscreens;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

}
