package com.iotek.dao;

import com.iotek.model.Resume;

import java.util.HashMap;
import java.util.List;

public interface ResumeDao {
    boolean saveResume(Resume resume);
    List<Resume> getALLResume();
    List<Resume> getALLResume1(Resume resume);
    boolean updateResume(Resume resume);
    Resume getResume(Resume resume);
    boolean deleteResume(Resume resume);
    List<Resume> queryResumeByArray(HashMap<String,Object> hashMap);
    List<Resume> getALLResume2(Resume resume);
}
