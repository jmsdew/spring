package com.ohgiraffers.section02.annotation.subsection02.qualifire;

import com.ohgiraffers.section02.common.Pikachu;
import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    @Autowired
    @Qualifier("pikachu")           // 빈은 소문자로 시작
    private Pokemon pokemon;


    public PokemonService(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack(){
        pokemon.attack();
    }
}
