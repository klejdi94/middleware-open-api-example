package it.generic.middleware.handler.api;

import it.generic.middleware.api.PetApi;
import it.generic.middleware.model.generated.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class PetApiImpl implements PetApi {
    @Override
    public Mono<ResponseEntity<Pet>> addPet(Mono<Pet> pet, ServerWebExchange exchange) {
        return PetApi.super.addPet(pet, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> deletePet(Long petId, String apiKey, ServerWebExchange exchange) {
        return PetApi.super.deletePet(petId, apiKey, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Pet>>> findPetsByStatus(String status, ServerWebExchange exchange) {
        return PetApi.super.findPetsByStatus(status, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Pet>>> findPetsByTags(List<String> tags, ServerWebExchange exchange) {
        return PetApi.super.findPetsByTags(tags, exchange);
    }

    @Override
    public Mono<ResponseEntity<Pet>> getPetById(Long petId, ServerWebExchange exchange) {
        return PetApi.super.getPetById(petId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Pet>> updatePet(Mono<Pet> pet, ServerWebExchange exchange) {
        return PetApi.super.updatePet(pet, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> updatePetWithForm(Long petId, String name, String status, ServerWebExchange exchange) {
        return PetApi.super.updatePetWithForm(petId, name, status, exchange);
    }
}
