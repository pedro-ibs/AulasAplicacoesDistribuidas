package br.edu.ifsp.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{
	private static final long serialVersionUID = 1L;

	private Date timestamp;
	private String messege;
	private String datails;
	
	public ExceptionResponse(Date timestamp, String messege, String datails) {
		super();
		this.timestamp	= timestamp;
		this.messege	= messege;
		this.datails	= datails;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessege() {
		return messege;
	}

	public String getDatails() {
		return datails;
	}

}
