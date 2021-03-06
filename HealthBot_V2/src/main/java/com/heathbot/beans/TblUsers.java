package com.heathbot.beans;
// Generated Jan 18, 2018 5:18:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TblUsers generated by hbm2java
 */
@Entity
@Table(name = "tbl_users", catalog = "healthbot")
public class TblUsers implements java.io.Serializable {

	private Integer userId;
	private TblUserType tblUserType;
	private String userName;
	private String gender;
	private String goals;
	private Set<TblUserModules> tblUserModuleses = new HashSet<TblUserModules>(0);
	private Set<TblUserModuleSurvey> tblUserModuleSurveys = new HashSet<TblUserModuleSurvey>(0);
	private Set<TblStudy> tblStudies = new HashSet<TblStudy>(0);
	private Set<TblQuestion> tblQuestions = new HashSet<TblQuestion>(0);
	private Set <TblModules> tblModuleses = new HashSet<TblModules>(0);
	private Set<TblAnswers> tblAnswerses = new HashSet<TblAnswers>(0);

	public TblUsers() {
	}

	public TblUsers(TblUserType tblUserType) {
		this.tblUserType = tblUserType;
	}

	public TblUsers(Integer userId, TblUserType tblUserType, String userName,
			String gender, String goals, Set<TblUserModules> tblUserModuleses,
			Set<TblUserModuleSurvey> tblUserModuleSurveys,
			Set<TblStudy> tblStudies, Set<TblQuestion> tblQuestions,
			Set<TblModules> tblModuleses, Set<TblAnswers> tblAnswerses) {
		super();
		this.userId = userId;
		this.tblUserType = tblUserType;
		this.userName = userName;
		this.gender = gender;
		this.goals = goals;
		this.tblUserModuleses = tblUserModuleses;
		this.tblUserModuleSurveys = tblUserModuleSurveys;
		this.tblStudies = tblStudies;
		this.tblQuestions = tblQuestions;
		this.tblModuleses = tblModuleses;
		this.tblAnswerses = tblAnswerses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_type_id", nullable = false)
	public TblUserType getTblUserType() {
		return this.tblUserType;
	}

	public void setTblUserType(TblUserType tblUserType) {
		this.tblUserType = tblUserType;
	}

	@Column(name = "user_name")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "gender", length = 20)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "goals", length = 65535)
	public String getGoals() {
		return this.goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblUsers")
	public Set<TblUserModules> getTblUserModuleses() {
		return this.tblUserModuleses;
	}

	public void setTblUserModuleses(Set<TblUserModules> tblUserModuleses) {
		this.tblUserModuleses = tblUserModuleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblUsers")
	public Set<TblUserModuleSurvey> getTblUserModuleSurveys() {
		return this.tblUserModuleSurveys;
	}

	public void setTblUserModuleSurveys(
			Set<TblUserModuleSurvey> tblUserModuleSurveys) {
		this.tblUserModuleSurveys = tblUserModuleSurveys;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblUsers")
	public Set<TblStudy> getTblStudies() {
		return this.tblStudies;
	}

	public void setTblStudies(Set<TblStudy> tblStudies) {
		this.tblStudies = tblStudies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblUsers")
	public Set<TblQuestion> getTblQuestions() {
		return this.tblQuestions;
	}

	public void setTblQuestions(Set<TblQuestion> tblQuestions) {
		this.tblQuestions = tblQuestions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblUsers")
	public Set<TblModules> getTblModuleses() {
		return this.tblModuleses;
	}

	public void setTblModuleses(Set<TblModules> tblModuleses) {
		this.tblModuleses = tblModuleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblUsers")
	public Set<TblAnswers> getTblAnswerses() {
		return this.tblAnswerses;
	}

	public void setTblAnswerses(Set<TblAnswers> tblAnswerses) {
		this.tblAnswerses = tblAnswerses;
	}

	@Override
	public String toString() {
		return "TblUsers [userId=" + userId + ", tblUserType=" + tblUserType
				+ ", userName=" + userName + ", gender=" + gender + ", goals="
				+ goals + ", tblUserModuleses=" + tblUserModuleses
				+ ", tblUserModuleSurveys=" + tblUserModuleSurveys
				+ ", tblStudies=" + tblStudies + ", tblQuestions="
				+ tblQuestions + ", tblModuleses=" + tblModuleses
				+ ", tblAnswerses=" + tblAnswerses + "]";
	}
	
}
