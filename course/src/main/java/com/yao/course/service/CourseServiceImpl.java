package com.yao.course.service;

import com.yao.course.model.Transaction;
import com.yao.course.repository.CourseRepository;
import com.yao.course.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yao.course.model.Course;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TransactionRepository transactionRepository;


//    Function 1: find all courses allCourses()
    @Override
    public List<Course> allCourses(){
        return courseRepository.findAll();
    }
//    Function 2: findCourseById()
    @Override
    public Course findCourseById(Long course_id){
        return courseRepository.findById(course_id).orElse(null);
    }

//    Function 3: findTransactionsOfUser()
    @Override
    public List<Transaction> findTransactionsOfUser(Long user_id){
        return transactionRepository.findAllByUserId(user_id);
    }
//    Function 4: findTransactionOfCourse()
    @Override
    public List<Transaction> findTransactionOfCourse(Long course_id){
        return transactionRepository.findAllByCourseId(course_id);
    }
//    Function 5: saveTransaction()
    @Override
    public Transaction saveTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }
}
