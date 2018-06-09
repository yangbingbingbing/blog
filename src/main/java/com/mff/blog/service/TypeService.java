package com.mff.blog.service;

import com.mff.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {
    Type saveType(Type type);
    Type getType(Long id);

    //通过name查询type,不能添加两个同名的分类
    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);
    Type updateType(Long id,Type type);
    void deleteType(Long id);
}
