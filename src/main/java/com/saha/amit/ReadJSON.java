package com.saha.amit;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.saha.amit.dto.StudentCourseList;
import com.saha.amit.dto.StudentCourseMapping;

public class ReadJSON {

	public static void main(String[] args) {
		String path = "C:\\Amit\\Work\\JAVA\\JavaImplementation\\src\\main\\resources\\Student_Courses.json";
		try {
			ObjectMapper mapper = new ObjectMapper();
			//mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			StudentCourseList obj = mapper.readValue(new File(path), StudentCourseList.class);
			System.out.println(obj.getStudentCourseMapping().size());
			
			Stream<StudentCourseMapping> stream = obj.getStudentCourseMapping().stream();
			Set<Integer> st = new HashSet();
			stream.filter(student ->st.add(student.getRoll())).forEach(Coll); ;
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
