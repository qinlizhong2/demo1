package com.iotek.dao;

import com.iotek.model.Resume;

import java.util.List;

public interface ResumeDao {
    boolean saveResume(Resume resume);
    List<Resume> getALLResume();
    List<Resume> getALLResume1(Resume resume);
    boolean updateResume(Resume resume);
    Resume getResume(Resume resume);
}
