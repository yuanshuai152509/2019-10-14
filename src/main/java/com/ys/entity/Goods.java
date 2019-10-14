package com.ys.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable{
/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
//	商品名称，商品价格，已售百分比，
	private int id;
	private String name;
	private BigDecimal price;
	private String baifen;
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", baifen=" + baifen + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getBaifen() {
		return baifen;
	}
	public void setBaifen(String baifen) {
		this.baifen = baifen;
	}

}
