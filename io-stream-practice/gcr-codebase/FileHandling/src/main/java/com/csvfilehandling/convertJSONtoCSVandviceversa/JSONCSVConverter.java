package com.csvfilehandling.convertJSONtoCSVandviceversa;

import java.io.*;
import java.util.*;

//------------------------------------------------------------
//Program Name : JSONCSVConverter_NoLibrary
//Description  : Converts student data from JSON to CSV and
//           back to JSON WITHOUT using Maven or libraries.
//Author       : Your Name
//------------------------------------------------------------

public class JSONCSVConverter {

	public static void main(String[] args) throws Exception {

		List<Student> students = readJson("O:\\New folder\\students.json");
		writeCsv(students, "students.csv");
		readCsvAndWriteJson("students.csv", "students_from_csv.json");
	}

	// ------------------------------------------------------------
	// Read JSON file manually and create Student objects
	// ------------------------------------------------------------
	private static List<Student> readJson(String file) throws IOException {

		List<Student> students = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader(file));
		String json = br.readLine(); // single-line JSON
		br.close();

		json = json.replace("[", "").replace("]", "");
		String[] objects = json.split("\\},\\{");

		for (String obj : objects) {

			obj = obj.replace("{", "").replace("}", "");
			String[] fields = obj.split(",");

			int id = 0, age = 0, marks = 0;
			String name = "";

			for (String field : fields) {
				String[] pair = field.split(":");
				String key = pair[0].replace("\"", "").trim();
				String value = pair[1].replace("\"", "").trim();

				switch (key) {
				case "id":
					id = Integer.parseInt(value);
					break;
				case "name":
					name = value;
					break;
				case "age":
					age = Integer.parseInt(value);
					break;
				case "marks":
					marks = Integer.parseInt(value);
					break;
				}
			}

			students.add(new Student(id, name, age, marks));
		}

		return students;
	}

	// ------------------------------------------------------------
	// Write Student objects to CSV
	// ------------------------------------------------------------
	private static void writeCsv(List<Student> students, String file) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("ID,Name,Age,Marks");
		bw.newLine();

		for (Student s : students) {
			bw.write(s.id + "," + s.name + "," + s.age + "," + s.marks);
			bw.newLine();
		}

		bw.close();
		System.out.println("JSON -> CSV done");
	}

	// ------------------------------------------------------------
	// Read CSV and convert back to JSON
	// ------------------------------------------------------------
	private static void readCsvAndWriteJson(String csv, String json) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(csv));
		BufferedWriter bw = new BufferedWriter(new FileWriter(json));

		bw.write("[\n");
		String line;
		boolean isHeader = true;
		boolean first = true;

		while ((line = br.readLine()) != null) {

			if (isHeader) {
				isHeader = false;
				continue;
			}

			String[] d = line.split(",");

			if (!first)
				bw.write(",\n");
			first = false;

			bw.write("  {\"id\":" + d[0] + ",\"name\":\"" + d[1] + "\",\"age\":" + d[2] + ",\"marks\":" + d[3] + "}");
		}

		bw.write("\n]");
		br.close();
		bw.close();

		System.out.println("CSV -> JSON done");
	}

}
