package com.iotek.service;

import com.iotek.model.Resume;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

public interface ResumeService {

    boolean saveResume(Resume resume);
    List<Resume> getALLResume();
    List<Resume> getALLResume1(Resume resume);
    boolean updateResume(Resume resume);
    Resume getResume(Resume resume);
}
