package com.nju.readlaterbackend.share.dto;

import com.nju.readlaterbackend.share.data.ShareContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ContentRespository extends JpaRepository<ShareContent, Long> {

    @Query("SELECT sc.content FROM ShareContent sc " +
            "WHERE sc.userId=:userId")
    List<String> findContentByUserId(@Param("userId") String userId);

    List<ShareContent> findShareContentsByUserId(String userId);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE ShareContent sc SET sc.haveRead=:haveRead " +
            "WHERE sc.id=:id")
    @Transactional
    void changeReadStatus(@Param("id") long id,
                          @Param("haveRead") String haveRead);

}
