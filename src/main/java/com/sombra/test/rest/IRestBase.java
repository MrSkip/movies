package com.sombra.test.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * by Mr Skip on 04.04.2016.
 */

public interface IRestBase<S> {

    ResponseEntity<S> update(@RequestBody S s);
    ResponseEntity delete(@PathVariable Long id);
    ResponseEntity<S> getOne(@PathVariable Long id);
    ResponseEntity<List<S>> getAll(@RequestParam int page,
                                   @RequestParam int count);
    ResponseEntity<S> save(@RequestBody S s);

}
