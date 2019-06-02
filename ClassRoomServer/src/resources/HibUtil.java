package resources;

import entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.File;

public class HibUtil {
    private static SessionFactory sessionFactory=buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        StandardServiceRegistry registry=new StandardServiceRegistryBuilder().loadProperties(new File("ClassRoomServer/settings/db.properties")).build();
        Metadata metadata=new MetadataSources(registry)
                .addAnnotatedClass(Lecturer.class)
                .addAnnotatedClass(Lesson.class)
                .addAnnotatedClass(LessonDetails.class)
                .addAnnotatedClass(Questions.class)
                .addAnnotatedClass(Student.class)
                .buildMetadata();
        return metadata.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
