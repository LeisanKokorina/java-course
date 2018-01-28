package ru.itpark.services;

import ru.itpark.forms.PassengerForm;
import ru.itpark.forms.PassportForm;
import ru.itpark.forms.RegistrationForm;
import ru.itpark.forms.StationForm;

public interface RegistrationService {
  /**
   * Принимает на вход данные регистрации
   * Шифрует пароль
   * Сохраняет данные в БД
   * @param form
   * @return id-сгенерированного пользователя
   */
  Long registration(RegistrationForm form);



}