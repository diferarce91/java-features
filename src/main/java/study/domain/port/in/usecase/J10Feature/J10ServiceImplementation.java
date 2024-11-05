package study.domain.port.in.usecase.J10Feature;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class J10ServiceImplementation {

    public void varVariables() {

        var list = new ArrayList();
        list.stream();

        var valueIntefer = Integer.valueOf(10);
        valueIntefer.shortValue();

        //https://fastercapital.com/es/contenido/Rendimiento--el-impacto-de-VAR-en-la-eficiencia-y-velocidad-en-tiempo-de-ejecucion.html#:~:text=Cuando%20se%20usa%20correctamente%2C%20'var,variable%20al%20actualizar%20su%20valor.

    }
}
