package com.designpattern.stratergy;

public class JpegCompressor implements Compressor {

	@Override
	public void compress() {
		System.out.println("Compressing JPEG");
	}

}
