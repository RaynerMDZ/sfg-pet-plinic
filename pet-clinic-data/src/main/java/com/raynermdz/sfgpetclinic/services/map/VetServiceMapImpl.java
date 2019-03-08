package com.raynermdz.sfgpetclinic.services.map;

import com.raynermdz.sfgpetclinic.model.Vet;
import com.raynermdz.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet obj) {
    super.delete(obj);
  }

  @Override
  public Vet save(Vet obj) {
    return super.save(obj.getId(), obj);
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }
}