package com.springbootlecutre.lecture.serviceImpl;

import com.springbootlecutre.lecture.entities.Cat;
import com.springbootlecutre.lecture.models.CatModel;
import com.springbootlecutre.lecture.repository.CatRepository;
import com.springbootlecutre.lecture.service.CatService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements CatService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CatRepository catRepository;

    @Override
    public void buy(CatModel catModel) {
        Cat cat = this.modelMapper.map(catModel, Cat.class);
        this.catRepository.save(cat);
    }
}
