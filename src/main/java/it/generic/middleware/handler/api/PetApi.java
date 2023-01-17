package it.generic.middleware.handler.api;

import it.generic.middleware.api.PetApiDelegate;
import it.generic.middleware.model.generated.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class PetApi implements PetApiDelegate {
    @Override
    public Mono<ResponseEntity<Pet>> addPet(Mono<Pet> pet, ServerWebExchange exchange) {
        return PetApiDelegate.super.addPet(pet, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> deletePet(Long petId, String apiKey, ServerWebExchange exchange) {
        return PetApiDelegate.super.deletePet(petId, apiKey, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Pet>>> findPetsByStatus(String status, ServerWebExchange exchange) {
        return PetApiDelegate.super.findPetsByStatus(status, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Pet>>> findPetsByTags(List<String> tags, ServerWebExchange exchange) {
        return PetApiDelegate.super.findPetsByTags(tags, exchange);
    }

    @Override
    public Mono<ResponseEntity<Pet>> getPetById(Long petId, ServerWebExchange exchange) {
        return PetApiDelegate.super.getPetById(petId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Pet>> updatePet(Mono<Pet> pet, ServerWebExchange exchange) {
        return PetApiDelegate.super.updatePet(pet, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> updatePetWithForm(Long petId, String name, String status, ServerWebExchange exchange) {
        return PetApiDelegate.super.updatePetWithForm(petId, name, status, exchange);
    }
}
