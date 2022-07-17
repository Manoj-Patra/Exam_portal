package com.pnac.examportal.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pnac.examportal.entity.exam.Category;

@Repository
public interface CategoryRepositary extends JpaRepository<Category, Long> {

}
