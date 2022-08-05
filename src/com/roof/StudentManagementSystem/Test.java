package com.roof.StudentManagementSystem;

import javax.persistence.EntityManager;

public class Test {
    public static void main(String[] args) {
        Student student1= new Student("Hatice Çağlar","14.07.200","Sultanbeyli","Girl" );
        Student student2=new Student("Habibe Gurel","14.09.2001","Eyüp","Girl");
        Student student3=new Student("Mertcan Karabaş","19.10.2001","Beykoz","Boy");

        Course course1 = new Course("Computer Programming","BLM1903",6);
        Course course2 = new Course("Data Structures","BLM204",6);
        Course course3 = new Course("Microprocessors","BLM206",6);

        Instructor instructor1= new VisitingResearcher("Ali Veli","Fatih","05333150739",100);
        Instructor instructor2 = new PermanentInstructor("Ayşe Fatma","Besiktas","05344817105",15000);
        Instructor instructor3=new PermanentInstructor("Ahmet Mehmet","Mecidiyekoy","05362901310",100);

        course1.setInstructor(instructor1);
        course2.setInstructor(instructor2);
        course3.setInstructor(instructor3);

        student1.getCourseList().add(course1);
        student1.getCourseList().add(course2);
        student2.getCourseList().add(course1);
        student2.getCourseList().add(course2);
        student2.getCourseList().add(course3);
        student3.getCourseList().add(course2);
        student3.getCourseList().add(course3);

       System.out.println(student1);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();

            em.persist(course1);
            em.persist(course2);
            em.persist(course3);
            em.persist(student1);
            em.persist(student2);

            em.persist(student3);
            em.persist(instructor1);
            em.persist(instructor2);
            em.persist(instructor3);



            em.getTransaction().commit();

            System.out.println("All data persisted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    }

