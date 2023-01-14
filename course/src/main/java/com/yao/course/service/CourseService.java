package com.yao.course.service;

import com.yao.course.model.Course;
import com.yao.course.model.Transaction;

import java.util.List;

public interface CourseService {
    //    Function 1: find all courses allCourses()
    List<Course> allCourses();

    //    Function 2: findCourseById()
    Course findCourseById(Long course_id);

    //    Function 3: findTransactionsOfUser()
    List<Transaction> findTransactionsOfUser(Long user_id);

    //    Function 4: findTransactionOfCourse()
    List<Transaction> findTransactionOfCourse(Long course_id);

    //    Function 5: saveTransaction()
    Transaction saveTransaction(Transaction transaction);
}
