package com.YueYang.service.ImpI;

import com.YueYang.dao.StudentDao;
import com.YueYang.domain.Student;
import com.YueYang.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> SelectStudent() {
        List<Student> studentList = studentDao.SelectStudent();
        return studentList;
    }
}
