package output;

import java.util.ArrayList;

public class Output {
    public ArrayList<String> compilado = new ArrayList<>();
    public ArrayList<Error> errores = new ArrayList<>();

    public ArrayList<String> getCompilado() {
        return compilado;
    }

    public void setCompilado(ArrayList<String> compilado) {
        this.compilado = compilado;
    }

    public ArrayList<Error> getErrores() {
        return errores;
    }

    public void setErrores(ArrayList<Error> errores) {
        this.errores = errores;
    }

}
