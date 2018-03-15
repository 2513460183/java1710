package org.jbit.news.biz.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jbit.news.Biz1.EmployeeBiz;
import org.jbit.news.dao.EmployeeDao;
import org.jbit.news.dao.impl.EmployeeDaoImpl;
import org.jbit.news.entity.Employee;

import org.jbit.news.util.DBUtil;
import org.jbit.news.util.Page;

public class EmployeeBizImpl implements EmployeeBiz{
  EmployeeDao dao=new EmployeeDaoImpl();

@Override
public Page findPage(int page, int count) {
	// TODO Auto-generated method stub
	return null;
}
	

public int getTotalCount() {
	// TODO Auto-generated method stub
	return dao.getTotalCount();
}
public List<Employee> getNewsList(int currPageNo, int pageSize) {
	// TODO Auto-generated method stub
	return dao.getNewsList(currPageNo, pageSize);
}


@Override
public int deleteNews(int empno) {
	
	return dao.deleteNews(empno);
}


@Override
public int addNews(int empno,String ename,String job,int mgr,String hiredate,double sal,double comm,int deptno) {
	
	return dao.addNews( empno, ename, job, mgr, hiredate, sal, comm, deptno);
}


@Override
public int updataNews(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm,
		int deptno) {
	
	return dao.updataNews(empno, ename, job, mgr, hiredate, sal, comm, deptno);
}


@Override
public List<Employee> getByidNew(int empno) {
	
	return dao.getByidNew(empno);
}


@Override
public List<Employee> findALL() throws SQLException {
	// TODO Auto-generated method stub
	return dao.findALL();
}


@Override
public List<Employee> getEmpByEmpno(int empno) {
	
	return dao.getEmpByEmpno(empno);
}











	
}
