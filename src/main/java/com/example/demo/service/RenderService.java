package com.example.demo.service;

import com.quan.demo.models.Render;

public interface RenderService {
    Iterable<Render> findAll();

    Render getRender(Long id);
}
