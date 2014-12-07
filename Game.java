import Game.*;

import java.util.*;

public class Game
{
	public static final int INVALID = -1;

	private ArrayList<GameCharacter> chars;
	//private ArrayList<Item> items;
	private ArrayList<Team> teams;
	//private ArrayList<Pet> pets;

	private PetShop petShop;
	private ItemShop itemShop;


	public Game()
	{
		chars = new ArrayList<GameCharacter> ();
		teams = new ArrayList<Team> ();
		petShop = new PetShop ("=^.^= LOJA DE GATIIIIIINHOS!!! =^.^=");
		itemShop = new ItemShop ("Amazon Web Store");

		ArrayList<Item> items = new ArrayList<Item> ();
		ArrayList<Pet> pets = new ArrayList<Pet> ();

		/* Dados padrões, para teste preliminar do programa */

		/*  Criação dos Items de teste  */

		// Items do Mario
		items.add(new Weapon("Pimba!", 2.4, 5, 6));
		items.add(new Armor("SUPER Malha", 4.3, 5, 3));
		items.add(new ManaPotion("SUPER Dualidade", 6.4, 5));
		items.add(new HealthPotion("Cap", 5, 3));


		// Items do Altafim
		items.add(new Weapon("3000 VOLTS!", 0.5, 3, 2));
		items.add(new Armor("Superficie Gaussiana", 3, 3, 2));


		// Items do Max
		items.add(new Weapon("FLIP-FLOPS", 2.0, 3, 4));
		items.add(new HealthPotion("Cafe + Pao de Queijo", 3.0, 7));


		// Items da Jussara
		items.add(new Weapon("Att, Jussara!", 0.0, 4, 4)); //IT'S SUPER EFFECTIVE!
		items.add(new Armor(":) :3 *-* <3", 0.0, 6, 4));



		// Items do Daniel
		items.add(new Weapon("RAWR!", 2.4, 5, 7));
		items.add(new Weapon("Stewart", 4.3, 1, 3));
		items.add(new Armor("Chamonix", 20.5, 6, 4));
		items.add(new ManaPotion("A ZOEIRA!", 6, 2));


		// Items do Nolasco
		// A cada transacao acima de 6, o comprador ganha uma trufa :D
		items.add(new Weapon("MATEMATICA !!", 5.0, 8, 10));
		items.add(new Armor("EPSILON", 5.0, 10, 0));
		items.add(new HealthPotion("Calculo I", 1.0, 10));
		items.add(new ManaPotion("Analise", 4.0, 10));


		// Items da GRACA
		items.add(new Weapon("VC TA RINDO DO QUE? QUAL EH A GRACA?", 0.0, 5, 5));
		items.add(new Armor("Sedgewick", 10.0, 4, 0.5));


		// Items da Silvana
		items.add(new Weapon("JUPITERWEB!", 0.0, 5, 20));
		items.add(new HealthPotion("Formatura", 4.0, 5));

		
		// Items adicionais de fim de semestre:
		items.add(new HealthPotion("Homenagem", 0.5, 5));
		items.add(new Weapon("Prova na ultima semana", 0.1, 6, 4));


		/*  Criação dos Characters de teste, e redistribuição dos items para eles  */

		//Mario
		chars.add(new Knight("Mario - O Caracterizado", 3));
		chars.get(0).addXP(3);
		chars.get(0).setStrenght(4);
		chars.get(0).setSpeed(3);
		chars.get(0).setDexterity(3);
		chars.get(0).setConstitution(4);

		for (int i = 0; i < 4; ++i)
		{
			try
			{
				chars.get(0).winItem(items.get(i));
				chars.get(0).equipItem(items.get(i));
			}
			catch (FullInventoryException e)
			{
				System.err.println(e.getMessage());
			}
		}


		//Altafim
		chars.add(new Wizard("Altafim - O Eletromago", 3));
		chars.get(1).addXP(3);
		chars.get(1).setStrenght(3);
		chars.get(1).setSpeed(2);
		chars.get(1).setDexterity(3);
		chars.get(1).setConstitution(1);

		for (int i = 4; i < 6; ++i)
		{
			try
			{
				chars.get(1).winItem(items.get(i));
				chars.get(1).equipItem(items.get(i));
			}
			catch (FullInventoryException e)
			{
				System.err.println(e.getMessage());
			}
		}


		//Max
		chars.add(new Thief("Max - O Veloz", 4));
		chars.get(2).addXP(2);
		chars.get(2).setStrenght(3);
		chars.get(2).setSpeed(6);
		chars.get(2).setDexterity(3);
		chars.get(2).setConstitution(3);

		for (int i = 6; i < 8; ++i)
		{
			try
			{
				chars.get(2).winItem(items.get(i));
				chars.get(2).equipItem(items.get(i));
			}
			catch (FullInventoryException e)
			{
				System.err.println(e.getMessage());
			}
		}


		//Jussara
		chars.add(new Wizard("Jussara - Att, ", 5));
		chars.get(3).addXP(4);
		chars.get(3).setStrenght(1);
		chars.get(3).setSpeed(3);
		chars.get(3).setDexterity(4);
		chars.get(3).setConstitution(1);

		for (int i = 8; i < 10; ++i)
		{
			try
			{
				chars.get(3).winItem(items.get(i));
				chars.get(3).equipItem(items.get(i));
			}
			catch (FullInventoryException e)
			{
				System.err.println(e.getMessage());
			}
		}


		//Daniel
		chars.add(new Wizard("Daniel - O Smania", 4));
		chars.get(4).addXP(3);
		chars.get(4).setStrenght(3);
		chars.get(4).setSpeed(4);
		chars.get(4).setDexterity(4);
		chars.get(4).setConstitution(2);

		for (int i = 10; i < 14; ++i)
		{
			try
			{
				chars.get(4).winItem(items.get(i));
				chars.get(4).equipItem(items.get(i));
			}
			catch (FullInventoryException e)
			{
				System.err.println(e.getMessage());
			}
		}


		//Nolasco
		chars.add(new Wizard("Nolasco - O Mestre dos Magos", 5));
		chars.get(5).addXP(5);
		chars.get(5).setStrenght(4);
		chars.get(5).setSpeed(4);
		chars.get(5).setDexterity(5);
		chars.get(5).setConstitution(3);

		for (int i = 14; i < 18; ++i)
		{
			try
			{
				chars.get(5).winItem(items.get(i));
				chars.get(5).equipItem(items.get(i));
			}
			catch (FullInventoryException e)
			{
				System.err.println(e.getMessage());
			}
		}


		//Graça
		chars.add(new Thief("GracaP - O Eletron", 4));
		chars.get(6).addXP(2);
		chars.get(6).setStrenght(3);
		chars.get(6).setSpeed(6);
		chars.get(6).setDexterity(3);
		chars.get(6).setConstitution(1);

		for (int i = 18; i < 20; ++i)
		{
			try
			{
				chars.get(6).winItem(items.get(i));
				chars.get(6).equipItem(items.get(i));
			}
			catch (FullInventoryException e)
			{
				System.err.println(e.getMessage());
			}
		}


		//Silvana
		chars.add(new Knight("Silvana - A Salvadora", 5));
		chars.get(7).addXP(3);
		chars.get(7).setStrenght(1);
		chars.get(7).setSpeed(2);
		chars.get(7).setDexterity(3);
		chars.get(7).setConstitution(1);

		for (int i = 20; i < 22; ++i)
		{
			try
			{
				chars.get(7).winItem(items.get(i));
				chars.get(7).equipItem(items.get(i));
			}
			catch (FullInventoryException e)
			{
				System.err.println(e.getMessage());
			}
		}

		//Remover os items já designados aos personagens do vetor de items
		int nremoves = items.size()-2;

		for (int i=0; i<nremoves; i++)
		{
			items.remove(0);
		}

		//Criação de dois times de teste e redistribuição dos personagens neles
		teams.add(new Team ("EESC", Color.green));
		teams.add(new Team ("ICMC", Color.blue));

		for (int i = 0; i < 4; ++i)
			teams.get(0).addChar (chars.get(i));

		for (int i = 4; i < 8; ++i)
		{
			teams.get(1).addChar (chars.get(i));
		}

		//Simula uma batalha básica entre os dois times
		teamBattle(0,1);
	}

	public void exitTeam (String ch, String tm) throws IllegalArgumentException
	{
		int tmId = teamId(tm);

		if (teams.get(tmId).removeChar(ch) != true)
			throw new IllegalArgumentException ("Personagem não faz parte do Time");
	}

	public void teamBattle (String team1, String team2) throws IllegalArgumentException
	{
		int tm1 = teamId(team1);
		int tm2 = teamId(team2);

		teamBattle (tm1, tm2);
	}

	private void teamBattle(int team1, int team2)
	{
		if (team1 == team2)
			System.out.println("REBELION ISN'T ALLOWED! THE TEAMS MUST BE DIFFERENT FOR BATTLE!\n");

		if (Utils.rnd(0,1) < 0.5)
		{
			int aux = team2;
			team2 = team1;
			team1 = aux;
		}
		
		int p1 = (int) Utils.rnd(0, teams.get(team1).nChars());

		for (int i = p1; i < teams.get(team1).nChars(); ++i)
		{
			GameCharacter c1 = teams.get(team1).searchChar(i);
			GameCharacter c2 = teams.get(team2).searchChar(i);
			
			if (c1 != null && c2 != null)
			{
				c1.attack(c2);
				if (c2.getHP() <= 0)
				{
					System.out.print( c2.getName() + " is DEAD )':\n" );
					removeChar(c2.getName());
				}
				else
				{
					c2.attack(c1);
					if (c1.getHP() <= 0)
					{
						System.out.print( c1.getName() + " is DEAD )':\n" );
						removeChar(c1.getName());
					}
				}
			}
		}

		teams.get(team1).resolveBattle(teams.get(team2));
		teams.get(team2).resolveBattle(teams.get(team1));
	}


	public void charAttack (String ch1, String ch2) throws IllegalArgumentException
	{
		int c1,c2;
		c1 = charId(ch1);
		c2 = charId(ch2);

		charAttack(c1,c2);
	}

	private void charAttack (int ch1, int ch2) throws IllegalArgumentException
	{
		if (ch1 < 0 || ch2 < 0 || ch1 >= chars.size() || ch2 >= chars.size())
			throw new IllegalArgumentException ("Personagem não está no Jogo");

		if (ch1 == ch2)
			System.out.println("SUICIDE IS NOT AN OPTION! LIVE WITH YOUR PAINS!\n");

		chars.get(ch1).attack(chars.get(ch2));

		if (chars.get(ch2).getHP() <= 0)
		{
			System.out.print(chars.get(ch2).getName() + " is DEAD )':\n" );
			chars.remove (ch2);
		}
	}


	//TO DOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!!
	public void joinTeam (String ch, String tm) throws IllegalArgumentException
	{
		int c = charId (ch);
		int t = teamId (tm);

		joinTeam (c,t);
	}

	private void joinTeam (int ch, int tm) throws IllegalArgumentException
	{
		if (ch < 0 || ch >= chars.size())
			throw new IllegalArgumentException("Personagem não está no Jogo");
		if  (tm < 0 || tm >= teams.size())
			throw new IllegalArgumentException("Time não está no Jogo");

		for (int i = 0; i < teams.size() && teams.get(i).removeChar(chars.get(i).getName()); i++);

		teams.get(tm).addChar(chars.get(ch));
	}


	public void buyItem (String ch, String it) throws IllegalArgumentException, FullInventoryException
	{
		int c = charId(ch);

		itemShop.buy(it, chars.get(c));
	}


/*
	private void winItem (int ch, int it) throws IllegalArgumentException, FullInventoryException
	{
		if (ch < 0 || ch >= chars.size())
			throw new IllegalArgumentException("Personagem não está no Jogo");
		if (it < 0 || it >= items.size())
			throw new IllegalArgumentException("Item não está no Jogo");

		chars.get(ch).winItem(items.get(it));
		items.remove(it);
	}
*/

	public void buyPet (String ch, String pet) throws IllegalArgumentException
	{
		int c = charId(ch);

		petShop.buy(pet, chars.get(c));
	}

/*
	public void winPet (int ch, int pet) throws IllegalArgumentException
	{
		if (ch < 0 || ch >= chars.size())
			throw new IllegalArgumentException("Personagem não está no Jogo");
		if (pet < 0 || pet >= pets.size())
			throw new IllegalArgumentException("Pet não está no Jogo");
		
		chars.get(ch).winPet(pets.get(pet));
		pets.remove(pet);
	}
*/


	public void useItem (String ch, String it) throws IllegalArgumentException
	{
		int c = charId (ch);

		chars.get(c).useItem(it);
	}

	
	public void equipItem (String ch, String it) throws IllegalArgumentException
	{
		int c = charId (ch);

		chars.get(c).equipItem(it);
	}


	public void addChar (GameCharacter ch)
	{
		if (ch == null)
			return;

		chars.add(ch);
	}

	public void addTeam (Team tm)
	{
		if (tm == null)
			return;

		teams.add(tm);
	}

	public void addItem (Item it)
	{
		if (it == null)
			return;

		itemShop.sell(it);
	}

	public void addPet (Pet pet)
	{
		if (pet == null)
			return;

		petShop.sell(pet);
	}


	public void removeChar (String ch) throws IllegalArgumentException
	{
		int c = charId (ch);

		removeChar (c);
	}

	private void removeChar (int ch) throws IllegalArgumentException
	{
		if (ch < 0 || ch >= chars.size())
			throw new IllegalArgumentException("Personagem não está no Jogo!");

		for (int i = 0; i < teams.size() && teams.get(i).removeChar(chars.get(ch).getName()) != false; i++);

		chars.remove(ch);
	}

	///////////////////////// TO DO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public void removeTeam (String tm) throws IllegalArgumentException
	{
		int t = charId (tm);

		removeChar (t);
	}

	private void removeTeam (int tm) throws IllegalArgumentException
	{
		if (tm < 0 || tm >= teams.size())
			throw new IllegalArgumentException("Personagem não está no Jogo!");

		teams.remove(tm);
	}
/*
	public void removeItem (String it) throws IllegalArgumentException
	{
		int i = itemId(it);

		removeItem(i);
	}

	public void removeItem (int it) throws IllegalArgumentException
	{
		if (it < 0 && it >= items.size())
			throw new IllegalArgumentException("Item não está disponível!");

		items.remove(it);
	}

	public void removePet (String pet) throws IllegalArgumentException
	{
		int p = petId(pet);

		removePet(p);
	}

	public void removePet (int pet) throws IllegalArgumentException
	{
		if (pet < 0 && pet >= pets.size())
			throw new IllegalArgumentException("Item não está disponível!");

		pets.remove(pet);
	}
*/
		
	public void showCharacters ()
	{
		System.out.print( "GameCharacter :\n" );
		for (int i = 0; i < chars.size(); ++i)
		{
			System.out.print( i + " :: " + chars.get(i).getName() + " ~> " + 
			chars.get(i).getHP() + " HP | " + chars.get(i).getXP() +
			" XP | " + chars.get(i).getMP() + " MP | (" );

			if (Utils.isKnight(chars.get(i)))
				System.out.print( "Knight" );
			else if (Utils.isThief(chars.get(i)))
				System.out.print( "Thief" );
			else if (Utils.isWizard(chars.get(i)))
				System.out.print( "Wizard" );

			System.out.print( ")\n" );
		}
	}

	public void showTeams ()
	{
		System.out.print( "Teams :\n" );
		for (int i = 0; i < teams.size(); ++i)
		{
			System.out.print( i + " :: " + teams.get(i).toString() + " has " + 
			teams.get(i).getPoints() + " points and " + teams.get(i).getResults() + "\n" );

			System.out.println("Players: ");

			teams.get(i).printTeam();

			System.out.println();
		}
	}

/*
	public void showItems ()
	{
		System.out.print( "Items :\n" );
		for (int i = 0; i < items.size(); ++i)
		{
			System.out.print( i + " :: " + items.get(i).getName() + " ~> " );

			if (Utils.isWeapon(items.get(i)))
				System.out.print( "WEAPON (" + ((Weapon)(items.get(i))).getAttackPts() + " attack points)" );
			else if (Utils.isArmor(items.get(i)))
				System.out.print( "ARMOR (" +  ((Armor)(items.get(i))).getDefensePts() + " defense points)" );
			else if (Utils.isManaPotion(items.get(i)))
				System.out.print( "MANA POTION (" + ((ManaPotion)(items.get(i))).getRestorePts() + " restore points)" );
			else if (Utils.isHealthPotion(items.get(i)))
				System.out.print( "HEALTH POTION (" + ((HealthPotion)(items.get(i))).getRestorePts() + " restore points)" );
		
			System.out.print( " :: " + items.get(i).getPrice() + " $\n" );
		}
	}
*/

	public void showInventory(String ch) throws IllegalArgumentException
	{
		int c = charId(ch);

		chars.get(c).printInventory();
	} 

	private int teamId (String tm) throws IllegalArgumentException
	{
		int t = -1;

		for (int i = 0; i < teams.size(); i++)
		{
			if (teams.get(i).getName().equals(tm))
			{
				t = i;
				i = teams.size();
			}
		}

		if (t == -1)
			throw new IllegalArgumentException("Time não está no Jogo");

		return t;
	}

	private int charId (String ch) throws IllegalArgumentException
	{

		int c = -1;

		for (int i = 0; i < chars.size(); i++)
		{
			if (chars.get(i).getName().equals(ch))
			{
				c = i;
				i = chars.size();
			}
		}

		if (c == -1)
			throw new IllegalArgumentException("Personagem não está no Jogo");

		return c;
	}

/*
	private int itemId (String it) throws IllegalArgumentException
	{
		int itm = -1;

		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).getName().equals(it))
			{
				itm = i;
				i = items.size();
			}
		}

		if (itm == -1)
			throw new IllegalArgumentException("Item não está no Jogo");

		return itm;
	}


	private int petId (String pet) throws IllegalArgumentException
	{

		int p = -1;

		for (int i = 0; i < pets.size(); i++)
		{
			if (pets.get(i).getName().equals(pet))
			{
				p = i;
				p = pets.size();
			}
		}

		if (p == -1)
			throw new IllegalArgumentException("Pet não está no Jogo");

		return p;
	}
*/

	public void trainChar (String ch) throws IllegalArgumentException
	{
		int c = charId(ch);

		chars.get(c).train();
	}
	
	public void trainPet (String ch) throws IllegalArgumentException
	{
		int c = charId(ch);

		chars.get(c).getPet().train();
	}

	public void enterPetShop (String ch) throws IllegalArgumentException, FullInventoryException
	{
		int c = charId (ch);

		petShop.enterShop(chars.get(c));
	}

	public void enterItemShop (String ch) throws IllegalArgumentException, FullInventoryException
	{
		int c = charId (ch);

		itemShop.enterShop(chars.get(c));
	}


/*private static void equipItem (String ch, String it)
	{
		String input;
		System.out.print( "Print character list? " );
		
		do
		{
			input = s.nextLine();
		}while (input.equals(""));

		input = input.toLowerCase();
		if (input.equals("yes"))
			print_chars(chars);


		System.out.print( "Print character's inventory? " );
		
		do
		{
			input = s.nextLine();
		}while (input.equals(""));

		input = input.toLowerCase();
		if (input.equals("yes"))
			print_inventory(chars);


		int id;
		String it;

		System.out.print( "GameCharacter's ID (to equip): " );
		id = s.nextInt();

		if (id < 0 || id >= chars.size())
		{
			System.out.print( "NOT VALID!\n" );
			return;
		}

		System.out.print( "Item's name: " );

		//Evitar o FLUSH!
		do
		{
			it = s.nextLine();
		}while (it.equals(""));

		System.out.print( "The item  was" + (chars.get(id).equipItem(it) ? " equipped!" : "n't equipped!") + "\n" );
	}
	*/

/*	private static void useItem (String ch, String it)
	{
		String input;
		System.out.print( "Print character list? " );
		
		do
		{
			input = s.nextLine();
		}while(input.equals(""));

		input = input.toLowerCase();
		if (input.equals("yes"))
			print_chars(chars);


		System.out.print( "Print character's inventory? " );
		
		do
		{
			input = s.nextLine();
		}while(input.equals(""));

		input = input.toLowerCase();
		if (input.equals("yes"))
			print_inventory(chars);


		int id;
		String it;

		System.out.print( "GameCharacter's ID (to use): " );
		id = s.nextInt();

		if (id < 0 || id >= chars.size())
		{
			System.out.print( "NOT VALID!\n" );
			return;
		}

		System.out.print( "Item's name: " );

		//Evitar o FLUSH!
		do
		{
			it = s.nextLine();
		}while (it.equals(""));

		System.out.print( "The item  was" + (chars.get(id).useItem(it) ? " used!" : "n't used+ ") + "\n" );
	}
*/


/*	private static void team_attack_team()
	{
		int t1,t2;

		if (teams.size() == 1)
		{
			System.out.print( "THERE'S NO REBEL IN THIS GAME!! 1 TEAM CAN'T FIGHT ALONE, ALSO! (#teams = 1)\n" );
			return;
		}

		do
		{
			System.out.print( "team 1 ID: " );
			t1 = s.nextInt();

			if (t1 < 0 || t1 >= teams.size())
			{
				System.out.print( "INVALID TEAM! TAKE THE INTERVAL [" + 0 + " , " + (teams.size()-1) + "]\n" );
				t1 = -1;
			}
		}while (t1 == -1);

		do
		{
			System.out.print( "team 2 ID: " );
			t2 = s.nextInt();

			if (t2 < 0 || t2 >= teams.size())
			{
				System.out.print( "INVALID TEAM! TAKE THE INTERVAL [" + 0 + " , " + (teams.size()-1) + "]\n" );
				t2 = -1;
			}
			if (t2 == t1)
			{
				System.out.print( "REBELION ISN'T ALLOWED! team 2 MUST BE DIFERENT FROM team 1!\n" );
				t2 = -1;
			}

		}while (t2 == -1);

		System.out.print( teams.get(t1).getName() + " vs " + teams.get(t2).getName() + "\n" );
		System.out.print( "BATTLE!\n" );

		team_battle(t1,t2,teams,chars);
	}
*/



	/***  Funções auxiliares do jogo  ***/


	/***  Implementação das funções auxiliares do jogo  ***/

/*
	private static void create_char ()
	{
		String name, type;
		int special;
		
		System.out.print( "Chars's name: " );
		
		do
		{
			name = s.nextLine();
		}while(name.equals(""));

		do
		{
			System.out.print( "Char's type: " );
			
			do
			{
				type = s.nextLine();
			}while(name.equals(""));

			type = type.toLowerCase();
			if (type.equals("knight"))
			{
				System.out.print( "Knight's power: " );
				special = s.nextInt();

				chars.add(new Knight(name, special));
			}
			else if (type.equals("wizard"))
			{
				System.out.print( "Wizard's wisdom: " );
				special = s.nextInt();

				chars.add(new Wizard(name, special));
			}
			else if (type.equals("thief"))
			{
				System.out.print( "Thief's stealth: " );
				special = s.nextInt();

				chars.add(new Thief(name, special));
			}
			else
			{
				System.out.print( "NOT VALID! TRY: Knight, Thief or Wizard!\n" );
				type = "NO";
			}
		}while(type.equals("NO"));
	}
*/

/*	private static void create_item ()
	{
		String name, type;
		double price;
		System.out.print( "Item's name: " );
		
		do
		{
			name = s.nextLine();
		}while (name.equals(""));

		System.out.print( "Item's price: " );
		price = s.nextDouble();


		System.out.print( "Item's type: " );
		
		do
		{
			type = s.nextLine();
		}while (type.equals(""));

		type = type.toLowerCase();

		if (type.equals("weapon"))
		{
			int attackpts;
			int range;

			System.out.print( "Weapon's Attack Points: " );
			attackpts = s.nextInt();

			System.out.print( "Weapon's Range: " );
			range = s.nextInt();

			items.add(new Weapon (name, price, attackpts, range));
		}
		else if (type.equals("armor"))
		{
			int defensepts;
			double weight;

			System.out.print( "Armor's Defense Points: " );
			defensepts = s.nextInt();

			System.out.print( "Armor's Weight: " );
			weight = s.nextInt();

			items.add(new Armor (name, price, defensepts, weight));
		}
		else if (type.equals("potion"))
		{
			String ptype;
			int restorepts;

			System.out.print( "Restore Points: " );
			restorepts = s.nextInt();

			System.out.print( "Potion Type: " );
			
			do
			{
				ptype = s.nextLine();
			}while (ptype.equals(""));


			ptype = ptype.toLowerCase();
			if (ptype.equals("mana"))
				items.add(new ManaPotion (name, price, restorepts));
			else if (ptype.equals("health"))
				items.add(new HealthPotion (name, price, restorepts));
			else
				System.out.print( "NOT VALID!\n" );
		}
		else
			System.out.print( "NOT VALID!\n" );
	}
*/

	/*  Função que cria um novo time  */
/*	private static void create_team ()
	{
		String name;
		String color;
		Color cl = Color.black;

		System.out.print( "Team's name: " );
		
		do
		{
			name = s.nextLine();
		}while (name.equals(""));

		do
		{
			System.out.print( "Team's color: " );
			
			do
			{
				color = s.nextLine();
			}while (color.equals(""));

			color = color.toLowerCase();
			if (color.equals("blue"))
				cl = Color.blue;
			else if (color.equals("red"))
				cl = Color.red;
			else if (color.equals("green"))
				cl = Color.green;
			else if (color.equals("yellow"))
				cl = Color.yellow;
			else if (color.equals("white"))
				cl = Color.white;
			else if (color.equals("black"))
				cl = Color.black;
			else
			{
				System.out.print( "INVALID COLOR, TRY ONE OF THESE: blue, red, green, yellow, white, black\n" );
				color = "invalid";
			}
		}while (color.equals("invalid"));

		teams.add(new Team(name,cl));
	}
*/


/*
	private static void char_to_team ()
	{
		int teamID;
		int charID;

		System.out.print( "GameCharacter's ID: " );
		charID = s.nextInt();

		if (charID < 0  || charID >= chars.size())
		{
			System.out.print( "INVALID CHARACTER!\n" );
			return;
		}

		System.out.print( "Team's ID: " );
		teamID = s.nextInt();

		if (teamID < 0 || teamID >=  chars.size())
		{
			System.out.print( "INVALID TEAM\n" );
			return;
		}

		teams.get(teamID).addChar(chars.get(charID));
	}
*/

/*	private static void power_up ()
	{
		int charid, pu;
		System.out.print( "GameCharacter's ID: " );
		charid = s.nextInt();

		System.out.print( "+ XP: " );
		pu = s.nextInt();

		if (charid >= 0 && charid < chars.size())
			chars.get(charid).addXP(pu);
	}
*/

/*
	private static void print_inventory ()
	{
		int charid;
		System.out.print( "GameCharacter's ID: " );
		charid = s.nextInt();

		if (charid >= 0 && charid < chars.size())
			chars.get(charid).printInventory();
		else
			System.out.print( "INVALID CHARACTER!!\n" );
	}
*/

}