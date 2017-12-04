package com.talooz.ms.finance.common.model;

import java.io.Serializable;

import org.springframework.data.domain.Sort.Direction;

public class Page implements Serializable {

	private static final long serialVersionUID = 1L;

	private int pageNo;
	private int itemsPerPage;
	private String sortColumn;
	private String orderType;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getItemsPerPage() {
		return itemsPerPage;
	}

	public void setItemsPerPage(int itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	public String getSortColumn() {
		return sortColumn;
	}

	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Direction getSortOrder() {
		if (this.orderType.equalsIgnoreCase("asc")) {
			return Direction.ASC;
		} else {
			return Direction.DESC;
		}
	}
}
