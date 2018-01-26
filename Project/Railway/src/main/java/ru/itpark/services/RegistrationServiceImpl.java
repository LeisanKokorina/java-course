package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itpark.forms.PassengerForm;
import ru.itpark.forms.PassportForm;
import ru.itpark.forms.RegistrationForm;
import ru.itpark.forms.StationForm;
import ru.itpark.models.Passenger;
import ru.itpark.models.Passport;
import ru.itpark.models.Station;
import ru.itpark.models.User;
import ru.itpark.repositories.PassengerRepository;
import ru.itpark.repositories.PassportRepository;
import ru.itpark.repositories.StationRepository;
import ru.itpark.repositories.UsersRepository;

import java.time.LocalDateTime;

@Service
public class RegistrationServiceImpl implements RegistrationService {

  @Autowired
  private UsersRepository usersRepository;
  @Autowired
  private StationRepository stationRepository;
  @Autowired
  private PassengerRepository passengerRepository;
  @Autowired
  private PassportRepository passportRepository;

  private PasswordEncoder encoder = new BCryptPasswordEncoder();

  @Override
  public Long registration(RegistrationForm form) {
    String hashPassword = encoder.encode(form.getPassword());
    LocalDateTime registrationTime = LocalDateTime.now();

    User newUser = User.builder()
        .name(form.getName())
        .email(form.getEmail())
        .surname(form.getSurname())
        .hashPassword(hashPassword)
        .registrationTime(registrationTime)
        .build();

    usersRepository.save(newUser);
    return newUser.getId();
  }

  @Override
  public Long addStation(StationForm form) {
      Station newStation = Station.builder()
              .name(form.getName())
              .build();
      stationRepository.save(newStation);
      return newStation.getId();
  }

  @Override
  public Long addPassenger(PassengerForm form) {
    Passenger newPassenger = Passenger.builder()
            .firstName(form.getFirstName())
            .middleName(form.getMiddleName())
            .lastName(form.getLastName())
            .documentId(form.getDocumentId())
            .build();
    passengerRepository.save(newPassenger);
    return newPassenger.getId();
  }

  @Override
  public Long addPassport(PassportForm form) {
    Passport newPassport = Passport.builder()
            .number(form.getNumber())
            .build();
    passportRepository.save(newPassport);
    return newPassport.getId();
  }
}