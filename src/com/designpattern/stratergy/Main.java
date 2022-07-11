package com.designpattern.stratergy;

import java.util.Scanner;

public class Main {
	private static final int COMPRESSOR_JPEG = 1;
	private static final int COMPRESSOR_PNG = 2;
	private static final int FILTER_BW = 1;
	private static final int FILTER_HS = 2;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please select a compressor:\n" +
				"1. JPEG\n" +
				"2. PNG");
		int compressorOption = scanner.nextInt();
		
		System.out.println("Please select a filter:\n" +
				"1. Black and white\n" +
				"2. High contrast");
		int filterOption = scanner.nextInt();
		
		ImageStorage imageStorage = new ImageStorage();
		
		if (compressorOption == COMPRESSOR_JPEG) {
			imageStorage.setCompressor(new JpegCompressor());
			
			switch(filterOption) {
			case FILTER_BW:
				imageStorage.setFilter(new BWFilter());
				break;
			case FILTER_HS:
				imageStorage.setFilter(new HSFilter());
				break;
			default:
			}
		} else if (compressorOption == COMPRESSOR_PNG) {
			imageStorage.setCompressor(new PngCompressor());
			
			switch(filterOption) {
			case FILTER_BW:
				imageStorage.setFilter(new BWFilter());
				break;
			case FILTER_HS:
				imageStorage.setFilter(new HSFilter());
				break;
			default:
			}			
		}
		
		imageStorage.store("Test");
		
		scanner.close();
	}

}
