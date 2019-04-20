package cn.aethli.gttss.service;

import cn.aethli.gttss.dao.ClassNameMapper;
import cn.aethli.gttss.dao.StudentMapper;
import cn.aethli.gttss.dao.SysUserMapper;
import cn.aethli.gttss.dao.TeacherMapper;
import cn.aethli.gttss.domain.ClassName;
import cn.aethli.gttss.domain.Student;
import cn.aethli.gttss.domain.SysUser;
import cn.aethli.gttss.domain.Teacher;
import cn.aethli.gttss.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    ClassNameMapper classNameMapper;

    public SysUser login(SysUser sysUser, String acaptcha) throws Exception {
        SysUser user = sysUserMapper.selectByAccount(sysUser);
        if ((StringUtils.toMD5(user.getPassword() + acaptcha)).equals(sysUser.getPassword())) {
            user.setPassword("已去除返回密码值");
            return user;
        } else throw new Exception("账号或密码错误");
    }

    public void checkStudent(SysUser sysUser) throws Exception {
        Student student = new Student();
        student.setUserId(sysUser.getUserId());
        if (studentMapper.selectById(student) == null) {
            throw new Exception("用户身份信息错误");
        }
    }

    public void checkTeacher(SysUser sysUser) throws Exception {
        Teacher teacher = new Teacher();
        teacher.setUserId(sysUser.getUserId());
        if (teacherMapper.selectById(teacher) == null) {
            throw new Exception("用户身份信息错误");
        }
    }

    public Object getMyself(SysUser sysUser) throws Exception {
        Student student = new Student();
        student.setUserId(sysUser.getUserId());
        Student s = studentMapper.selectById(student);
        if (s == null) {
            throw new Exception("用户身份信息错误");
        }
        Map<String, Object> result = new HashMap<>();
        result.put("userName", s.getName());
        ClassName className = new ClassName();
        className.setId(s.getClassId());
        ClassName c = classNameMapper.selectById(className);
        result.put("classGrade", s.getGradeName() + c.getName() + c.getRepeatIndex() + "班");
        return result;
    }

    public Object getMyselfT(SysUser sysUser) {
        return null;
    }

    public Object getMyOverviewT(SysUser sysUser) {
        return null;
    }

    public Object getMyOverview(SysUser sysUser) {
        Map<String, Object> result = new HashMap<>();
        Student student = new Student();
        student.setUserId(sysUser.getUserId());
        Student s = studentMapper.selectById(student);
        result.put("name", s.getName());
        result.put("studentNum", s.getStudentNum());
        ClassName className = new ClassName();
        className.setId(s.getClassId());
        ClassName c = classNameMapper.selectById(className);
        result.put("className", c.getName());
        result.put("grade", s.getGradeName());
        result.put("major", null);//todo 完成专业信息
        result.put("faculty", null);//todo 完成学院信息
        return result;
    }

    public Object saveMyOverviewT(SysUser sysUser, Map<String, Object> params) {
        return null;
    }

    public Object saveMyOverview(SysUser sysUser, Map<String, Object> params) throws Exception {
        Student student = new Student();
        student.setUserId(sysUser.getUserId());
        student.setName((String) params.get("name"));
        studentMapper.updateWithNameById(student);
        return null;
    }
}
