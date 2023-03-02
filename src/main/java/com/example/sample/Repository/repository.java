package com.example.sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.Table.book;

public interface repository extends JpaRepository<book,Integer>{

}
