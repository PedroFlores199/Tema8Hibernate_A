package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Crear la sesión de Hibernate
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Casa.class)
                .addAnnotatedClass(Residencial.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = null;

        try {



            transaction = session.beginTransaction();
            
            // Transient
            Casa casa = new Casa("Aluminio", "Madera", "100m²");
            Residencial residencial = new Residencial("Residencial 1", 100, "Distrito 1");
/*
            //Esto para modificar un dato de la casa con id 1
            casa = session.get(Casa.class, 1);
            casa.setVentana("Cristal");

            //Esto para eliminar una casa con id 1
            casa = session.get(Casa.class, 1);
            if (casa != null) {
                session.delete(casa);
            }
*/
            // Persistent
            session.persist(casa);  // Ahora 'casa' está en estado persistente
            session.persist(residencial);

            // Confirmar la transacción
            transaction.commit();

            System.out.println("Datos guardados correctamente");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            // Detached
            session.close();  // Ahora 'casa'y 'residencial' está en estado desvinculado
            factory.close();
        }
    }
}
