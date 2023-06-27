package com.bes.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.bes.curd.emp.Emp;
import com.bes.curd.empservice.EmpService;

@RestController
public class Controller {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/emp")
	public List <Emp> getEmpList() {
		return this.empService.getEmpList();
	}
	@GetMapping("/emp/{eid}")
	public Emp getEmpById(@PathVariable String eid) {
		return this.empService.getEmpByEid(eid);
	}
	@PostMapping(path = "/emp", consumes = {"application/json"})
	public boolean addEmp(@RequestBody Emp emp) {
		return this.empService.addEmp(emp);
	}
	@PutMapping(path = "/emp", consumes = {"application/json"})
	public boolean updateEmp(@RequestBody Emp emp) {
		return this.empService.updateEmp(emp);
	}
	@DeleteMapping("/emp/{eid}")
	public boolean deleteEmp(@PathVariable String eid) {
		return this.empService.deleteEmp(eid);
	}
}
