/*******************************************************************************************
*                         SCC 604 - Programacao Orientada a Objetos                        *
*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*
*                          Turma 2014/2 - Engenharia de Computação                         *
*                                  Professor: Moacir Ponti                                 *
*------------------------------------------------------------------------------------------*
*                                        Trabalho 3                                        *
*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*
*                      Alunos: João Victor Almeida de Aguiar :: 8503986                    *
*                           Cassiano Zaghi de Oliveira :: 7987400                          *
********************************************************************************************/


package Game;

public class Knight extends GameCharacter
{
	/*  Atributos da classe Knight (todos são protected)  */

	protected int power;


	/*  Métodos da classe GameCharacter  */

	/***  Construtores e Destrutores  ***/

	/* Construtor que recebe o nome do personagem e poder, e inicializa suas caracteristicas no mínimo aceitável
	i.e: 100 HP, XP = strength = speed = dexterity = constitution = 1*/
	public Knight(String alias, int power)
	{
		super(alias);
		this.power = power;
	}


	/*  Incrementa o power do Knight  */
	public void addPower(int powerup)
	{
		this.power += powerup;
	}


	/***  Cálculo dos pontos (todos são protected)  ***/

	/*  Cálculo dos pontos de ataque  */
	protected int getAttackPoints()
	{
		return super.getAttackPoints();
	}

	/*  Cálculo dos pontos de defesa  */
	protected int getDefensePoints()
	{
		return super.getDefensePoints() + this.power;
	}

	/*  Função que implementa o treino (interface Attacker) de um Knight  */
	public void train ()
	{
		// Perde gold, perde HP, mas, em troca, ganha XP, Strenght e Constitution
		int gd = (int) (-1.0*Utils.rnd(0,60));
		int hp = (int) (-1.0*Utils.rnd(0,40));
		int xp = (int) Utils.rnd(0,2);

		myitems.spendGold(gd);
		addHP(hp);
		addXP(xp);
		setStrenght(strenght + 1);
		setConstitution(constitution + 1);
	}
}