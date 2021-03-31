/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1laba;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author 18760
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SessionFactory sf = HibernateUtil1.getSessionFactory();
        Session s = sf.openSession();
        s.close(); 
    }
    
}
