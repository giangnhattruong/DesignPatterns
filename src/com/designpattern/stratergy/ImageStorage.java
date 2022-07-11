package com.designpattern.stratergy;

public class ImageStorage {
	private Compressor compressor;
	private Filter filter;
	
	public void store(String fileName) {
		compressor.compress();
		filter.filter();
		
		System.out.println("Store successful!");
	}

	public void setCompressor(Compressor compressor) {
		this.compressor = compressor;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}
}
