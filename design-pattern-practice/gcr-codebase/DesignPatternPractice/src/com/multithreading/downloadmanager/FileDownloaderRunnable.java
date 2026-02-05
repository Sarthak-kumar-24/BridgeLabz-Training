package com.multithreading.downloadmanager;

public class FileDownloaderRunnable implements Runnable {
	private String fileName;

	// Constructor
	public FileDownloaderRunnable(String fileName) {
		this.fileName = fileName;
	}

	// Download simulation logic
	@Override
	public void run() {
		try {
			for (int progress = 0; progress <= 100; progress += 25) {

				System.out.println(
						"[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + progress + "%");

				// Random delay
				Thread.sleep((int) (Math.random() * 1000));
			}
		} catch (InterruptedException e) {
			System.out.println("Download interrupted for " + fileName);
		}
	}

}
