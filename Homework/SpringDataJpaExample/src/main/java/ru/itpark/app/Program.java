package ru.itpark.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itpark.config.ApplicationContext;

import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;


public class Program {
  public static void main(String[] args) throws Exception {
    AnnotationConfigApplicationContext context
        = new AnnotationConfigApplicationContext(ApplicationContext.class);

    User leisan = User.builder()
        .age(23)
        .citizen("Россия")
        .name("Лейсан")
        .build();

    UsersRepository usersRepository = context.getBean(UsersRepository.class);
    usersRepository.save(leisan);
  }
}