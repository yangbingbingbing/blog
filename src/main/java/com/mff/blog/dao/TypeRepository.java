package com.mff.blog.dao;

import com.mff.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface TypeRepository extends JpaRepository<Type,Long> {

    @Query("select b from Type b where b.id = ?1")
    Type findOne(Long id);

    @Transactional
    @Modifying
    @Query("delete from Type a where a.id=?1")
    void delete(Long id);

    Type findByName(String name);//按名称进行查询，看是否有同名分类，不能添加两个同名的分类,
}
