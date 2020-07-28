package com.mayur.spring.propertiesplaceholder;

public class Server {

	private String server;
	private String user;
	private String pass;

	public Server(String server, String user, String pass) {
		super();
		this.server = server;
		this.user = user;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Server [server=" + server + ", user=" + user + ", pass=" + pass + "]";
	}

}
