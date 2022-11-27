package en.course.architecture;

import en.course.architecture.action.Action;
import en.course.architecture.character.Fighter;
import en.course.architecture.character.Hero;
import en.course.architecture.round.FightRound;
import en.course.architecture.round.MerlinRound;
import en.course.architecture.round.Round;
import en.course.architecture.round.WeaponMasterRound;

public class Game {
    public void start(){
        System.out.println("Début de la game");
        Hero hero = new Hero();

        //Utils.NBR_TURN_GAME
        for(int i =0; i < 4; i++){
            Round round = null;
            int nbrProba = Utils.genererInt(1,5);

            if(nbrProba == 1) round = new MerlinRound();
            else if(nbrProba == 2) round = new WeaponMasterRound();
            else round = new FightRound();
            round.createRound(hero);
            if(!hero.isAlive()) break;
        }
        System.out.println("Fin de partie guignol");
    }
}
