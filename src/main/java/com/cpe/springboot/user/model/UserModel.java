package com.cpe.springboot.user.model;


import com.cpe.springboot.card.model.CardModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class UserModel implements Serializable {

	private static final long serialVersionUID = 2733795832476568049L;
	private Integer id;
	private String login;
	private String pwd;
	private float account;
	private String lastName;
	private String surName;
	private String email;

	private HashSet<Integer> cardList = new HashSet<>();

	public UserModel() {
		this.login = "";
		this.pwd = "";
		this.lastName="lastname_default";
		this.surName="surname_default";
		this.email="email_default";
	}

	public UserModel(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
		this.lastName="lastname_default";
		this.surName="surname_default";
		this.email="email_default";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public HashSet<Integer> getCardList() {
		return cardList;
	}

	public void setCardList(HashSet<Integer> cardList) {
		this.cardList = cardList;
	}

	public void addAllCardList(Collection<CardModel> cardList) {
		List<Integer> cardListInt = new ArrayList<>();
		for(CardModel c: cardList) {
			cardListInt.add(c.getId());
		}
		this.cardList.addAll(cardListInt);
	}


	public void addCard(CardModel card) {
		this.cardList.add(card.getId());
		card.setUser(this.getId());
	}

	private boolean checkIfCard(CardModel c){
		for(Integer cardId: this.cardList){
			if(cardId==c.getId()){
				return true;
			}
		}
		return false;
	}

	public float getAccount() {
		return account;
	}

	public void setAccount(float account) {
		this.account = account;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
