package com.example.sprint1.service;

import com.example.sprint1.dto.PostDto;

public interface IProductService {
    Object addPost(PostDto postDto);

    Object followedList(Integer userId);

    Object orderedList(Integer userId, String order);


    Object postPromo(PostDto postDto);

    Object quantityPromo(Integer user_id);

    Object getPromo(Integer user_id);
}
