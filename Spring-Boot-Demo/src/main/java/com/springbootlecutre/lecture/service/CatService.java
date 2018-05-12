package com.springbootlecutre.lecture.service;

import com.springbootlecutre.lecture.models.CatModel;
import org.springframework.stereotype.Service;

@Service
public interface CatService {

    void buy(CatModel catModel);
}
