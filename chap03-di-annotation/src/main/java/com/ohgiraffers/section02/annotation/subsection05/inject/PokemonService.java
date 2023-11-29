package com.ohgiraffers.section02.annotation.subsection05.inject;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;


@Service("pokemonServiceInject")
public class PokemonService {



//    @Inject // 필드 기반 주입 방식
//    @Named("pikachu")
    private Pokemon pokemon;

/*    // 생성자 기반 주입 방식
    @Inject
    public PokemonService(@Named("pikachu") Pokemon pokemon) {
        this.pokemon = pokemon;
    }*/

    // 세터 기반 주입 방식
    @Inject
    public void setPokemon(@Named("pikachu") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack(){
        pokemon.attack();
    }

}
