package com.filesharing.dtos;

public class TableRecord {

	private String server;
	private int port;
	private String userName;

	public TableRecord(String server, int port, String userName) {
		this.server = server;
		this.port = port;
		this.userName = userName;
	}
	
	public TableRecord() {
		
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "TableRecord [server=" + server + ", port=" + port + ", userName=" + userName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + port;
		result = prime * result + ((server == null) ? 0 : server.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
			
		if (obj == null) {
			return false;
		}
			
		if (getClass() != obj.getClass()) {
			return false;
		}
			
		TableRecord other = (TableRecord) obj;
		if (port != other.port) {
			return false;
		}
			
		if (server == null) {
			if (other.server != null)
				return false;
		} else if (!server.equals(other.server))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

}
