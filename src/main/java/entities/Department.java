package entities;

public class Department {

    private Long id;
    private String name;

    //Construtor sem parâmetros refere-se a classe poder ser instanciada sem argumentos.
    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
