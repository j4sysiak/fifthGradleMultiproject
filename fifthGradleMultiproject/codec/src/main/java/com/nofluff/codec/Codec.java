package com.nofluff.poetry.codec;

import org.apache.commons.codec.binary.Base64;

public class Codec {

	public String encode(String text) {
		Base64 codec = new Base64();
		return new String(codec.encode(text.getBytes()));
	}
 
}
 