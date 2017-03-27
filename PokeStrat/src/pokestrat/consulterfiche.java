/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokestrat;

/**
 *
 * @author Quentin
 */
public class consulterfiche {
    public consulterfiche()throws Exception{
        RequeteSQL fiche = new RequeteSQL();
        fiche.fiche();
        System.out.println(fiche);
    }
}
