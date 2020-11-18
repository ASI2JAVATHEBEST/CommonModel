package com.cpe.springboot.card.model;

import java.io.Serializable;

public class CardModel implements Serializable {

	public Integer id;
	public float energy;
	public float hp;
	public float defence;
	public float attack;
	public float price;
	public int userId;
	public int storeId;
	public int cardReferenceId;

	public CardModel() {
		super();
	}

	public CardModel(CardReference cardRef) {
		super();
	}

	public CardModel(String name, String description, String family, String affinity, float energy, float hp,
					 float defence, float attack,String imgUrl,String smallImg,float price) {
		super();
		this.energy = energy;
		this.hp = hp;
		this.defence = defence;
		this.attack = attack;
		this.price=price;
	}
	public float getEnergy() {
		return energy;
	}
	public void setEnergy(float energy) {
		this.energy = energy;
	}
	public float getHp() {
		return hp;
	}
	public void setHp(float hp) {
		this.hp = hp;
	}
	public float getDefence() {
		return defence;
	}
	public void setDefence(float defence) {
		this.defence = defence;
	}
	public float getAttack() {
		return attack;
	}
	public void setAttack(float attack) {
		this.attack = attack;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public int getUser() {
		return userId;
	}

	public void setUser(int userId) {
		this.userId = userId;
	}

	public void setStore(int storeId) {
		this.storeId=storeId;
	}

	public void setCardReference(int cardReferenceId) {
		this.cardReferenceId=cardReferenceId;
	}

	public int getStore() {
		return storeId;
	}

	public float computePrice() {
		return this.hp * 20 + this.defence*20 + this.energy*20 + this.attack*20;
	}


}
