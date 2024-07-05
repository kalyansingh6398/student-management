package com.seleniumexpress.sm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.seleniumexpress.sm.api.Student;

public class StudentRowMapper  implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
	
	student.setId(rs.getInt("Id"));
	student.setName(rs.getString("Name"));
	student.setMobile(rs.getLong("Mobile"));
	student.setCountry(rs.getString("Country"));
	
	
		return student;
	}

}
;