DROP DATABASE if exists `school`;
CREATE DATABASE IF NOT EXISTS school;
USE school;
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher`
(
    `t_id` INT(10) NOT NULL,
    `name` VARCHAR(10) NOT NULL,
    `password` VARCHAR(20) NOT NULL,
    PRIMARY KEY (t_id)
);

INSERT INTO teacher(t_id, name, password)  values (1,'765','66');

DROP TABLE IF EXISTS `lessons`;
CREATE TABLE IF NOT EXISTS `lessons`(
    `l_id` INT(10) NOT NULL,
    `name` VARCHAR(10) NOT NUll,
    PRIMARY KEY (l_id)
);

INSERT INTO lessons(l_id, name) values (1,'数据结构');
INSERT INTO lessons(l_id, name) values (2,'计算机网络');

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student`(
    `s_id` INT(10) NOT NULL,
    `name` VARCHAR(10) NOT NULL,
    `m_id` INT(20) NOT NULL,
    `phone` VARCHAR(11) NOT NULL ,
    PRIMARY KEY (s_id)
);

INSERT INTO student(s_id, name, m_id) VALUES (2020217866,'李紫康',1);

DROP TABLE IF EXISTS `take`;
CREATE TABLE IF NOT EXISTS `take`(
    `l_id` INT(10),
    `s_id` INT(10),
    `t_id` INT(10),
    foreign key (l_id) references lessons(l_id)
);

INSERT INTO take(l_id, s_id,t_id) VALUES (1,2020217866,1);
INSERT INTO take(l_id, s_id,t_id) VALUES (1,2020217866,2);


DROP TABLE IF EXISTS `major`;
CREATE TABLE IF NOT EXISTS `major`(
    `m_id` INT(10) PRIMARY KEY ,
    `name` VARCHAR(10)
);

INSERT INTO major(m_id, name) VALUES (2,'物流管理');
INSERT INTO major(m_id, name) VALUES (3,'计算机科学与技术');
INSERT INTO major(m_id, name) VALUES (4,'物联网工程');
INSERT INTO major(m_id, name) VALUES (5,'食品科学与技术');
INSERT INTO major(m_id, name) VALUES (6,'食品安全与技术');
INSERT INTO major(m_id, name) VALUES (7,'机械工程');
INSERT INTO major(m_id, name) VALUES (8,'电气及其自动化');
INSERT INTO major(m_id, name) VALUES (9,'英语');
INSERT INTO major(m_id, name) VALUES (10,'网络与新媒体');


DROP TABLE IF EXISTS `notice`;
CREATE TABLE IF NOT EXISTS `notice`(
    `n_id` INTEGER(20) PRIMARY KEY AUTO_INCREMENT,
    `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `comment` VARCHAR(50)
);
INSERT INTO notice(date,comment) VALUES ('2023-03-27','中国科学院院士吴奇教授来校作学术报告');
INSERT INTO notice(date,comment) VALUES ('2023-03-27','我校教授被授予“全国五一巾帼标兵”荣誉称号');
INSERT INTO notice(date,comment) VALUES ('2023-03-27','我校获评安徽省“节水型高校”荣誉称号');
INSERT INTO notice(date,comment) VALUES ('2023-03-25','全国高等学校建筑学专业教育评估专家组莅临我校评估考查');
INSERT INTO notice(date,comment) VALUES ('2023-03-24','全校党员干部学习贯彻党的二十大精神集中轮训班开班');
INSERT INTO notice(date,comment) VALUES ('2023-03-24','学校部署2023年全面从严治党工作');
INSERT INTO notice(date,comment) VALUES ('2023-03-24','学校获2022年“挑战杯”中国大学生创业计划竞赛金奖');
INSERT INTO notice(date,comment) VALUES ('2023-03-24','管理学院研究团队在智能制造运作优化领域取得新进展');


