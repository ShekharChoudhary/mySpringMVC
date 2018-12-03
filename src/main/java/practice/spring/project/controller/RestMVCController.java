package practice.spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import practice.spring.project.data.StudentDetails;
import practice.spring.project.service.StudentService;

@RestController
public class RestMVCController {
		
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/students" , method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public List<StudentDetails> getValue() {
		return studentService.getAllStudents();
	}
}
