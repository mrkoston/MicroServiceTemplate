package com.quantcast.qcchoise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {



  @RequestMapping(value = "/holamundo",method = RequestMethod.GET)
  public HolaMundoDTO holamundo(@RequestParam(value="mensaje", defaultValue="Hola persona perezosa") String saludito) {
    return new HolaMundoDTO(saludito);
  }
}
