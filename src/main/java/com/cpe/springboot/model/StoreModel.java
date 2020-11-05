package com.cpe.springboot.model;

import java.util.HashSet;
import java.util.Set;

public class StoreModel {

	private Integer id;
	private String name;

    private Set<CardModel> cardList = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CardModel> getCardList() {
		return cardList;
	}

	public void setCardList(Set<CardModel> cardList) {
		this.cardList = cardList;
	}

	public void addCard(CardModel card) {
		card.setStore(this);
		this.cardList.add(card);
	}
	

}
