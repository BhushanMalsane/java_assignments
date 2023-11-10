package com.demo.test;
import com.demo.service.TeamsServiceImpl;

public class TestTeam {

	public static void main(String[] args) {
		TeamsServiceImpl ts = new TeamsServiceImpl();
		ts.createTeam();
		ts.createTeam();
		ts.displayAll();
	}

}
