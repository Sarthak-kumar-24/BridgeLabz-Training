package com.functionalinterfaces.dataserializationforbackup;

import java.io.*;

/*
 * BackupProcessor
 * ---------------
 * Performs backup only for
 * classes marked as Backupable.
 */
public class BackupProcessor {

	public static void backupObject(Object obj) {

		// Check marker interface at runtime
		if (!(obj instanceof Backupable)) {
			System.out.println(" Object not eligible for backup");
			return;
		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.dat"))) {

			oos.writeObject(obj);
			System.out.println(" Backup completed successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
