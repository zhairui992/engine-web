package org.zr.web.utils;

import java.util.UUID;

public class Tools {
	
	public static String uuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
