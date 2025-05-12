class Paciente {
    protected String dni;
    protected String nombre;
    protected String obraSocial;

    public Paciente(String dni, String nombre, String obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String coberturaOS() {
        return "Cobertura de OS: " + obraSocial;
    }

    public String descuento() {
        return "Descuento: 10%";
    }

    public String vademecum() {
        return "Vademécum: Estándar";
    }
}

class Pediatrico extends Paciente {
    private double peso;
    private String celular;
    private String tutor;

    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    public String tipoDieta() {
        return "Dieta: Infantil balanceada";
    }
}

class Adulto extends Paciente {
    private double presionArterial;
    private double altura;
    private double peso;

    public Adulto(String dni, String nombre, String obraSocial, double presionArterial, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }

    public String estudiosRx() {
        return "Estudio: Rayos X solicitado";
    }

    public String estudiosSangre() {
        return "Estudio: Análisis de sangre solicitado";
    }
}

class Internado extends Paciente {
    private String habitacion;
    private double presionArterial;
    private String rh;

    public Internado(String dni, String nombre, String obraSocial, String habitacion, double presionArterial, String rh) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = presionArterial;
        this.rh = rh;
    }

    public String tipoDieta() {
        return "Dieta: Controlada por médico";
    }

    public String estudiosRx() {
        return "Estudio: Rayos X solicitado";
    }

    public String estudiosSangre() {
        return "Estudio: Análisis de sangre solicitado";
    }
}
