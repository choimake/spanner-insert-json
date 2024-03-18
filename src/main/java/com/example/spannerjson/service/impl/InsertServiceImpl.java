package com.example.spannerjson.service.impl;

import com.example.spannerjson.entity.User;
import com.example.spannerjson.entity.UserParameter;
import com.example.spannerjson.repository.UserRepository;
import com.example.spannerjson.request.Request;
import com.example.spannerjson.service.InsertService;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class InsertServiceImpl implements InsertService {
  private final UserRepository userRepository;
  public InsertServiceImpl(UserRepository userRepository){
   this.userRepository = userRepository;
  }

  @Override
  public void execute(Request request) {

    var name = request.getName();
    var parameter = new UserParameter(name);
    var id = UUID.randomUUID();
    var user = new User(id, parameter);

    userRepository.save(user);
  }
}
