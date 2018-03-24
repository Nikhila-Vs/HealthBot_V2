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
 * TblQuestion generated by hbm2java
 */
@Entity
@Table(name = "tbl_question", catalog = "healthbot")
public class TblQuestion implements java.io.Serializable {

	private Integer questionId;
	private TblUsers tblUsers;
	private TblModules tblModules;
	private String question;
	private Set<TblUserModuleSurvey> tblUserModuleSurveys = new HashSet<TblUserModuleSurvey>(0);

	public TblQuestion() {
	}

	public TblQuestion(TblUsers tblUsers, TblModules tblModules,
			String question, Set tblUserModuleSurveys) {
		this.tblUsers = tblUsers;
		this.tblModules = tblModules;
		this.question = question;
		this.tblUserModuleSurveys = tblUserModuleSurveys;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "question_id", unique = true, nullable = false)
	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public TblUsers getTblUsers() {
		return this.tblUsers;
	}

	public void setTblUsers(TblUsers tblUsers) {
		this.tblUsers = tblUsers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "module_id")
	public TblModules getTblModules() {
		return this.tblModules;
	}

	public void setTblModules(TblModules tblModules) {
		this.tblModules = tblModules;
	}

	@Column(name = "Question", length = 65535)
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblQuestion")
	public Set<TblUserModuleSurvey> getTblUserModuleSurveys() {
		return this.tblUserModuleSurveys;
	}

	public void setTblUserModuleSurveys(
			Set<TblUserModuleSurvey> tblUserModuleSurveys) {
		this.tblUserModuleSurveys = tblUserModuleSurveys;
	}

}
