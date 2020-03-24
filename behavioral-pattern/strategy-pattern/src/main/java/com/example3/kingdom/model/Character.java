package com.example3.kingdom.model;

import com.example3.kingdom.WeaponBehaviour;
import lombok.Setter;

@Setter
public class Character {
	private WeaponBehaviour weapon;

	public void fight(){
		weapon.useWeapon();
	}
}
