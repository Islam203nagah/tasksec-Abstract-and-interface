/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asssign3abs.inter;

/**
 *
 * @author islam
 */
public class Mammal implements Animal{

    @Override
    public void eat() {
        System.out.println("Mammal eat");
    }

    @Override
    public void traval() {
        System.out.println("Mammal travel");
    }
    public int NoOflegs()
    {
        return 0;
    }
    public String FavFood()
    {
        return "leaves";
    }
}
