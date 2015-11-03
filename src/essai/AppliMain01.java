package essai;

import entites.Utilisateur;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AppliMain01 {
    public static void main(String[] args) {
        System.out.println("====================DEBUT================");
         EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("EnchereAppPU");
        EntityManager em = emf.createEntityManager();
        
        
        //jeu de test
        Utilisateur ut1 = 
                new Utilisateur("Inelhaj", "Ibrahim", "email.email@email.com","motDePasse01");
        
        Utilisateur ut2 = 
                new Utilisateur("HickenNo", "Ace", "HickenNoAce@gmail.com","MonkeyD");
        
        Utilisateur ut3 = 
                new Utilisateur("MuguiwaraNo", "Luffy", "Mugui-senpai@gmail.com", "Muguigui");
        
        Utilisateur ut4 = 
                new Utilisateur("BenArfa", "Hatem", "Hatem.BenArfite@gmail.com","Hatem01");
        
        Utilisateur ut5 = 
                new Utilisateur("Smith", "William", "will.smith@gmail.com", "wiwiNYC");
//        
        //Persistence des données
        
        em.persist(ut1);
//        em.persist(ut2);
//        em.persist(ut3);
//        em.persist(ut4);
//        em.persist(ut5);
        
        //Transaction
        
        EntityTransaction et = em.getTransaction();
        et.begin();
        et.commit();
        
        em.close();
        emf.close();
        System.out.println("=====================FIN====================");
    }
    
}
