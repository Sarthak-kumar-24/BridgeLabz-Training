package com.coderepocleaner;

import java.io.File;
import java.nio.file.Path;
import java.util.*;

/**
 * FileCategorizer ---------------- Categorizes Java files into VALID, WARNINGS,
 * and ERRORS using Map.
 */
public class FileCategorizer {

	public static Map<FileType, List<File>> categorize(List<Path> paths) {

		Map<FileType, List<File>> result = new EnumMap<>(FileType.class);

		for (FileType type : FileType.values()) {
			result.put(type, new ArrayList<>());
		}

		for (Path path : paths) {
			File file = path.toFile();
			FileType type = CodeAnalyzer.analyze(file);
			result.get(type).add(file);
		}

		return result;
	}
}