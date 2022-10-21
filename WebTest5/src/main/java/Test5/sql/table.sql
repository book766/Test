create table student(
    stud_id int NOT NULL AUTO_INCREMENT COMMENT'学生学号',
    stud_name VARCHAR(10) NOT NULL COMMENT'学生姓名',
    stud_gender VARCHAR(3) NOT NULL COMMENT'学生性别',
    stud_address VARCHAR(200) NOT NULL COMMENT'学生地址',
    stud_phone VARCHAR(11) NOT NULL COMMENT'学生手机号',
    PRIMARY KEY (stud_id)
)ENGINE=INNODB AUTO_INCREMENT=100 COMMENT = '学生信息表';

create table user(
   user_id int NOT NULL AUTO_INCREMENT COMMENT'用户id',
   user_name VARCHAR(20) NOT NULL COMMENT'用户名称',
   user_password VARCHAR(20) NOT NULL COMMENT'用户密码',
   user_role VARCHAR(20) NOT NULL COMMENT'用户角色',
   PRIMARY KEY (user_id)
)ENGINE=INNODB AUTO_INCREMENT=200 COMMENT = '用户信息表';