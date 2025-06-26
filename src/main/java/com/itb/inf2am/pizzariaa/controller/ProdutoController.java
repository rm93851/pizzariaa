package com.itb.inf2am.pizzariaa.controller;


// No string e comum adicionarmos anotacoes (annotation) em classes,atributos e metodos
//Uma annotation e uma forma de adicionar informacoes (metadados) ao seu codigo que podem
//ser interpretadas pelo compilador ou em tempo de execuçao pro ferramentas e frameworks
//como String
//Uma annotation e uma palavra iniciada com '@' que voce coloca acima de uma classe, metodo,
//atributo o parametro,para dar instruçoes extras ao java ou a algum framework sobre como
//aquele elemento deve ser tratado.


import com.itb.inf2am.pizzariaa.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();


      @GetMapping
      public List<Produto> findAll() {

          Produto p1 = new Produto();
          p1.setNome("Pizza de calabreza");
          p1.setDescricao("Calabreza");
          p1.setValorVenda(55.40);

          Produto p2 = new Produto();
          p2.setNome("Pizza de calabreza");
          p2.setDescricao("Calabreza");
          p2.setValorVenda(55.40);


          // Adicionando o produto
          produtos.add(p1);
          produtos.add(p2);

          return produtos;
      }

      





}
