package com.designpattern.stratergy;

public class PngCompressor implements Compressor {

	@Override
	public void compress() {
		System.out.println("Compressing PNG");
	}

}
