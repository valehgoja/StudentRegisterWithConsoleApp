/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregisterwithconsoleapp;
import utils.InputUtil;
import static utils.MenuUtil.forMenu;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?"
                    + "\n1.Register student."
                    + "\n2.Show all student."
                    + "\n3.Find student."
                    + "\n4.Update student."
                    + "\n5. Exit ");

            forMenu(menu);
        }
    }
}
