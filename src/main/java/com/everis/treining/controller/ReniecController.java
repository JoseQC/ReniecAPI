package com.everis.treining.controller;

import com.everis.treining.entity.Reniec;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/external/reniec")
public class ReniecController {


  String entityName = "Reniec";
  boolean success = true;

  /**
   * Comment.
   * 
   * 
   */

  @PostMapping("/validate")
  public Single<Reniec> responseReniec(@RequestBody String document) {
    return Single.just(new Reniec(entityName, success));
  }

}
