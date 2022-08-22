package com.bosonit.BS42;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${VAR1}")
    private String var1;

    @Value("${My.VAR2}")
    private String var2;

    @Value("${VAR3_SISTEMA:var3 no tiene valor}")
    private String var3;

    @GetMapping("/valores")
    public String getValues() {
        return "Valor de VAR1 es " + var1 + " y valor de MY.VAR2 es " + var2;
    }

    @GetMapping("/val3")
    public String getVar3() {
        return "Valor de VAR3 es " + var3;
    }
}
