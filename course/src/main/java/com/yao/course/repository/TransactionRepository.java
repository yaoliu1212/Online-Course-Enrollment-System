package com.yao.course.repository;

import com.yao.course.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
//    finding transaction according to user_id
    List<Transaction> findAllByUserId(Long user_id);

//    finding transactions according to course_id
    List<Transaction> findAllByCourseId(Long course_id);

}
