package com.victor.catalogo.utils;


import com.victor.catalogo.model.Musica;
import com.victor.catalogo.repository.CatalogoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// import javax.annotation.PostConstruct;

@Component
public class PopulaDados {

    @Autowired CatalogoRepository catalogoRepository;

    // @PostConstruct
    public void cadastrarMusica(){

        List<Musica> listaMusica = new ArrayList<>();
                
        Musica musica1 = new Musica();
        Musica musica2 = new Musica();

        musica1.setAutor("Rufus Du Sol"); 
        musica1.setData(LocalDate.now());
        musica1.setTitulo("Innerbloom");
        musica1.setLetra("Feels like I'm waiting Like I'm watching Watching you for love Dreams, where I am fading Fading So free my mind, all the talking Wasting all your time I'm giving all That I've got Feels like I'm dreaming Like I'm walking Walking by your side Keeps on repeating Repeating So free my mind, all the talking Wasting all your time I'm giving all That I've got If you want me If you need me I'm yours If you want me If you need me I'm yours If you want me If you need me I'm yours If you want me If you need me I'm yours If you want me If you need me I'm yours If you want me If you need me I'm yours");
    
        musica2.setAutor("Fisher"); 
        musica2.setData(LocalDate.now());
        musica2.setTitulo("Losing it");
        musica2.setLetra("I'm losing it I'm losing it I'm losing it I'm losing it I'm losing it I'm losing it I'm losing it");

        listaMusica.add(musica1);
        listaMusica.add(musica2);

        for (Musica musica : listaMusica) {
            Musica salvarMusica = catalogoRepository.save(musica);
            System.out.println(salvarMusica.getId());
        }
    }
}
