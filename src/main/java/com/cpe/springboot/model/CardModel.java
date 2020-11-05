package com.cpe.springboot.model;

public class CardModel extends CardReference{
	private float energy;
	private float hp;
	private float defence;
	private float attack;
	private float price;

	private UserModel user;

	private StoreModel store;

	public CardModel() {
		super();
	}

	public CardModel(CardReference cardRef) {
		super(cardRef);
	}

	public CardModel(String name, String description, String family, String affinity, float energy, float hp,
                     float defence, float attack, String imgUrl, String smallImg, float price) {
		super(name, description, family, affinity,imgUrl,smallImg);
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

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public void setStore(StoreModel storeModel) {
		this.store=storeModel;
	}

	public StoreModel getStore() {
		return store;
	}

	public float computePrice() {
		return this.hp * 20 + this.defence*20 + this.energy*20 + this.attack*20;
	}


}
