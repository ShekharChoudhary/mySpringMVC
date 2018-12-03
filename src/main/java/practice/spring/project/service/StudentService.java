package practice.spring.project.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import practice.spring.project.data.StudentDetails;

@Service
public class StudentService {

	private List<StudentDetails> studentList = new ArrayList<>(Arrays.asList(new StudentDetails("Shekhar", 1),
			new StudentDetails("Vijay",2),
			new StudentDetails("Joe",3),
			new StudentDetails("Samuel",4)));

	public List<StudentDetails> getAllStudents(){
		return studentList;
	}
	
/*	public Employee getTheEmployee(int id){
		
		return employeeList.stream().filter(e -> e.getEmpID()==id).findFirst().get();
	}

	public void addANewEmployee(Employee employee) {

		employeeList.add(employee);
	}

	public void updateAnEmployee(Employee employee, int id) {

		for(int i =0;i<employeeList.size();i++){
			if(employeeList.get(i).getEmpID() == id){
				employeeList.set(i, employee);
				return;
			}
		}
	}

	public void deleteAnEmployee(int id) {


		for(int i =0;i<employeeList.size();i++){
			if(employeeList.get(i).getEmpID() == id){
				employeeList.remove(i);
				return;
			}
		}
	}*/
}
