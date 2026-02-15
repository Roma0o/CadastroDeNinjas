/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.treino.CadastroDeNinjas.Missoes;

import com.treino.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Romão
 */

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private String Dificuldade;
    
    @OneToMany(mappedBy = "missao") //Uma missão pode ter varios ninjas / mappedBy = definição da FK
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }
    
    public MissoesModel(String nome, String Dificuldade) {
        this.nome = nome;
        this.Dificuldade = Dificuldade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(String Dificuldade) {
        this.Dificuldade = Dificuldade;
    }
    
    
}
