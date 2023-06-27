package com.bes.curd.empservice;

import java.util.List;
import com.bes.curd.emp.Emp;

public interface EmpService {
	public List <Emp> getEmpList();
	public Emp getEmpByEid(String eid);
	public boolean addEmp(Emp emp);
	public boolean deleteEmp(String eid);
	public boolean updateEmp(Emp emp);
}
