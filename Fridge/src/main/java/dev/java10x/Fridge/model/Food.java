package dev.java10x.Fridge.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "food_table")

public class Food{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private LocalDate dataValidade;
    private Integer quantidade;

    public Food(){

    }

    public Food(Long id, String nome, LocalDate dataValidade, Integer quantidade){
        this.id = id;
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
    }
    
     public Long getId(){
        return id;
     }
     public void setId(Long id){
        this.id = id;
     }

    public String getNome(){
        return nome;
     }
     public void setNome(String nome){
        this.nome = nome;
     }
     public LocalDate getDataValidade(){
        return dataValidade;
     }
     public void setDataValidade(LocalDate dataValidade){
        this.dataValidade = dataValidade;
     }

    public Integer getQuantidade(){
        return quantidade;
     }
     public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
     }
 
}