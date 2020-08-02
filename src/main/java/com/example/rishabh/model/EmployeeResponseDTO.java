package com.example.rishabh.model;

public class EmployeeResponseDTO extends EmployeeRequestDTO {

    private Long id;

    public EmployeeResponseDTO(String name, Long salary) {
        super();
    }

    public EmployeeResponseDTO() {
        super();
    }

//    public EmployeeResponseDTO() {
//        super(name, salary);
//        this.id = id;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
