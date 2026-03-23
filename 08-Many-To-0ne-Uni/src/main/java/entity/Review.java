package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Review {
	
	
	@Id
	
	private int rid;
	private String msg;
	public int getRid() {
		return rid;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne
	private Product product;
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	

}
