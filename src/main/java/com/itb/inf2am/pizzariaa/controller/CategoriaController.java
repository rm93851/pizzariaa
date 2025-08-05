package com.itb.inf2am.pizzariaa.controller;


import com.itb.inf2am.pizzariaa.model.entity.Categoria;
import com.itb.inf2am.pizzariaa.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")

public class CategoriaController {

        List<Categoria> categorias = new ArrayList<Categoria>();


        @GetMapping
        public List<Categoria> findAll() {

            Categoria p1 = new Categoria();
            p1.setNome("Bebida");
            p1.setDescricao("Categoria Bebida");
            p1.setId(2L);
            p1.setCodStatus(true);

            categorias.add(p1);

            return categorias;

    }
}

