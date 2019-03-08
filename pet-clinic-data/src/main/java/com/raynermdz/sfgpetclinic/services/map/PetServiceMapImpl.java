package com.raynermdz.sfgpetclinic.services.map;

import com.raynermdz.sfgpetclinic.model.Pet;
import com.raynermdz.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMapImpl extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Pet obj) {
    super.delete(obj);
  }

  @Override
  public Pet save(Pet obj) {
    return super.save(obj.getId(), obj);
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }
}