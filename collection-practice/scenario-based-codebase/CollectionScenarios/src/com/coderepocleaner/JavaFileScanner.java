package com.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

/**
 * JavaFileScanner ---------------- Scans directories recursively and collects
 * all .java files using Java NIO APIs.
 */
public class JavaFileScanner {

	public static List<Path> scan(String rootDir) throws IOException {

		List<Path> javaFiles = new ArrayList<>();

		Files.walk(Paths.get(rootDir)).filter(path -> path.toString().endsWith(".java")).forEach(javaFiles::add);

		return javaFiles;
	}
}
