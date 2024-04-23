package com.example.demo.entities;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "instrutor")
public class Instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInstrutor")
    private Integer idInstrutor;

    @Column(name = "RG")
    private Integer rg;

    @Column(name = "nome", length = 45)
    private String nome;

    @Column(name = "nascimento")
    private Date nascimento;

    @Column(name = "titulacao")
    private Integer titulacao;

    @OneToMany(mappedBy = "instrutor")
    @JsonManagedReference
    private Set<Turma> turmas;
}