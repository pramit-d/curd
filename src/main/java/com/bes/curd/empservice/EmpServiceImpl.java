package com.bes.curd.empservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.bes.curd.emp.Emp;

@Service
public class EmpServiceImpl implements EmpService {

	private List <Emp> emplist;
	
	public EmpServiceImpl() {
		// Mock Data
		emplist = new ArrayList<Emp>();
		emplist.add(new Emp("w1","Test1", "Kolkata", "123456"));
		emplist.add(new Emp("w2","Test2", "Kolkata", "7891234"));
		emplist.add(new Emp("w3","Test3", "Bangalore", "7638569380"));
	}

	@Override
	public List <Emp> getEmpList() {
		// TODO Auto-generated method stub
		return emplist;
	}

	@Override
	public Emp getEmpByEid(String eid) {
		// TODO Auto-generated method stub
		for(Emp emp : emplist) {
			if (emp.getEid().equals(eid)) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public boolean addEmp(Emp emp) {
		// TODO Auto-generated method stub
		return emplist.add(emp);
	}

	@Override
	public boolean deleteEmp(String eid) {
		// TODO Auto-generated method stub
		for (Emp emp : emplist) {
			if(emp.getEid().equals(eid)) {
				emplist.remove(emp);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateEmp(Emp e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < emplist.size(); i++) {
			if(emplist.get(i).getEid().equals(e.getEid())) {
				emplist.set(i, e);
				return true;
			}
		}
		return false;
	}

}
