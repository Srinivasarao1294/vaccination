package com.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class vaccine {

	@Id
	private String citizenId;
	private String citigenName;
	private String vaccineName;
	private String vaccineCenterId;
	private String vaccineCenterAdress;
	public vaccine() {
		super();
	}
	public vaccine(String citizenId, String citigenName, String vaccineName, String vaccineCenterId,
			String vaccineCenterAdress) {
		super();
		this.citizenId = citizenId;
		this.citigenName = citigenName;
		this.vaccineName = vaccineName;
		this.vaccineCenterId = vaccineCenterId;
		this.vaccineCenterAdress = vaccineCenterAdress;
		
	}
	public String getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitigenName() {
		return citigenName;
	}
	public void setCitigenName(String citigenName) {
		this.citigenName = citigenName;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public String getVaccineCenterId() {
		return vaccineCenterId;
	}
	public void setVaccineCenterId(String vaccineCenterId) {
		this.vaccineCenterId = vaccineCenterId;
	}
	public String getVaccineCenterAdress() {
		return vaccineCenterAdress;
	}
	public void setVaccineCenterAdress(String vaccineCenterAdress) {
		this.vaccineCenterAdress = vaccineCenterAdress;
		
	}
	@Override
	public String toString() {
		return "vaccine [citizenId=" + citizenId + ", citigenName=" + citigenName + ", vaccineName=" + vaccineName
				+ ", vaccineCenterId=" + vaccineCenterId + ", vaccineCenterAdress=" + vaccineCenterAdress
				+ ", getCitizenId()=" + getCitizenId() + ", getCitigenName()=" + getCitigenName()
				+ ", getVaccineName()=" + getVaccineName() + ", getVaccineCenterId()=" + getVaccineCenterId()
				+ ", getVaccineCenterAdress()=" + getVaccineCenterAdress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		
	}
	
	
}
