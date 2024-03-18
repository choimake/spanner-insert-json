package com.example.spannerjson.controller;

import com.example.spannerjson.request.Request;
import com.example.spannerjson.service.InsertService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertController {

  private final InsertService insertService;
  public InsertController(InsertService insertService){
    this.insertService = insertService;
  }

  @RequestMapping(value = "/insert",
      method = {RequestMethod.POST},
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity execute(@RequestBody Request request) {

    this.insertService.execute(request);

    return ResponseEntity.ok().body(null);
  }
}
