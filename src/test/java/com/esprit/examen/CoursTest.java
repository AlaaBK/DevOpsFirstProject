package com.esprit.examen;
import com.esprit.examen.entities.Cours;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.services.ICoursService;
import com.esprit.examen.services.CoursService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursTest {

    @Autowired
    ICoursService coursServices;

    @Test
    @Transactional
   public void testAjouterCours() {
        Cours cours = new Cours(null, "description", TypeCours.Informatique, "Scrum");
        System.out.print(cours);
        coursServices.addCours(cours);
        Long id = cours.getId();
        System.out.print(id);
        Assert.assertNotNull(id);
        System.out.println("id : "+ id);
        Cours savedCours = coursServices.getCoursById(id);
        try {
            Assert.assertEquals("description", savedCours.getDescription());
            Assert.assertEquals("Informatique", savedCours.getTypeCours());
            Assert.assertEquals("intitle", savedCours.getIntitule());

        }
        finally {
            System.out.println("Delete last insert .....");
            coursServices.supprimerCours(id);
        }
    }
/*
    @Test
    void testModifierCours() {
        fail("Not yet implemented");
    }*/

    @Test
    public void testSupprimerCours() {
        Cours cours = new Cours(null, "description", TypeCours.Informatique, "intitle");
        System.out.print(cours);
        coursServices.addCours(cours);
        Long id = cours.getId();
        System.out.print(id);
        Assert.assertNotNull(id);
        System.out.println("id : "+ id);
        Cours savedCours = coursServices.getCoursById(id);
        try {
            Assert.assertEquals("description", savedCours.getDescription());
            Assert.assertEquals("INFORMATIQUE", savedCours.getTypeCours());
            Assert.assertEquals("intitle", savedCours.getIntitule());

        }
        finally {
            System.out.println("Delete last insert .....");
            coursServices.supprimerCours(id);
        }
    }

    @Test
    void testListeCours() {
       List<Cours> cours1 =  coursServices.getCours();
        int firstLength1 = cours1.size();
        Cours cour = new Cours(null, "description", TypeCours.Informatique, "intitle");
        coursServices.addCours(cour);
        List<Cours> cours2 =  coursServices.getCours();
        int firstLength2 = cours2.size();
        Assert.assertEquals(firstLength2,firstLength1 + 1);
        Long id = cour.getId();
        Assert.assertNotNull(id);
        coursServices.supprimerCours(id);
    }


}


