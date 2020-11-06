package com.cpe.springboot.store.model;

import com.cpe.springboot.card.model.CardModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashSet;

@Entity
public class StoreModel {

	@Id
	private Integer id;
	private String name;

    private HashSet<CardModel> cardList = new HashSet<>();

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

	public HashSet<CardModel> getCardList() {
		return cardList;
	}

	public void setCardList(HashSet<CardModel> cardList) {
		this.cardList = cardList;
	}

	public void addCard(CardModel card) {
		card.setStore(this);
		this.cardList.add(card);
	}
	

}
