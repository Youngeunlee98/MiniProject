package com.example.miniprogect1.domain;import jakarta.persistence.*;import lombok.Getter;import lombok.Setter;@Entity@Table(name = "ilchon")@Getter@Setterpublic class Ilchon {    @Id    @GeneratedValue(            strategy = GenerationType.IDENTITY    )    private Long id;    private String me;    private String you;}