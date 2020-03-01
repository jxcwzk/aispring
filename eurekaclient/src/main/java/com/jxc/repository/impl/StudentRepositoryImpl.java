package com.jxc.repository.impl;

import com.jxc.entity.Student;
import com.jxc.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
//        记得安装lombok插件
        studentMap.put(1L, new Student(1L, "张三", 23));
        studentMap.put(2L, new Student(2L, "李四", 35));
        studentMap.put(3L, new Student(3L, "王五", 36));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);

    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);

    }
}
