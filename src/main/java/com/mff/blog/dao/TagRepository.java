package com.mff.blog.dao;

import com.mff.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by limi on 2017/10/16.
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);

    @Query("select b from Tag b where b.id = ?1")
    Tag findOne(Long id);

    @Transactional
    @Modifying
    @Query("delete from Tag a where a.id=?1")
    void delete(Long id);

    @Query("select t from Tag t")
    List<Tag> findAll(List<Long> longs);
}
