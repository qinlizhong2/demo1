package com.iotek.service;

import com.iotek.dao.ResumeDao;
import com.iotek.model.Resume;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResumeServiceImpl implements  ResumeService {

    @Resource
    private ResumeDao resumeDao;

    public boolean saveResume(Resume resume) {
        return resumeDao.saveResume(resume);
    }

    public List<Resume> getALLResume() {
        return resumeDao.getALLResume();
    }

    public List<Resume> getALLResume1(Resume resume) {
        return resumeDao.getALLResume1(resume);
    }

    public boolean updateResume(Resume resume) {
        return resumeDao.updateResume(resume);
    }

    public Resume getResume(Resume resume) {
        return resumeDao.getResume(resume);
    }
}
