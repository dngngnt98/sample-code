-- 데이터를 관리하기 위한 테이블
-- datafile
CREATE TABLE datafile(
    dfno int primary key auto_increment,
    bdno int not null,
    ori_file_name varchar(260) not null,
    save_file_name varchar(36) not null,
    df_date_time datetime,
    save_user_name varchar(30) not null,
    del_gb varchar(10) default 'N' not null
);
