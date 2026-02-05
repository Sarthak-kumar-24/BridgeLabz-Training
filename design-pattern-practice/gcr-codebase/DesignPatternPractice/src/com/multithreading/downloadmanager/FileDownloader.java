package com.multithreading.downloadmanager;

public class FileDownloader extends Thread {
	private String fileName;

	// Constructor
	public FileDownloader(String fileName) {
		this.fileName = fileName;
	}

	
	@Override
	public void run() {
		try {
			for (int progress = 0; progress <= 100; progress += 25) {

				// Print current thread name and progress
				System.out.println(
						"[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + progress + "%");

				// Random delay to simulate download time
				Thread.sleep((int) (Math.random() * 1000));
			}
		} catch (InterruptedException e) {
			System.out.println("Download interrupted for " + fileName);
		}
	}

}
