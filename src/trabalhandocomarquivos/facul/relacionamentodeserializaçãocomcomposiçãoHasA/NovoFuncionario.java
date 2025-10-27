package trabalhandocomarquivos.facul.relacionamentodeserializaçãocomcomposiçãoHasA;

import java.io.Serializable;

class NovoFuncionario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String eName;
    private String eId;
    private Departamento dName;

    public NovoFuncionario(String eName, String eId, Departamento dName) {
        this.eName = eName;
        this.eId = eId;
        this.dName = dName;
    }

    public String geteName() {
        return eName;
    }

    public String geteId() {
        return eId;
    }

    public Departamento getdName() {
        return dName;
    }
}
