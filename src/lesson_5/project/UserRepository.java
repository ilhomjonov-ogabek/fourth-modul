package lesson_5.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

  private List<UserEntity> list = new ArrayList<>();

  public void saveUser(UserEntity user) {
    list.add(user);
  }

  public Optional<UserEntity> getUserByUsername(String username) {
    for (UserEntity user : list) {
      if (user.getUsername().equals(username)) {
        return Optional.of(user);
      }
    }
    return Optional.empty();
  }


}
