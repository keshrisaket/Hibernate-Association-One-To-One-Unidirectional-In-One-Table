package main;

import beans.Rank;
import beans.Student;
import hibernateutils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println(session);

        try {

            Student student = new Student();
            student.setCourse("MCA");
            student.setName("Keshri");


            Rank rank = new Rank();
            rank.setStd_rank(12);

            student.setStd_rank(rank);


            session.persist(student);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }


    }
}
