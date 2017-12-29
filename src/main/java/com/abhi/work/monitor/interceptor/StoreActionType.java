package com.abhi.work.monitor.interceptor;

import java.io.Serializable;

public enum StoreActionType implements Serializable{

	ITEM_CREATION("CREATE ITEM","ATTEMPTED TO CREATE ITEM","ITEM CREATED SUCCESSFULLY","ITEM CREATION FAILED"),
	RETRIEVE_ITEM("RETRIEVE ITEM","ATTEMPTED TO RETRIEVE ITEM","ITEM RETRIEVED SUCCESSFULLY","ITEM RETRIEVAL FAILED"),
	DELETE_ITEM("DELETE ITEM","ATTEMPTED TO DELETE ITEM","ITEM DELETED SUCCESSFULLY","ITEM DELETION FAILED"),
	UPDATE_ITEM("UPDATE ITEM","ATTEMPTED TO UPDATE ITEM","ITEM UPDATED SUCCESSFULLY","ITEM UPDATION FAILED");
	
	private String actionType;
	private String attempt;
	private String success;
	private String failure;
	
	private StoreActionType(String actionType, String attempt, String success, String failure) {
		this.actionType = actionType;
		this.attempt = attempt;
		this.success = success;
		this.failure = failure;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAttempt() {
		return attempt;
	}

	public void setAttempt(String attempt) {
		this.attempt = attempt;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getFailure() {
		return failure;
	}

	public void setFailure(String failure) {
		this.failure = failure;
	}
	
	
}
