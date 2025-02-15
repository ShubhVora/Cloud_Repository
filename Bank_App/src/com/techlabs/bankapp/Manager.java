package com.techlabs.bankapp;

import java.io.Serializable;
import java.util.Date;

public class Manager implements Serializable {
	private static int uniqueCode = 1;
	private String name;
	private int code;
	private Specialize specialize;
	private Date birthDate, joiningDate;
	private Double ctc;
	private boolean workingStatus = false;

	public Manager(String name, Specialize specialize, Date birthDate, Date joiningDate, Double ctc,
			int workingStatus) {
		this.code = uniqueCode;
		this.name = name;
		this.specialize = specialize;
		this.birthDate = birthDate;
		this.joiningDate = joiningIsPossible(birthDate, joiningDate);
		this.workingStatus = isWorking(workingStatus);
		this.ctc = checkCtc(ctc);
		uniqueCode++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode() {
		this.code = uniqueCode;
		uniqueCode++;
	}

	public Specialize getSpecialize() {
		return specialize;
	}

	public void setSpecialize(Specialize specialize) {
		this.specialize = specialize;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Double getCtc() {
		return ctc;
	}

	public void setCtc(Double ctc) {
		this.ctc = ctc;
	}

	public boolean isWorkingStatus() {
		return workingStatus;
	}

	public void setWorkingStatus(boolean workingStatus) {
		this.workingStatus = workingStatus;
	}

	public Date joiningIsPossible(Date birthDate, Date joiningDate) {
		if (birthDate.compareTo(joiningDate) < 0) {
			return joiningDate;
		} else {
			throw new ManagerDetailCannotBeStoredException("BirthDate is greater than joiningDate");
		}
	}

	public boolean isWorking(int workStatus) {
		if (workStatus == 1) {
			return true;
		} else {
			return false;
		}
	}

	public double checkCtc(double ctc) {
		if (ctc >= 0) {
			return ctc;
		} else {
			throw new ManagerDetailCannotBeStoredException("Ctc value is negative,");
		}

	}

}
