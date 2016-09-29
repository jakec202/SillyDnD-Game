package com.ourchar;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Elf;

public class Elfjedi extends Elf implements Jedi {
	
	private Weapons jediWeapon = null;


	public Elfjedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Elfjedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 50);
		// TODO Auto-generated method stub
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 100);
		// TODO Auto-generated method stub
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}



	
}
