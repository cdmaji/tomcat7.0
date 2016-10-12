package org.apache;

import java.io.File;

public class test {
	
	public static void main(String [] args ){
		File f=new File(System.getProperty("user.dir"), "bootstrap.jar");
		System.out.println(System.getProperty("user.dir"));
	}

}
