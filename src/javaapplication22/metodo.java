/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthonny
 */
public class metodo {
    public static void  getAge() {
    int year , month, day;
    year=Integer.parseInt(JOptionPane.showInputDialog(null,"Año nacimiento"));
    month=Integer.parseInt(JOptionPane.showInputDialog(null,"mes nacimiento"));
    day=Integer.parseInt(JOptionPane.showInputDialog(null,"dia nacimiento"));
    Date now = new Date();
    int nowMonth = now.getMonth()+1;
    int nowYear = now.getYear()+1900;
    int result = nowYear - year;

    if (month > nowMonth) {
        result--;
    }
    else if (month == nowMonth) {
        int nowDay = now.getDate();

        if (day > nowDay) {
            result--;
        }
    }
   JOptionPane.showMessageDialog(null, result);
}
}


