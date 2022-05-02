/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author User
 */
public class MenuUtil {

    public static void forMenu(int selectedOption) {
        switch (selectedOption) {
            case 1:
                StudentUtil.studentRegister();
                break;
            case 2:
                StudentUtil.showAllStudents();
                break;
            case 3:
                StudentUtil.findStudent();
                break;
            case 4:
                StudentUtil.updateStudent();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
