package com.blob.data.repository;

import com.blob.data.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBRepository extends JpaRepository<FileDB,String> {
}
