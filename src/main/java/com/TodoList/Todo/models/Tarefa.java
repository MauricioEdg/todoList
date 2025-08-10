package com.TodoList.Todo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "tarefa")
@Getter @Setter
@NoArgsConstructor
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título nao pode estar vazio !!")
    private String titulo;

    @NotBlank(message = "Por gentileza, forneça uma descrição !!")
    private String descricao;

    @NotBlank(message = "Informe uma data !!")
    private LocalDateTime data;
    Boolean concluida = false;

}
