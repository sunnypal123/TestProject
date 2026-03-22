package entity;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Engine {
	@Id
	
	private int eid;
	private int cc;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
	

}
