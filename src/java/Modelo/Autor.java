/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;

/**
 *
 * @author LENOVO
 */
@Entity
public class Autor implements Serializable {

    @ManyToMany(mappedBy = "autores")
    private List<Livro> livros;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    private String nacionalidade;
    private String foto;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datanasc;
    
    
}
