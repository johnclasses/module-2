package com.example.demo.entities;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTurma")
    private Integer idTurma;

    @Column(name = "horario")
    private Time horario;

    @Column(name = "duracao")
    private Integer duracao;

    @Column(name = "dataInicio")
    private Date dataInicio;

    @Column(name = "dataFim")
    private Date dataFim;

    
    @ManyToOne
    @JoinColumn(name = "idInstrutor")
    @JsonBackReference
    private Instrutor instrutor;
}
