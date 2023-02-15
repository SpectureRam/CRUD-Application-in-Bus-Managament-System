package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Interface extends JpaRepository<BusInfo, Integer>
{
}